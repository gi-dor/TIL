package Arr;

public class ArrRef {
    static void main(String[] args) {

        int[] students; // int 형 배열변수 선언
        students = new int[5];  // new Array() 는 자바 스크립트에서 사용하니 헷갈릴수있음

        System.out.println("students.length :: " +students.length);

        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        for(int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i+1) +" 점수 : "+ students[i]);  // (i + 1) 괄호 제거시 문자로 반영됨
        }

    }
}
