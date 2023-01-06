package section9.using_arrays;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] firstArray = getRandomArray(10);
        System.out.println(Arrays.toString(firstArray));
        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));

        int[] secondArray = new int[10];
        System.out.println(Arrays.toString(secondArray));
        Arrays.fill(secondArray, 4);
        System.out.println(Arrays.toString(secondArray));


        int[] thirdArray = getRandomArray(10);
        System.out.println(Arrays.toString(thirdArray));
        int[] fourthArray = Arrays.copyOf(thirdArray, thirdArray.length);
        System.out.println(Arrays.toString(fourthArray));

        Arrays.sort(fourthArray);
        System.out.println(Arrays.toString(thirdArray));
        System.out.println(Arrays.toString(fourthArray));

        int[] smallerArray =  Arrays.copyOf(thirdArray, 5);
        System.out.println(Arrays.toString(smallerArray));

        int[] biggerArray =  Arrays.copyOf(thirdArray, 20);
        System.out.println(Arrays.toString(biggerArray));

    }

    private static int[] getRandomArray(int length){
        Random random = new Random();
        int[] array = new int[length];

        for (int i =0; i< array.length; i++) {
            array[i]=random.nextInt(100);
        }
        return array;
    }
}
