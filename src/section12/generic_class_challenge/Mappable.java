package section12.generic_class_challenge;

import java.util.Arrays;

public interface Mappable {

    void render();

    static double[] stringToLatLot(String location){
        var splits  = location.split(",");
        double lat = Double.valueOf(splits[0]);
        double lot = Double.valueOf(splits[0]);
        return new double[]{lat, lot};
    }
}

abstract class Point implements Mappable{

    private double[] location = new double[2];

    public Point(String location) {
        this.location = Mappable.stringToLatLot(location);
    }

    @Override
    public void render() {
        System.out.println("Render "+this+ " as POINT ("+location()+")");
    }

    private String location(){
        return Arrays.toString(location);
    }
}


abstract class Line implements Mappable{

    private double[][] locations;

    public Line(String... locations){
        this.locations=new double[locations.length][];
        int index = 0;
        for (var l : locations){
            this.locations[index++]=Mappable.stringToLatLot(l);
        }
    }

    @Override
    public void render() {
        System.out.println("Render "+this+ " as LINE ("+locations()+")");
    }

    private String locations(){
        return Arrays.deepToString(locations);
    }
}