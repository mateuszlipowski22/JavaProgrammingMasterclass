package section9.minimum_element_challenge;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] userArray = readIntegers();
        System.out.println("Arrays.toString(userArray) = " + Arrays.toString(userArray));
        System.out.println("findMin(userArray) = " + findMin(userArray));

    }

    public static int[] readIntegers(){
        Scanner scanner=new Scanner(System.in);
        String[] stringArray = scanner.nextLine().split(",");
        int[] result=new int[stringArray.length];
        for (int i=0; i<result.length ; i++) {
            result[i]=Integer.parseInt(stringArray[i]);
        };
        return result;
    }

    public static int findMin(int[] array){

        return Arrays.stream(array).min().getAsInt();
//        Arrays.sort(array);
//        return array[0];
    }
}
