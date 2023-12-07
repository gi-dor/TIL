package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapApp00 {

    public static void main(String[] args) {

        /**
         * Map <K,V> , Map은 데이터를 key 와 value 쌍으로 연결지어서 저장하는 객체다
         *key 와 value 쌍을 표현하는 객체는 Entrty<k,v>
         * key는 값을 대표하는 값이다
         * 중복될수 없으며 타입은 보통 String Integer Long 타입이 주로 사용된다
         *
         * value는 중복이 가능하며 , 실제로 Map에 저장할 정보를 가지고 있는 객체다
         *
         * 주요 구현 클래스
         * HashMap  가장 많이 사용하는 Map인터페이스 구현클래스
         * HashTavle HashMap과 사용법은 동일, 멀티스레드 환경에서 안전하다
         *
         * Ex.
         * key - 사용자 아이디
         * value - 사용자 정보객체
         * Map<k,v> - Map<String,User>
         */

        // Map 객체 생성
        Map map = new HashMap();

        // 값 추가하기
        // add가 아닌 put
        map.put("101호", "철수");
        map.put("102호", "영희");
        map.put("103호", "제이크");
        map.put("104호", "민수");
        map.put("rltjs987", "1q2w3e4r!");
        map.put("Integer", "int");

        // map이라는 변수안에 6개 값이 있음.

        // 출력
        System.out.println(map.get("101호"));
        System.out.println(map.get("102호"));
        System.out.println(map.get("103호"));
        System.out.println(map.get("104호"));
        System.out.println(map.get("rltjs987"));
        System.out.println(map.get("Integer"));
        // 존재 하지 않은 값 출력 해보기
        System.out.println(map.get("105호")); // null 출력

        System.out.println("=====================================================");

        // keySet에는 key들이 Set 자료형으로 대입되어있음
        Set keySet = map.keySet();

        // Iterator 반복
        // Iterator 는 모든 컬렉션 프레임워크의 데이터를 접근할수 있도록 정형화된 인터페이스  (요소를 읽어오는데 쓰이는 인터페이스)

        Iterator it = keySet.iterator();
        while (it.hasNext()) {
            System.out.println(map.get(it.next()));
            // it.next() 가 key
            // get이 리턴값 -> value

        }
    }
}
