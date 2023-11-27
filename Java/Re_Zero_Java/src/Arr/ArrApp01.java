package Arr;

public class ArrApp01 {

    public static void main(String[] args) {

        // 정수 5개 담을수 있는 배열 선언
        // 0 이 저장되있음
        int[] arr = new int[5];

        // 실수 5개 담는 배열
        // 0.0 저장되있음
        double[] doubleArr = new double[5];

        // 문자열 5개 담는 배열
        // null 담겨있음
        String [] stArr = new String[5];

        arr[0] = 10;
        arr[1] = 11;
        arr[2] = 13;
        int value1 = arr[0];
        int value2 = arr[1];
        int value3 = arr[2];

        doubleArr[0] = 0.7;
        doubleArr[1] = 1.43;
        double value11 = doubleArr[0];
        double value12 = doubleArr[1];

        stArr[0] = "0번 인덱스";
        stArr[1] = "1번 인덱스";
        String stValue1 = stArr[0];
        String stValue2 = stArr[1];


        System.out.println("value1 : "+value1);
        System.out.println("value2 : "+value2);
        System.out.println("value3 : "+value3);

        System.out.println();

        System.out.println("value11 : "+value11);
        System.out.println("value12 : "+value12);

        System.out.println();

        System.out.println("stValue1 : "+stValue1);
        System.out.println("stValue2 : "+stValue2);


        // 정수 배열
        int[] arrInt = {10,220,31,554,65};

        int value01 = arrInt[0];
        int value02 = arrInt[1];
        int value03 = arrInt[2];
        int value04 = arrInt[3];


        System.out.println(value01);
        System.out.println(value02);
        System.out.println(value03);
        System.out.println(value04);
        System.out.println("-------------------------------------");


        // 배열의 모든 요소 순회하기
        // for문 사용해서 배열의모든요소
        int [] number =  {19,29,30,50,48};

        for(int value : number) {
            System.out.println(value);
        }
        System.out.println("----------------------------");
        int total = 0;
        for ( int num : number) {
            total += num;
        }
        System.out.println("tatal = "+total);


            }
}
