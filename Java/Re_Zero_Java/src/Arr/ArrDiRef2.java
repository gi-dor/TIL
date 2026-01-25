package Arr;

public class ArrDiRef2 {
    static void main(String[] args) {
        // 2차원배열
        int[][] arr = new int[][]{
            {1,2,3},
            {4,5,6}
        };
        System.out.println("arr.length :: " + arr.length);
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
