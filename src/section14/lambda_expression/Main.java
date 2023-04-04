package section14.lambda_expression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;

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

        var coords = new ArrayList<>(List.of(
                new double[]{47.2160, -95.2348},
                new double[]{29.1566, -89.2495},
                new double[]{35.1556, -90.0659}));

        coords.forEach(s-> System.out.println(Arrays.toString(s)));

        BiConsumer<Double,Double> p1 = (lat, lng)->
                System.out.printf("[lat:%.3f lon:%.3f]%n", lat, lng);

        var firstPoint = coords.get(0);
        processPoint(firstPoint[0], firstPoint[1], p1);

        System.out.println("--------------");

        coords.forEach(s->processPoint(s[0], s[1], p1));
        coords.forEach(s->processPoint(s[0], s[1], (lat, lng)->
                System.out.printf("[lat:%.3f lon:%.3f]%n", lat, lng)));

        list.removeIf(s->s.equalsIgnoreCase("bravo"));
        list.forEach(System.out::println);

        list.addAll(List.of("easy", "echo", "earnest"));
        list.forEach(System.out::println);
        System.out.println("------");
        list.removeIf(s->s.startsWith("ea"));
        list.forEach(System.out::println);

    }

    public static <T> T calculator(BinaryOperator<T> function, T value1, T value2){

        T result = function.apply(value1, value2);
        System.out.println("Result of operation: "+result);
        return result;
    }

    public static <T> void processPoint(T t1, T t2, BiConsumer<T,T> consumer){
        consumer.accept(t1,t2);
    }
}
