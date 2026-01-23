package Arr;

public class ArrRef2 {
    static void main(String[] args) {
        int[] students; // int 형 배열변수 선언
        students = new int[]{90,80,70,60,50}; // 배열 생성과 초기화 한번에
//        int[] students = new int[]{90,80,70,60,50};
//        int[] students = {90,80,70,60,50};

        for(int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i+1) +" 점수 : "+ students[i]);  // (i + 1) 괄호 제거시 문자로 반영됨
        }
    }
}
