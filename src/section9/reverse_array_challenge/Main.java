package section9.reverse_array_challenge;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int[] array = getRandomArray(10);
        System.out.println("Arrays.toString(array) = " + Arrays.toString(array));
        reverseArrayVoid(array);
        int[] reversedArray = reverseArray(array);
        System.out.println("Arrays.toString(array) = " + Arrays.toString(array));

    }

    public static int[] reverseArray(int[] arrayToReverse) {
        int[] reversedArray = new int[arrayToReverse.length];

        for (int i = 0; i < arrayToReverse.length; i++) {
            reversedArray[i] = arrayToReverse[arrayToReverse.length - 1 - i];
        }
        return reversedArray;
    }

    private static int[] getRandomArray(int length) {
        Random random = new Random();
        int[] array = new int[length];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }

    private static void reverseArrayVoid(int[] array) {
        int maxIndex = array.length-1;
        int halfLength = maxIndex/2;

        for (int i = 0; i < halfLength; i++) {
            int temp = array[i];
            array[i]=array[array.length-1-i];
            array[array.length-1-i]=temp;
            System.out.println(Arrays.toString(array));
        }

    }

}
