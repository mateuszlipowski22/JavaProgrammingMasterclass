package section10.array_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MoreLists {

    public static void main(String[] args) {
        String[] items = {"apples", "bananas", "milk", "eggs"};

        List<String> list = List.of(items);
        System.out.println(list);
//        System.out.println(list.getClass().getName());
//        list.add("yougurt");
        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("yougurt");
        System.out.println(groceries);

        ArrayList<String> nextList = new ArrayList<>(List.of("pickles", "mustard", "cheese"));
        System.out.println(nextList);

        groceries.addAll(nextList);
        System.out.println(groceries);

        System.out.println("Third element = " + groceries.get(2));

        if(groceries.contains("mustard")){
            System.out.println("List contains mustard");
        }

        groceries.add("yougurt");
        System.out.println("groceries.indexOf(\"yougurt\") = " + groceries.indexOf("yougurt"));
        System.out.println("groceries.lastIndexOf(\"yougurt\") = " + groceries.lastIndexOf("yougurt"));

        System.out.println(groceries);
        groceries.remove(1);
        System.out.println(groceries);
        groceries.remove("yougurt");
        System.out.println(groceries);

        groceries.removeAll(List.of("apples","milk"));
        System.out.println(groceries);

        groceries.retainAll(List.of("apples", "milk", "mustard", "cheese"));
        System.out.println(groceries);

        groceries.clear();
        System.out.println(groceries);
        System.out.println("isEmpty = "+ groceries.isEmpty());

        groceries.addAll(List.of("apples", "milk", "mustard", "cheese"));
        groceries.addAll(Arrays.asList("pickles", "mustard", "cheese"));

        System.out.println(groceries);
        groceries.sort(Comparator.naturalOrder());
        System.out.println(groceries);

        groceries.sort(Comparator.reverseOrder());
        System.out.println(groceries);

        var groceryArray = groceries.toArray(new String[groceries.size()]);
        System.out.println(Arrays.toString(groceryArray));
    }

}
