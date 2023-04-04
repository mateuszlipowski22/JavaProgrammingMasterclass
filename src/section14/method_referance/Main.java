package section14.method_referance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;


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
