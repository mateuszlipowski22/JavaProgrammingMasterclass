package section34.reverse_array_challenge;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        printArray(myIntegers);
        reverse(myIntegers);
        printArray(myIntegers);
    }

    public static void reverse(int[] array){
        int maxArrayIndex=array.length-1;
        for(int i=0;i<array.length/2;i++){
            int temp = array[i];
            array[i] = array[maxArrayIndex-i];
            array[array.length-1-i]=temp;
        }
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
}
