package section14.method_referance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;


class PlainOld{
    private static int lat_id=1;

    private int id;

    public PlainOld() {
        this.id = PlainOld.lat_id++;
        System.out.println("Creating a PlainOld object: "+id);
    }
}

public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("Anna","Bob","Chuck","Dave"));
        list.forEach(System.out::println);

        calculator(Integer::sum, 10, 3);
        calculator(Double::sum, 10.7, 3.3);

        Supplier<PlainOld> references1 = PlainOld::new;

        PlainOld plainOld = references1.get();
        System.out.println("-----");
        PlainOld[] pojo1 = seedArray(PlainOld::new, 10);

        calculator((s1,s2)->s1+s2, "Hello ", "World");
        calculator(String::concat, "Hello ", "World");

        BinaryOperator<String> b1 = String::concat;
        BiFunction<String, String, String> b2 = String::concat;
        UnaryOperator<String> u1 = String::toUpperCase;

        System.out.println(b1.apply("Hello ", "World"));
        System.out.println(b2.apply("Hello ", "World"));
        System.out.println(u1.apply("Hello "));

        String result = "Hello".transform(u1);
        System.out.println("Result = "+result);

        result = result.transform(String::toLowerCase);
        System.out.println("Result = "+result);

        Function<String, Boolean> f0 = String::isEmpty;
        boolean resultBoolean = result.transform(f0);
        System.out.println("Result = "+resultBoolean);



    }

    private static <T> void calculator(BinaryOperator<T> finction, T value1, T value2){
        T result = finction.apply(value1, value2);
        System.out.println("Result of operation: "+result);
    }

    private static PlainOld[] seedArray(Supplier<PlainOld> references, int count){
        PlainOld[] array = new PlainOld[count];
        Arrays.setAll(array, i->references.get());
        return array;
    }
}
