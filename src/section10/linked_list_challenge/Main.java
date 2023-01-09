package section10.linked_list_challenge;

import java.util.*;

record Town(String name, int distance) {

    @Override
    public String toString() {
        return String.format("%s (%d)", name, distance);
    }
}


public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        LinkedList<Town> list = getList();
        ListIterator<Town> iterator = list.listIterator();

        boolean flag = true;
        printMenu();
        while (flag){
            switch (scanner.nextLine().toUpperCase()){
                case "F","FORWARD"->{
                    if(iterator.hasNext()){
                        iterator.next();
                    }
                }
                case "B","BACKWARD"->{
                    if(iterator.hasPrevious()){
                        iterator.previous();
                    }
                }
                case "L","LIST PLACES"->{
                    System.out.println(list);
                }
                case "Q","QUIT"->{
                    flag=false;
                }
            }
            printMenu();
        }

    }

    public static void printMenu(){
        System.out.print("""
                    Available actions (select word or letter)
                    (F)orward
                    (B)ackward
                    (L)ist Places
                    (M)enu
                    (Q)uit""");
    }

    public static LinkedList<Town> getList(){
        LinkedList<Town> towns= new LinkedList<>();
        towns.add(new Town("Sydney", 0));
        towns.add(new Town("Adelaide", 1374));
        towns.add(new Town("Alice Springs", 2771));
        towns.add(new Town("Brisbarne", 917));
        towns.add(new Town("Darwin", 3972));
        towns.add(new Town("Melbourne", 877));
        towns.add(new Town("Perth", 3923));
        towns.sort(Comparator.comparingInt(Town::distance));
        return towns;
    }

    public static void addPlaces(LinkedList<Town> list, Town town){
        if(list.contains(town)){
            System.out.println("Found duplicates: " + town);
            return;
        }

        for (Town t : list){
            if(t.name().equalsIgnoreCase(t.name())){
                System.out.println("Found duplicates: " + town);
                return;
            }
        }

        int matchedIndex = 0;
        for(var listPlace : list){
            if(town.distance()<listPlace.distance()){
                list.add(matchedIndex, town);
                return;
            }
            matchedIndex++;
        }

        list.add(town);
    }
}

