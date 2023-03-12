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

        System.out.println("harry".replaceAll("[Hh]arry","Harry"));

        String newAlphanumeric = "abdDeeeF12Ghhiiiijkl99z";
        System.out.println(newAlphanumeric.replaceAll("[^ej]", "X"));
        System.out.println(newAlphanumeric.replaceAll("[abcdef345678]", "X"));
        System.out.println(newAlphanumeric.replaceAll("[a-f3-8]", "X"));
        System.out.println(newAlphanumeric.replaceAll("[^a-f3-8]", "X"));
        System.out.println(newAlphanumeric.replaceAll("[a-fA-F3-8]", "X"));
        System.out.println(newAlphanumeric.replaceAll("(?i)[a-f3-8]", "X"));
        System.out.println(newAlphanumeric.replaceAll("[0-9]", "X"));
        System.out.println(newAlphanumeric.replaceAll("\\d", "X"));
        System.out.println(newAlphanumeric.replaceAll("\\D", "X"));

        String hasWhitespace = "I have blanks\ta tab, and also a new line\n";
        System.out.println(hasWhitespace);
        System.out.println(hasWhitespace.replaceAll("\\s", ""));
        System.out.println(hasWhitespace.replaceAll("\t", "X"));
        System.out.println("------");
        System.out.println(hasWhitespace.replaceAll("\\S", ""));
        System.out.println("------");
        System.out.println(newAlphanumeric.replaceAll("\\w", "X"));
        System.out.println(hasWhitespace.replaceAll("\\w", "X"));
        System.out.println(hasWhitespace.replaceAll("\\b", "X"));

    }

}
