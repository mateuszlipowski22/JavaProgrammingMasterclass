package section11.interface_challenge_update;

enum UserType{ENTERTAINMENT, GOVERNMENT, RESIDENTIAL, SPORTS}

public class Building implements Mappable{

    private String name;

    private UserType usage;

    public Building(String name, UserType usage){
        this.name=name;
        this.usage=usage;
    }

    @Override
    public String getLabel() {
        return name + " ("+usage+")";
    }

    @Override
    public Geometry getShape() {
        return Geometry.POINT;
    }

    @Override
    public String getMarker() {
        return switch (usage){
            case ENTERTAINMENT -> Color.GREEN+" "+PointMarker.TRIANGLE;
            case GOVERNMENT -> Color.RED+" "+PointMarker.STAR;
            case RESIDENTIAL -> Color.BLUE+" "+PointMarker.SQUARE;
            case SPORTS -> Color.ORANGE+" "+PointMarker.PUSH_PIN;
            default -> Color.BLACK + " "+PointMarker.CIRCLE;
        };
    }

    @Override
    public String toJSON() {
        return Mappable.super.toJSON() + """
                ,"name": "%s", "usage": "%s" """.formatted(name,usage);
    }
}
