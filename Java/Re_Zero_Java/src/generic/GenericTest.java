package generic;

import java.util.ArrayList;

public class GenericTest {

    public static void main(String[] args) {

        /**
         * 제네릭스 왜씀 ?
         * 컴파일러에게 타입정보를 알려줘서 실행전에 타입체크가 강화되서 타입체크 잘해줘!
         * 형변환 또 해주기 귀찮아!
         * 코드도 간결하게 해줘!
         * JDK1.5 이후부터 사용이가능해
         */

//      ArrayList list = new ArrayList();
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(30);       // Integer OK
        list.add(290);      // list.add(new Integer(290);  에서 AUTO BOXING으로 list.add(290)
//      list.add("44");     // String
        list.add(44);       // 제네릭스 때문에 타입 체크가 강화됨.
        System.out.println(list);   // [30, 290, 44]

        //  Integer i = list.get(2); // 형변환 문제
        Integer i = (Integer) list.get(2);  // 컴파일은 OK - 컴파일러가 체크
        System.out.println(i);
        System.out.println(list); // ClassCastException -> RuntimeException 실행시 발생하는 형변환 에러 프로그래머 실수로 발생하는 에러
        // 실행시 발생하는 형변환 에러를 어떻게 처리할까 -> 제네릭스

        // Integer 말고 여러종류의 객체를 받고 싶어!
        ArrayList<Object> listIO = new ArrayList<Object>(); // Object 제네릭스를 사용하게되면 여러 종류의 객체를 사용 간능
        listIO.add(22);
        listIO.add("스트링");
        listIO.add(3.14);
        // 이렇게 여러 종류의 객체를 사용 가능할수 있다

        // 형변환 해줘야함
//      String io1 = listIO.get(1);
//      Double io2 = listIO.get(2);

        String io1 = (String) listIO.get(1);
        Double io2 = (Double) listIO.get(2);
        System.out.println(io1);
        System.out.println(io2);

        System.out.println(listIO); // [22, 스트링, 3.14]

        // 근데 사실 <Object> 사용해서 형변환 해주는거는 구린 코드

    }
}
