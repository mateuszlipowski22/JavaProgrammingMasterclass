package section34.autoboxing_unboxing;

import java.util.ArrayList;

class IntClass{
    private int myInt;

    public IntClass(int myInt) {
        this.myInt = myInt;
    }

    public int getMyInt() {
        return myInt;
    }

    public void setMyInt(int myInt) {
        this.myInt = myInt;
    }
}

public class Main {

    public static void main(String[] args) {
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Mateusz");

//        ArrayList<int> intArrayList = new ArrayList<int>();

        ArrayList<IntClass> intMyArrayList = new ArrayList<>();
        intMyArrayList.add(new IntClass(55));

//        Integer integerValue = new Integer(54);
//        Double doubleValue = new Double(12.22);

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            intArrayList.add(Integer.valueOf(i));
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(i+" -> "+intArrayList.get(i).intValue());
        }


        Integer IntValue = 55; // Integer.valueOf(55);
        int myInt = IntValue.intValue();


        ArrayList<Double> myDoubleValues = new ArrayList<>();

        for (double dbl = 0.0; dbl < 10.0; dbl+=0.5) {
            myDoubleValues.add(Double.valueOf(dbl));
        }

        for (int i = 0; i < myDoubleValues.size(); i++) {
            System.out.println("i -> " + myDoubleValues.get(i).doubleValue());
        }
    }
}
