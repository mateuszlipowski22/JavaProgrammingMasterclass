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


        String[] sArray = {"Abel","David","Jane", "Ralph", "Mark"};
        Arrays.sort(sArray);
        System.out.println("Arrays.toString(sArray) = " + Arrays.toString(sArray));

        if(Arrays.binarySearch(sArray, "Mark")>=0){
            System.out.println("Found Mark in the list");
        }

        int[] s1 = {1,2,3,4,5};
        int[] s2 = {5,2,3,4,1};

        if(Arrays.equals(s1, s2)){
            System.out.println("Arrays are equal");
        }else {
            System.out.println("Arrays are not equal");
        }

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
