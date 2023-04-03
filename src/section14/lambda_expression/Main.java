package section14.lambda_expression;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

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

        int result = calculator((a,b)->a+b, 2, 5);
        Double result2 = calculator((a,b)->a/b, 10.0, 2.5);
        String result3 = calculator(
                (a,b)->a.toUpperCase(Locale.ROOT) +" "+ b.toUpperCase(), "Dolph", "Lundgren");

    }

    public static <T> T calculator(Operation<T> function, T value1, T value2){

        T result = function.operate(value1, value2);
        System.out.println("Result of operation: "+result);
        return result;
    }

}
