package section9.var_args;

public class Main {

    public static void main(String... args) {
        System.out.println("Hello world");

        String[] splitStrings = "Hello world again".split(" ");
        printText(splitStrings);

        System.out.println("_".repeat(20));
        printText("Hello");
        printText("hello", "world", "again");
        printText();

        String[] sArray = {"first", "second","third","fourth","fifth"};
        System.out.println(String.join(",", sArray));

    }

    public static void printText(String... textList){
        for (String s : textList) {
            System.out.println(s);
        }
    }

}
