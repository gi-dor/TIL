package String01;

public class HashCode_App {

    public static void main(String[] args) {

        /**
         * hashCode()
         * 객체의 해시코드를 반환하는 메서드
         *  해시 코드 = 정수값
         *  객체의 주소를 int 로 변환해서 반환함
         *
         */

        String str1 = new String("ZXCV");
        String str2 = new String("ZXCV");

        // equals()를 오버라이딩 하게되면 hashCode()도 오버라이딩 해야한다.
        System.out.println(str1.equals(str2));  // true
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());


    }
}
