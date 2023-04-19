package section34.arrays_challenge_sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        printArray(myIntegers);
        int[] sortedArray = sortArray(myIntegers);
        printArray(sortedArray);
        printArray(myIntegers);

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

    public static int[] sortArray(int[] array){
        int[] sortedArray = Arrays.copyOf(array, array.length);
        int tmp;
//        for(int i=0; i<sortedArray.length;i++){
//            for(int j=i; j<sortedArray.length;j++){
//                if(sortedArray[i]<sortedArray[j]){
//                    tmp=sortedArray[i];
//                    sortedArray[i]=sortedArray[j];
//                    sortedArray[j]=tmp;
//                }
//            }
//        }
        boolean flag=true;
        while(flag){
            flag=false;
            for (int i=0;i<sortedArray.length-1;i++){
                if(sortedArray[i]<sortedArray[i+1]){
                    tmp=sortedArray[i];
                    sortedArray[i]=sortedArray[i+1];
                    sortedArray[i+1]=tmp;
                    flag=true;
                }
            }
        }
        return sortedArray;
    }

}
