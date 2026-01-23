package Arr;

public class ArrSample01 {
    static void main(String[] args) {

        int stu1 = 90;
        int stu2 = 80;
        int stu3 = 70;
        int stu4 = 60;
        int stu5 = 50;

        System.out.println("학색1 점수 : "+ stu1);
        System.out.println("학색2 점수 : "+ stu2);
        System.out.println("학색3 점수 : "+ stu3);
        System.out.println("학색4 점수 : "+ stu4);
        System.out.println("학색5 점수 : "+ stu5);
        System.out.println( " ============================ ");

        int[] students; // int 형 배열변수 선언
        students = new int[5];  // new Array() 는 자바 스크립트에서 사용하니 헷갈릴수있음

        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        System.out.println("학색1 점수 : "+ students[0]);
        System.out.println("학색2 점수 : "+ students[1]);
        System.out.println("학색3 점수 : "+ students[2]);
        System.out.println("학색4 점수 : "+ students[3]);
        System.out.println("학색5 점수 : "+ students[4]);

        int[] sample = new int[1];
        String[] sample1 = new String[1];
        boolean[] sample2 = new boolean[3];
        sample2[1] = true;

        System.out.println("sample : "+sample[0]);
        System.out.println("sample1 : "+sample1[0]);
        System.out.println("sample2 : "+sample2[0]);
        System.out.println("sample2 : "+sample2[1]);


    }
}
