package condition;

public class Example02 {

    public static void main(String[] args) {

    /*
        평점에 따른 영화 추천하기
        1. 어바웃타임 평점 9
        2. 토이스토리 평점 8
        3. 고질라 & 킹콩 평점 7

        평점 변수는 double rating 을 사용하며 if 문을 활용해 문제를 풀자
     */
        double rating = 7.1;
        System.out.println("현재 평점 " + rating + "점");

        if (rating <= 9) {
            System.out.println("어바웃 타임 추천");
        }
        if (rating <= 8) {
            System.out.println("토이스토리 추천");
        }
        if (rating <= 7) {
            System.out.println("고질라 & 킹콩 추천합니다");
        }
    /*
   학점에 따른 성취도 출력
   String grade ="";
   A : 탁월한 성과
   B : 좋은 성과
   C : 준수한 성과
     */
        String grade = "D";

        switch (grade) {
            case "A":
                System.out.println("탁원한 성과 입니다");
                break;
            case "B":
                System.out.println("좋은 성과 입니다");
                break;
            case "C":
                System.out.println("준수한 성과 입니다");
                break;
            case "D":
                System.out.println("향상하고 있습니다");
                break;
            case "F":
                System.out.println("불합격 입니다");
            default:
                System.out.println();
        }
        System.out.println();
        System.out.println("==================================");
        /*
        두개의 정수 변수 a와 b를 가지고 있다
        a는 10 , b는 20 이다
        삼항 연산자를 이용해 두 숫자중 더 큰숫자를 출력하라
         */

        int a = 10;
        int b = 20;
        int max = (a > b) ? a : b;
        System.out.println(max);

        /*
       홀수 , 짝수 찾기
       x = 2
       x % 2 = 짝수



       x = 3
       x % 3 = 홀수
         */

        int x = 2;
        String result = (x % 2 == 0) ? "짝수" : "홀수";
        System.out.println("x = " + x + "," + result);
    }
}
