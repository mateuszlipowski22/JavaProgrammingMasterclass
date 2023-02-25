package section16.adventureRun;

import java.io.*;
import java.util.*;

public class Locations implements Map<Integer, Location> {

    private static Map<Integer, Location> locations = new LinkedHashMap<>();
    private static Map<Integer, IndexRecord> index = new LinkedHashMap<>();
    private static RandomAccessFile ra;

    public static void main(String[] args) throws IOException {

        try (RandomAccessFile rao = new RandomAccessFile("locations_rand.dat", "rwd")) {
            rao.writeInt(locations.size());
            int indexSize = locations.size()*3*Integer.BYTES;
            int locationStart=(int) (indexSize+rao.getFilePointer()+Integer.BYTES);
            rao.writeInt(locationStart);

            long indexStart = rao.getFilePointer();

            int startPointer=locationStart;
            rao.seek(startPointer);

            for (Location location : locations.values()){
                rao.writeInt(location.getLocationID());
                rao.writeUTF(location.getDescription());
                StringBuilder builder = new StringBuilder();
                for(String direction : location.getExits().keySet()){
                    if(!direction.equalsIgnoreCase("Q")){
                        builder.append(direction);
                        builder.append(",");
                        builder.append(location.getExits().get(direction));
                        builder.append(",");
                    }
                }
                rao.writeUTF(builder.toString());
                IndexRecord indexRecord=new IndexRecord(startPointer, (int) (rao.getFilePointer()-startPointer));
                index.put(location.getLocationID(),indexRecord);

                startPointer=(int) rao.getFilePointer();
            }

            rao.seek(indexStart);
            for(Integer locationID : index.keySet()){
                rao.writeInt(locationID);
                rao.writeInt(index.get(locationID).getStartByte());
                rao.writeInt(index.get(locationID).getLength());
            }
        }

//        try (DataOutputStream locFile = new DataOutputStream(new BufferedOutputStream(new FileOutputStream( "location.dat")))) {
//            for(Location location : locations.values()){
//                locFile.writeInt(location.getLocationID());
//                locFile.writeUTF(location.getDescription());
//                System.out.println("Writing location " + location.getLocationID() + " : " + location.getDescription());
//                System.out.println("Writing " + (location.getExits().size()-1) + " exits." );
//                locFile.writeInt(location.getExits().size()-1);
//                for (String direction : location.getExits().keySet()){
//                    if(!direction.equalsIgnoreCase("Q")){
//                        System.out.println("\t\t" + direction + "," + location.getExits().get(direction));
//                        locFile.writeUTF(direction);
//                        locFile.writeInt(location.getExits().get(direction));
//
//                    }
//                }
//            }
//        }


    }

    static {

        try{
            ra=new RandomAccessFile("locations_rand.dat","rwd");
            int numLocations = ra.readInt();
            long locationStarterPoint = ra.readInt();

            while (ra.getFilePointer()<locationStarterPoint){
                int locationID= ra.readInt();
                int locationStart=ra.readInt();
                int locationLength= ra.readInt();

                IndexRecord record = new IndexRecord(locationStart,locationLength);
                index.put(locationID, record);
            }


        }catch (IOException e){
            System.out.println("IOException in static initiazer: "+e.getMessage());
        }


//        try (ObjectInputStream locFile = new ObjectInputStream(new BufferedInputStream(new FileInputStream("locations2.dat")))) {
//            boolean eof = false;
//            while (!eof) {
//                try {
//                    Location location = (Location) locFile.readObject();
//                    System.out.println("Read location " + location.getLocationID() + " : " + location.getDescription());
//                    System.out.println("Found " + location.getExits().size() + " exits");
//                    locations.put(location.getLocationID(), location);
//                } catch (EOFException ef) {
//                    eof = true;
//                }
//            }
//        } catch (InvalidClassException i){
//            System.out.println("InvalidClassException "+i.getMessage());
//        }catch (IOException io) {
//            System.out.println("IO exception "+io.getMessage());
//        }catch (ClassNotFoundException e) {
//            System.out.println("ClassNotFoundException "+e.getMessage());
//        }



//            boolean eof = false;
//            while (!eof) {
//                try {
//                    Map<String, Integer> exits = new LinkedHashMap<>();
//                    int locID = locFile.readInt();
//                    String description = locFile.readUTF();
//                    int numExits = locFile.readInt();
//                    System.out.println("Read location " + locID + " : " + description);
//                    System.out.println("Found " + numExits + " exits");
//                    for (int i = 0; i < numExits; i++) {
//                        String direction = locFile.readUTF();
//                        int destination = locFile.readInt();
//                        exits.put(direction, destination);
//                        System.out.println("\t\t" + direction + "," + destination);
//                    }
//                    locations.put(locID, new Location(locID, description, exits));
//                } catch (EOFException ef) {
//                    eof = true;
//                }
//        }
//    } catch(
//    IOException io)
//    {
//        System.out.println("IO exception");
//    }


//        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader("locations_big.txt")))) {
//                scanner.useDelimiter(",");
//                while(scanner.hasNextLine())
//            {
//                int loc = scanner.nextInt();
//                scanner.skip(scanner.delimiter());
//                String description = scanner.nextLine();
//                System.out.println("Imported loc: " + loc + ": " + description);
//                Map<String, Integer> tempExit = new HashMap<>();
//                locations.put(loc, new Location(loc, description, tempExit));
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        try (BufferedReader dirFile = new BufferedReader(new FileReader("directions_big.txt"))){
//            String input;
//            while ((input = dirFile.readLine())!=null) {
//                String[] data = input.split(",");
//                int loc = Integer.parseInt(data[0]);
//                String direction = data[1];
//                int destination = Integer.parseInt(data[2]);
//
//                System.out.println(loc + ": " + direction + ": " + destination);
//                Location location = locations.get(loc);
//                location.addExit(direction, destination);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }



    }

    public Location getLocation(int locationID) throws IOException {
        IndexRecord record = index.get(locationID);
        ra.seek(record.getStartByte());
        int id= ra.readInt();
        String description = ra.readUTF();
        String exits = ra.readUTF();
        String[] exitPart = exits.split(",");

        Location location =new Location(locationID,description, null);
        if(locationID!=0){
            for(int i=0; i<exitPart.length ; i++){
                System.out.println("exitPart[i] =" +exitPart[i]);
                System.out.println("exitPart[i+1] =" +exitPart[i+1]);
                String direction = exitPart[i];
                int destination = Integer.parseInt(exitPart[++i]);
                location.addExit(direction, destination);
            }
        }
        return location;
    }

    @Override
    public int size() {
        return locations.size();
    }

    @Override
    public boolean isEmpty() {
        return locations.isEmpty();
    }

    @Override
    public boolean containsKey(Object o) {
        return locations.containsKey(o);
    }

    @Override
    public boolean containsValue(Object o) {
        return locations.containsValue(o);
    }

    @Override
    public Location get(Object key) {
        return locations.get(key);
    }

    @Override
    public Location put(Integer integer, Location location) {
        return locations.put(integer, location);
    }

    @Override
    public Location remove(Object o) {
        return locations.remove(o);
    }

    @Override
    public void putAll(Map<? extends Integer, ? extends Location> map) {

    }

    @Override
    public void clear() {
        locations.clear();
    }

    @Override
    public Set<Integer> keySet() {
        return locations.keySet();
    }

    @Override
    public Collection<Location> values() {
        return locations.values();
    }

    @Override
    public Set<Entry<Integer, Location>> entrySet() {
        return locations.entrySet();
    }

    public void close() throws IOException {
        ra.close();
    }
}
