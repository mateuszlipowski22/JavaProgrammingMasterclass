package section11.abstract_class_challenge_update;

public class Furniture extends ProductForSale{


    public Furniture(String oil_painting, int i, String s) {
        super(oil_painting,i, s);
    }

    @Override
    public void showDetails() {

        System.out.println( "This "+type+" was manufactured in south caroline");
        System.out.printf("The price of the pieces is $%6.2f %n", price);
        System.out.println(description);

    }
}
