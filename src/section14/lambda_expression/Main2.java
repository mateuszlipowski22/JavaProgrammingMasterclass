package section14.lambda_expression;

import java.util.*;

public class Main2 {

    private static Random random = new Random();

    public static void main(String[] args) {

        String[] names = {"Anna", "Bob", "Carole", "David", "Ed", "Fred", "Gary"};
        Arrays.setAll(names, i -> names[i].toUpperCase());
        System.out.println(Arrays.toString(names));

        List<String> backedByArray = Arrays.asList(names);
        backedByArray.replaceAll(s -> s.toUpperCase(Locale.ROOT));
        System.out.println(backedByArray.toString());

        backedByArray.replaceAll(s->s+= " "+getRandomChar('A', 'D'));
        System.out.println(Arrays.toString(names));

        backedByArray.replaceAll(s->s+= " "+getReversedName(s.split(" ")[0]));
        Arrays.asList(names).forEach(s-> System.out.println(s));

        List<String> newList = new ArrayList<>(List.of(names));
        newList.removeIf(s->s.substring(0, s.indexOf(" ")).equals(s.substring(s.lastIndexOf(" ")+1)));
        newList.forEach(s-> System.out.println(s));

    }

    public static char getRandomChar(char startChar, char endChar){
        return (char) random.nextInt((int) startChar, (int) endChar+1);
    }

    private static String getReversedName(String name){
        return new StringBuilder(name).reverse().toString();
    }

}
