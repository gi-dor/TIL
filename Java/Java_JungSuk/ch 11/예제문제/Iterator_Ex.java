package day18.예제문제;

import java.util.*;

public class Iterator_Ex {
    public static void main(String[] args) {
       // ArrayList c = new ArrayList();
      //  HashSet c = new HashSet();    // Set은 Collection의 자손
      // TreeSet c = new TreeSet();
        Collection c = new HashSet();   // Collection c = new TreeSet() 으로 바꿔도 아래 코드들을 검토 안해도됨



        c.add("1");
        c.add("2");
        c.add("3");
        c.add("4");
        c.add("5");
        c.add("6");

        Iterator it = c.iterator();
        // Iterator 는  List , Set 다 똑같이 작동함

        while (it.hasNext()){       // hasNext()로 읽어올 요소가 있는지 확인
            Object obj = it.next();
            System.out.println("obj = " + obj);
        }

        // iterator() 는 1회용이라 다시 얻어와야한다
        it = c.iterator();      // 새로운 iterator 객체를 얻는다

        while (it.hasNext()){
            Object obj = it.next();
            System.out.println( obj);
        }

        // HashSet을 쓰면 작동안함
//        for(int i = 0 ; i< c.size(); i++){
//            Object obj = c.get(i);
//            System.out.println( "for "+obj);
//        }

    }
}
