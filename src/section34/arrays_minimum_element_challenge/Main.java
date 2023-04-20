package section34.arrays_minimum_element_challenge;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter array size\r");
        int count = scanner.nextInt();
        int[] input = readIntegers(count);
        System.out.println("findMin(input) = " + findMin(input));
    }

    public static int[] readIntegers(int count){
        System.out.println("Enter "+count+" integer values\r");

        int[] values = new int[count];

        for (int i=0; i<values.length;i++){
            values[i]=scanner.nextInt();
        }

        return values;
    }

    public static int findMin(int[] array){
        int min=array[0];

        for (int i=1;i<array.length;i++){
            if(array[i]<min){
                min=array[i];
            }
        }

//        return Arrays.stream(array).min().orElseThrow(NullPointerException::new);
        return min;
    }
}
