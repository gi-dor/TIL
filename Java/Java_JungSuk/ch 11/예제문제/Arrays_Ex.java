package day18.예제문제;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Arrays_Ex {
    public static void main(String[] args) {
        int[] arr = {0,1,3,5,2,4,6,9,10};
        int[][] arr2 = {{11,6,21},{27,17,19}};

        // 배열 출력 toString()
        System.out.println("arr = "+ Arrays.toString(arr));
        System.out.println("arr2 = "+ Arrays.toString(arr2));
        System.out.println("arr2 = "+ Arrays.deepToString(arr2));

        // 배열 복사 copyOf()

        int[] arr3 =  Arrays.copyOf(arr,arr.length);
        int[] arr4 = Arrays.copyOf(arr,3);
        int[] arr5 = Arrays.copyOfRange(arr,2,4);
        int[] arr6 = Arrays.copyOfRange(arr,0,7);

        System.out.println("arr3 = " +Arrays.toString(arr3) );
        System.out.println("arr4 = " +Arrays.toString(arr4) );
        System.out.println("arr5 = " +Arrays.toString(arr5) );
        System.out.println("arr6 = " +Arrays.toString(arr6) );
        
        int[] arr7 = new int[6];
        Arrays.fill(arr7,10);
        System.out.println("arr7 = " + Arrays.toString(arr7));

        Arrays.setAll(arr7,(i)-> (int)(Math.random()*45)+1);
        System.out.println("arr7 = " + Arrays.toString(arr7));


        String[][] starr2 = new String[][]{  {"aaa","bbb"}, {"AAA","BBB"} };
        String[][] starr3 = new String[][]{  {"aaa","bbb"}, {"AAA","BBB"} };

        System.out.println(Arrays.equals(starr2,starr3));
        System.out.println(Arrays.deepEquals(starr3,starr2));

    }
}
