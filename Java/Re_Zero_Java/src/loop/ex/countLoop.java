package loop.ex;

public class countLoop {
    public static void main(String[] args) {
        // 처음 10개의 자연수를 출력하는 프로그램 count 라는 변수를 사용

        // for문
        System.out.println("for 문");
        for (int count = 1; count <= 10; count++) {
            System.out.println("count = " + count);
        }

        System.out.println();

        // while
        System.out.println("While 문");

        int count2 = 1;
        while (count2 <= 10) {
            System.out.println("count2 = " + count2);
            count2++;
        }
    }
}
