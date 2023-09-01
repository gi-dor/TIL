package day18.예제문제;

import java.util.*;

public class Hash_Ex2 {
    public static void main(String[] args) {
        Set set = new HashSet();

        // set의 크기가 6보다 작은동안 1 ~ 45 사이의 난수를 저장
        for(int i = 0; set.size()<6; i++){
            int num = (int)(Math.random()*45)+1;
        //    set.add(new Integer(num));
            set.add(num);
        }

        List li = new LinkedList(set); // set의 모든 요소를 list에 저장
        Collections.sort(li);   // list 저장
        System.out.println("li = " + li);   // list 출력
    }
}
