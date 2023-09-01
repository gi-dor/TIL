package day18.예제문제;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Stack_Queue {
    public static void main(String[] args) {

        Queue que = new LinkedList();       // queue는 인터페이스야 ~ 클래스 아니야 ~ 잊지마~~~~

        que.add("1번 요소");
        que.add(2);
        que.add("세 번째 요소");
        que.add(new Integer(4));
        System.out.println("que = " + que);
        
        int size = que.size();
        System.out.println("que size = " + size);

        Stack stc = new Stack();            // stack은 vector 클래스 상속받아서 add() 메서드도 사용가능하다고함
        stc.add("1번");
        stc.add(new Integer(2));
        stc.add(3);
        stc.add("네 번째 요소");

        System.out.println("stc = " + stc);
        System.out.println("======================================");

        que.offer("0");
        que.offer(1);
        que.offer(new Integer("3"));
        que.offer("사");

        System.out.println("que = " + que);
        System.out.println();

        stc.push("0");
        stc.push(1);
        stc.push(new Integer(2));
        stc.push("오");

        System.out.println("stc = " + stc);

        System.out.println(" QUEUE  = " +  que);
        while(!que.isEmpty()){
            System.out.println(que.poll()); // poll() 메서드는 Queue에서 객체를 하나씩 반환함  비어있으면 null반환
        }                                    // 가장 먼저 넣은 거를 가장먼저 뱉어냄  First In First Out

        System.out.println(" -----------------------------");

        System.out.println("stc = " + stc);
        while (!stc.isEmpty()){
            System.out.println(stc.pop());  // pop() 메서드는 Stack의 맨위에 부터 저장된 객체를 꺼냄
        }                                   // 마지막에 넣은걸 가장 먼저 뱉어냄  Last In First Out


        Stack st = new Stack();
        st.push("오");
        st.push("늘");
        st.push("따");
        st.push("라");
        st.push("집");
        st.push("에");
        st.push("가");
        st.push("고");
        st.push("싶");
        st.push("다");

        System.out.println(st);

        Queue q =  new LinkedList();
        q.offer("집에서");
        q.offer("잠");
        q.offer("자");
        q.offer("고");
        q.offer("싶");
        q.offer("다");



        while(!q.isEmpty()){
            System.out.println(q.poll());
        }


    }
}
