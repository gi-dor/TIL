package generic;


import java.util.ArrayList;

/**
 * 지네릭은 여러 타입의 객체들을 다루는 메서드나 컬렉션 클래스에 컴파일시 타입 체크 해주는 기능
 * 타입체크와 형변환 이 생략되어 코드가 간결해진다.
 */

class Tv{}

public class GenericApp01 {

    public static void main(String[] args) {

        /**
             <T>를 타입 변수 라고 하며 <T>를 주로 쓰며 Type을 뜻한다
             <E>는 Element 요소의 첫글자를 따서 E를 사용한다.
             타입변수가 여러개인경우 MaP<K,V>
         *
         */

        ArrayList<Tv> tvList = new ArrayList<Tv>();
        tvList.add(new Tv());
//        tvList.add(new Audio()); // 컴파일 에서 , Tv 이외 타입 저장이 불가능하다


    }
}
