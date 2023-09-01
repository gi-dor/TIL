package day18.예제문제;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Hash_Ex1 {
    public static void main(String[] args) {
        Object[] obj ={"1",new Integer(1),"2","2","3","3","4","4","4"};
        Set set = new HashSet();

        for(int i = 0 ; i<obj.length; i++){
            set.add(obj[i]);    // HashSet에 obj 요소들 저장하기
        }

        System.out.println("set = " + set);
        // set= 1,1,2,3,4
        // 왜 이런 결과일까 ?

        // 1. Set 특징 , 순서 x 중복 x 이기 때문에  2,3,4의 중복들은 제거가 되었음
        // 2. 그러면 1 ,1 이거 두개는 ? String 인스턴스, Integer 인스턴스로 서로 다른 객체임 중복이아님

        // HashSet에 저장된 요소들을 출력함
        Iterator it = set.iterator();

        while (it.hasNext()){ // has.Next() 읽어올 요소가 있는지 확인하기
            System.out.println(it.next());  // next() 요소 하나 꺼내오기
        }



    }
}
