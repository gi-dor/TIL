package day18.예제문제;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {

        System.out.println("예제 11-1 ");
        // 기본길이 10 인 (capacity) ArrayList 생성
        ArrayList list1 = new ArrayList(10);
        // ArrayList에는 객체만 저장가능
        // autoboxing에 의해서
        // list1.add(5); 라고 작성해도  lst1.add(Integer(5)); 라고 인식함

        //list1.add(new Integer(5));
        list1.add(5);
        list1.add(new Integer(4));
        list1.add(new Integer(2));
        list1.add(new Integer(0));
        list1.add(new Integer(1));
        list1.add(new Integer(3));
        System.out.println("list1 = "+ list1);

        ArrayList list2 = new ArrayList(list1.subList(1,4)); // list1 = [5 4 2 0 1 3]
        System.out.println("list2 = " + list2);              // 4 2 0

        // Collection != Collections
        // Collection 인터페이스 , Collections 유틸클래스
        Collections.sort(list1);
        Collections.sort(list2);
        System.out.println("list1 = " + list1);
        System.out.println("list2 = " + list2);

        list1.containsAll(list2);
        // list1이 lsst2에 모든 요소를 포함 하고있는가 ?
        System.out.println("list1.containsAll(list2) = "+list1.containsAll(list2));
        
        list2.add("B");
        System.out.println("list2 = " + list2);
        list2.add("C");
        System.out.println("list2 = " + list2);
        list2.add(3,"AA");
        System.out.println("list2 = " + list2);

        System.out.println("--------------------------");
        System.out.println("list1 = " + list1);
        System.out.println("list2 = " + list2);

        list2.set(3,"A");
        System.out.println("list2 = " + list2);
        System.out.println(" ----------------------");
        System.out.println("list1에서 list2와 겹치는 부분만 '남기고' 나머지는 삭제함 " );
        System.out.println("list1.retainAll(list2) =  "+ list1.retainAll(list2));
        System.out.println("list1 = " + list1);
        System.out.println("list2 = " + list2);

        System.out.println("-------------------------");
        list1.add(10);
        list1.add(1);

        list1.remove(1); // 인덱스가 1인 객체를 삭제  0 2 4 10 1 중에 2 삭제
        list1.remove(new Integer(1)); // 값 1을 삭제함 0 4 10 1 중에  1삭제


        // list2에서 list1에 포함된 객체들을 삭제한다
        for(int i = list2.size()-1; i >=0 ; i--){
            if(list1.contains(list2.get(i)))
                list2.remove(i);    // 인덱스가 i인 곳에 저장된 요소를 삭제
        }


        System.out.println("list1 = " + list1);
        System.out.println("list2 = " + list2);

    }
}
