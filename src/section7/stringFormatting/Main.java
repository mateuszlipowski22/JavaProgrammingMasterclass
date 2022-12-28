package section7.stringFormatting;

public class Main {

    public static void main(String[] args) {
        String bulletTi = "Print a bulleted List:\n" +
                "\t\u2022 First point\n" +
                "\t\t\u2022 Sub point";

        System.out.println("bulletTi = " + bulletTi);

        String textBlock= """
                Print a bulleted list
                    \u2022 First point
                        \u2022 Sub point""";
        System.out.println(textBlock);

        int age = 35;
        System.out.printf("Your age is %d%n", age);

        int yearsOfBirth = 2023 - age;
        System.out.printf("Age = %d, Birth year = %d", age, yearsOfBirth);

        System.out.printf("Your age is %f.2%n", (float) age);

        for (int i = 1; i <=100000 ; i*=10) {
            System.out.printf("Printing %6d %n", i);
        }

        String formattedString = String.format("Your age is %d", age);
        System.out.println(formattedString);
        formattedString="Your age is %d".formatted(age);
        System.out.println(formattedString);

    }

}
