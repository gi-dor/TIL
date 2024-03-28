package variable;

public class VarEx1Question {
    public static void main(String[] args) {

        /*
        반복해서 나오는 숫자 4,3 을 다른 숫자로 한번에 변경할 수 있도록 다음을 변수 num1 , num2 를 사용해 변경해보자
         */

        System.out.println(4 + 3);
        System.out.println(4 - 3);
        System.out.println(4 * 3);

        int a = 4;
        int b = 3;

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        // 문자열 + 숫자 --> 문자열
        // 문자열 + 문자열 --> 문자열
        // 숫자 + 문자열 --> 문자열

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);

    }
}
