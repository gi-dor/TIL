package Arr;

public class ArrApp2 {

    public static void main(String[] args) {

        // 배열선언
        int [] arr ;
//        System.out.println(arr); // 초기화 작업 하지 않아서 에러

        arr = new int[5];   // 길이가 5인 배열생성
        System.out.println(arr[0]); // 자동으로 0 으로 초기화 되어있음
        System.out.println(arr[1]); // 자동으로 0 으로 초기화 되어있음

        // 선언과 초기화 동시에 하기
        int [] arr1 = new int[5];
        arr1[0] = 1;
        arr1[1] = 10;
        arr1[2] = 100;
        arr1[3] = 1000;
        arr1[4] = 15;

        int[] arr2 = {10,70,40,30,60,230};

        System.out.println("-------------------------------------");

        for(int i = 0 ; i< arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        System.out.println("-------------------------------------");

        for(int i = 0; i < arr2.length;i++) {
            System.out.println(arr2[i]);
        }

        System.out.println("-------------------------------------");
        System.out.println("향상된 for문으로 출력하기");

        for (int value : arr1) {
            System.out.println(value);
        }

        System.out.println("--------------- 구 분 선 -------------");

        for(int value2 : arr2) {
            System.out.println(value2);
        }






    }
}
