package generic;

import java.util.ArrayList;
import java.util.List;

public class GenericEx {

    public static void main(String[] args) {

        /*
        제네릭 ?
        타입을 체크
        객체의 데이터 타입을 미리 명시해주는것


        제네릭 사용하는 이유
        1. 형변환 코드 불필요 컴파일시 강한 타입 체크
        2. 제네릭은 여러 타입의 객체들을 다루는 메서드나 컬렉션 클래스에 컴파일시 타입 체크 해주는 기능
        3. 타입체크와 형변환 이 생략되어 코드가 간결해진다.
        List list = new ArrayList();
        List<타입> list = new ArrayList<타입>();
        */

        List list = new ArrayList();
        list.add("HELLO!");
//        String hello = list.get(0); // Type mismatch from Object to String  Object가 String으로 안된다 !
        String hello = (String) list.get(0);
        System.out.println(hello);

        List<String> list2 = new ArrayList<String>(); // 제네릭에 <String> 지정해두어서 return 타입이 바뀜
        // 메서드 재정의
        list2.add("반갑다!");
        String hello2 = list2.get(0);
        System.out.println(hello2);

        TestGe tg = new TestGe();
        tg.set("테스트 반가워!");
        String h = (String) tg.get();

        TestGe<String> tg2 = new TestGe<String>();
//        tg2.get(123); // type Error
        tg2.set("테스트 반갑다!!");
        String gg = tg2.get();
        System.out.println(gg);

    }

}
