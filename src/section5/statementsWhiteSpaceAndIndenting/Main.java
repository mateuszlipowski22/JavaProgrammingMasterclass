package section5.statementsWhiteSpaceAndIndenting;

public class Main {

    public static void main(String[] args) {

        int myVariable = 50;

        myVariable++;
        myVariable--;

        System.out.println("This is a test");

        System.out.println("Tis is" +
                " another" +
                " still more.");

        int anotherVariable = 50;
        myVariable--;
        System.out.println(myVariable);

        if(myVariable == 0){
            System.out.println("It is now zero");
        }

    }

}
