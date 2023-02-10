package section11.abstract_class_challenge_update;

public class ArtObject extends ProductForSale{


    public ArtObject(String oil_painting, int i, String s) {
        super(oil_painting,i, s);
    }

    @Override
    public void showDetails() {

        System.out.println( "This "+type+" is a beautiful reproduction");
        System.out.printf("The price of the pieces is $%6.2f %n", price);
        System.out.println(description);

    }
}
