package section9.array_challenge;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int[] array = getRandomArray(10);
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        int[] reverseArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reverseArray[reverseArray.length-1-i]=array[i];
        }
        
        System.out.println(Arrays.toString(reverseArray));

        sortIntegers(getRandomArray(5));

    }

    private static int[] getRandomArray(int length){
        Random random = new Random();
        int[] array = new int[length];

        for (int i =0; i< array.length; i++) {
            array[i]=random.nextInt(100);
        }
        return array;
    }

    private static int[] sortIntegers(int[] array){
        System.out.println(Arrays.toString(array));
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag=true;
        int temp;
        while (flag){
            flag = false;
            for (int i = 0; i < sortedArray.length-1; i++) {
                if(sortedArray[i]<sortedArray[i+1]){
                    temp=sortedArray[i];
                    sortedArray[i]=sortedArray[i+1];
                    sortedArray[i+1]=temp;
                    flag=true;
                    System.out.println("------>"+Arrays.toString(sortedArray));
                }
            }
            System.out.println("--->"+Arrays.toString(sortedArray));

        }
        return sortedArray;
    }
}
