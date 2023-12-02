package String01;

public class StringClass {

// 덧셈 연산자 + 를 사용해 문자열 결합은 성능이 떨어짐
// 문자열의 결합이나 변경이 잦다면 , 내용을 변경가능한 StringBuffer 사용

    public static void main(String[] args) {

        String str = "abc";

        String str0 = "abc";

        String str1 = new String("abc");

        String str2 = new String("abc");

        String str3 = new String("abc");

        System.out.println(str0 == str1);
        System.out.println(str0.equals(str1));

        // String 문자열 비교 하는방법
        // 대입 연산자 == 를 사용 하게되면 주소를 비교 하기 때문에 사용하지 않고
        // equals를 사용해서 내용 비교를하자

    }
}