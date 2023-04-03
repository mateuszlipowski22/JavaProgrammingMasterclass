package section14.lambda_expression;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(List.of(
                "alpha", "bravo", "charlie", "delta"));

        for (String s : list){
            System.out.println(s);
        }

        System.out.println("--------------");

        list.forEach(s-> System.out.println(s));

        System.out.println("--------------");
        String prefix = "nato";
        list.forEach(myString ->{
            char first = myString.charAt(0);
            System.out.printf("%s %s means %s",prefix , myString, first);
            System.out.println();
        });

    }

}
