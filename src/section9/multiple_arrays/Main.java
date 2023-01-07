package section9.multiple_arrays;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[][] array2 = new int[4][4];

        System.out.println("Arrays.toString(array2) = " + Arrays.toString(array2));

        for (int[] outer : array2) {
            System.out.println(Arrays.toString(outer));
        }

        for (int i = 0; i < array2.length; i++) {
            var innerArray = array2[i];
            for (int j = 0; j < innerArray.length; j++) {
//                System.out.print(array2[i][j]+" ");
                array2[i][j] = i * 10 + j;
            }
//            System.out.println();
        }

//        for(var outer : array2){
//            for( var inner : outer){
//                System.out.print(inner + " ");
//            }
//            System.out.println();
//        }

        System.out.println(Arrays.deepToString(array2));
        array2[1] = new int[]{1, 2, 3};
        System.out.println(Arrays.deepToString(array2));

        Object[] anyArray = new Object[3];
        System.out.println(Arrays.toString(anyArray));
        anyArray[0] = new String[]{"a", "b", "c"};
        System.out.println(Arrays.toString(anyArray));

        anyArray[1] = new String[][]{
                {"1", "2"},
                {"3", "4", "5"},
                {"5", "6", "7", "8"},
        };
        System.out.println(Arrays.deepToString(anyArray));

        anyArray[2] = new int[2][2][2];
        System.out.println(Arrays.deepToString(anyArray));

        for(Object object : anyArray){
            System.out.println("object.getClass().getSimpleName() = " + object.getClass().getSimpleName());
            System.out.println("object.toString() = " + object);
            System.out.println("Arrays.deepToString(object) = " + Arrays.deepToString((Object[]) object));
        }
    }

}
