package section34.arrays;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

//        int[] myIntArray=new int[20];
////        int[] myIntArray = {1,2,3,4,5,6,7,8,9,10};
////        myIntArray[5] = 50;
////        myIntArray[0] = 45;
////        myIntArray[1] = 456;
//        for(int i=0;i<myIntArray.length;i++){
//            myIntArray[i]=i*10;
//        }
//
////        double[] myDoubleArray = new double[10];
////        System.out.println(myDoubleArray[5]);
//        System.out.println(Arrays.toString(myIntArray));
//
//        printArray(myIntArray);
        int[] myIntegers = getIntegers(5);
        printArray(myIntegers);
        System.out.println("Average is "+gerAverage(myIntegers));


    }

    public static void printArray(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.println("Element "+i+", value is "+array[i]);
        }
    }

    public static int[] getIntegers(int number){
        System.out.println("Enter "+number+" integer values\r");

        int[] values = new int[number];

        for (int i=0; i<values.length;i++){
            values[i]=scanner.nextInt();
        }

        return values;
    }

    public static double gerAverage(int[] array){
        int sum = 0;
        for(int i=0; i<array.length;i++){
            sum+=array[i];
        }
        return (double) sum/array.length;
    }
}
