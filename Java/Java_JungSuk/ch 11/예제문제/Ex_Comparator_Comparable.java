package day18.예제문제;

import java.util.Arrays;
import java.util.*;
public class Ex_Comparator_Comparable {
    public static void main(String[] args) {

        String [] stArr = {"cat","Dog","lion","tiger"};

        Arrays.sort(stArr);  // String의 Comparable 구현에 의한 정렬 이라고함...
        System.out.println("stArr = " + Arrays.toString(stArr));

        Arrays.sort(stArr,String.CASE_INSENSITIVE_ORDER);   // 대소문자 구분안함
        System.out.println("stArr = " + Arrays.toString(stArr));

        Arrays.sort(stArr, new Descending()); // 역순정렬
        System.out.println("stArr = " + Arrays.toString(stArr));

    }
}
class Descending implements Comparator{
    public int compare(Object o1, Object o2){
        if(o1 instanceof Comparable && o2 instanceof  Comparable){
            Comparable c1 = (Comparable)o1;
            Comparable c2 = (Comparable)o2;
                return c1.compareTo(c2) * -1; // -1 곱해서 기본 정렬 방식을 역으로 변경
        }
        return -1;
    }
}
