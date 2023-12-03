package String01;

public class StringBufferApp1 {

    public static void main(String[] args) {

        /**
         * 문자열 저정 + 다루기
         * String 처럼 배열을 내부적으로 가지고있음
         * String 과는 다르게 내용을 변경할수 있음
         */

        StringBuffer sb1 = new StringBuffer("abcd");
        System.out.println(sb1);

        sb1.append("ZZ");
        System.out.println(sb1);
        sb1.append("PD");
        sb1.append("33");
        sb1.append(18);
        System.out.println(sb1);

        sb1.append("XC").append(178).append("ewR");
        System.out.println(sb1);

        /**
         * StringBuffer는 equals가 오버라이딩 되어있지 않음
         * 즉 주소 비교룰 함  ' == ' 이거랑 같음
         */

        StringBuffer sbs = new StringBuffer("QWER");
        StringBuffer sbs2 = new StringBuffer("QWER");

        // 오버라이딩 되어있지 않으니 주소값 비교를 하니 false 가 나오겠찌
        System.out.println(" equals , == 비교");
        System.out.println(sbs == sbs2);
        System.out.println(sbs.equals(sbs2));

        /**
         * StringBuffer를 String으로 변환 하고 나서 equals() 로 비교
         */

        // 변환 하고 했으니 == 는 주소갑 비교 equals를 사용하면 값비교이니 true 나오겠지
        System.out.println("StringBuffer 를 String으로 변환 후 비교");
        String s = sbs.toString();
        String ss = sbs2.toString();

        System.out.println(s == ss);
        System.out.println(s.equals(ss));


    }
}
