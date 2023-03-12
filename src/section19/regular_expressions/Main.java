package section19.regular_expressions;

public class Main {

    public static void main(String[] args) {

        String string = "I am a string. Yes, I am";
        System.out.println(string);
        String yourString = string.replaceAll("I", "You");
        System.out.println(yourString);

        String alphanumeric = "abdDeeeF12Ghhiiiijkl99z";
        System.out.println(alphanumeric.replaceAll(".", "Y"));

        System.out.println(alphanumeric.replaceAll("^abdDeee", "YYY"));

        String secondString = "abdDeeeF12GhhiabdDeeeiiijkl99z";
        System.out.println(secondString.replaceAll("^abdDeee", "YYY"));

        System.out.println(alphanumeric.matches("^hello"));
        System.out.println(alphanumeric.matches("^abdDeee"));
        System.out.println(alphanumeric.matches("abdDeeeF12GhhiabdDeeeiiijkl99"));
        System.out.println(alphanumeric.replaceAll("iijkl99z$","THE END"));
        System.out.println(alphanumeric.replaceAll("[aei]","X"));
        System.out.println(alphanumeric.replaceAll("[aei]","I replace a letter here"));
        System.out.println(alphanumeric.replaceAll("[aei][Fj]","X"));

    }

}
