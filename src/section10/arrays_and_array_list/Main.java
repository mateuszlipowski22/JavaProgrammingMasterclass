package section10.arrays_and_array_list;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        String[] originalArray = new String[]{"first", "second", "third"};
        var originalList = Arrays.asList(originalArray);

        originalList.set(0, "one");
        System.out.println(originalList);
        System.out.println(Arrays.toString(originalArray));

        originalList.sort(Comparator.reverseOrder());
        System.out.println(Arrays.toString(originalArray));

//        originalList.remove(1);

        List<String> newList = Arrays.asList("Monday", "Tuesday", "Wednesday");
        System.out.println(newList);

    }

}
