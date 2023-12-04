package String01;

import java.util.ArrayList;

public class BoxingApp {

    public static void main(String[] args) {
        /**
         * 오토박싱 & 언박싱
         *
         * int  ->  Integer   오토박싱
         * int  <- Integer    언박싱
         *
         * 기존에는 기본형 과 참조혐의 연산이 불가능해서
         * 래퍼 클래스로 기본형을 객체로 만들어서 연산 했다
         *
         * 현재는 컴파일러가  Integer 객체를 int 타입의 값으로 변환해주는 intValue()를 자동으로 추가
         *
         */

        /**
         * 결론 : JDK1.5버전 이후 오토박싱덕분에 기본형 참조형 연산가능 / 추가 코드 필요도 없음 그냥 연산자 때려넣고 계산가능!
         */

        int sm = 10;
        Integer i2 = new Integer(7);
        int sum = sm + i2;
        // int sum = o + i2.intValue();
        System.out.println("sum ? " + sum); // Java 규칙상 원래 기본형 + 참조형 연산 불가능했는데 JDK 1.5 이후 가능함;;;

        // 예시
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(100); // 오토 박싱에 의해 10 -> new Integer(10);
        list.add(new Integer(200));
        // 원래는list에는 객체만 추가 할수 있었음 1.5버전 이후로 바뀜

        Integer i1 = list.get(0);
        // Integer -> int 원래 변환시 intValue() 필요함

        /**
         * ArrayList에 숫자를 저장 하거나 꺼낼 때 기본형 값을 래퍼클래스의 객체로 변환하지 않아도된다.
         */

        int i = 10;
        Integer intg = (Integer) i;    // Integer intg = Integer.valueOf(ii);
        Object obj = (Object) i;    // Object obj = (Onject)Integer.valueOf(ii);

        Long lng = 100L; // Long lng = new Long(100L);

        int i3 = intg + 10; // 참조형과 기본형간의 연산가능
        long l = intg + lng; // 참조형간의 덧셈 가능

        System.out.println("i? " + i);
        System.out.println("i3 ? " + i3);
        System.out.println("intg ? " + intg);
        System.out.println("obj ? " + obj);
        System.out.println("intg + 10 ? " + i3);
        System.out.println("intg + lng ? " + l);

        Integer intg2 = new Integer(20);
        System.out.println("intg2 ? " + intg);
        
    }
}
