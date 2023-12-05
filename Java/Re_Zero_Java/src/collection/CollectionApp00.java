package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class CollectionApp00 {

    public static void main(String[] args) {
        /**
         * Collection Framework
         *
         * Java가 자료구조를 구현 해놓은것
         * 그렇다면 컬렉션 프레임웍에 있는 자료구조들은 인터페이스와 그를 구현한 클래스 들이다
         * 컬렉션 프레임웍은 데이터르 ㄹ저장 , 관리 , 조작하는데 쓰인다
         *
         * 예를들면 List Set Map 이란 인터페이스가 있고 이들은 구현하는 클래스들이있다.
         *
         */

        /**
         * Collection<E>
         *     모든 자료구조 클래스의 최상위 인터페이스
         *     그 하위에 List , Set , Map이 존재한다
         */

        /**
         *    Set
         *      HashSet : 가장많이 사용되는 Set
         *      TreeSet : 저장되는 요소가 오름차순으로 정렬되서 저장된다
         */

        Set<String> set = new HashSet<String>();
        set.add("나타");
        set.add("여포");
        set.add("방통");
        set.add("소고");
        set.add("관우");
        set.add("관우");  // 동일한 객체가 저장되어 있어서 저장되지 않음

        int count = set.size();
        System.out.println("저장된 객체의 갯수 파악하기 : " + count);

        // HashSet에 지정된 객체를 포함하고있는지 확인하기
        boolean TF = set.contains("소고");
        System.out.println("소고를 포함하고 있는가 ? " + TF);

        // HahshSet에 객체 삭제 하기
        set.remove("방통");

        // HashSet이 비어있는지 확인하기
        boolean isEmpty = set.isEmpty();
        System.out.println("HashSet이 현재 비어있는가 ? " + isEmpty);

        // HashSet에 있는 요소들 출력하기
        // for 문 사용
        for (String name : set) {
            System.out.println("저장된 요소들 출력하기 : " + name);
        }

        // 이제 HashSet에있는 요소들 삭제하기
        set.clear();

        // 다시한번 HashSet이 비어있는지 확인하기
        boolean isEmpty2 = set.isEmpty();
        System.out.println("Hashset이 이제 비어있는가 ? " + isEmpty2);

        System.out.println();
        System.out.println("-----------------------------------------------------");
        System.out.println();

        /**
         * List<E>
         *     순서가 유지된다 - 저장한 순서대로 다시 꺼낼수 있음 First in First OUT  FIFO구조
         *     요소가 저장될 때 마다 index- 순번이 자동으로 부여됨 배열이라 생각하면 편함
         *     특정위치에 요소 저장하기 , 요소에 있는거 삭제하기 , 요소에있는거 꺼내기
         *
         */

        // Person 객체를 여러개 저장할 수 있는 ArrayList객체 생성
        List<Person> list = new ArrayList<Person>();

        // ArrayList 객체에 Person 객체 생성하기
        list.add(new Person(001, "전사"));
        list.add(new Person(002, "도적"));
        list.add(new Person(003, "궁사"));
        list.add(new Person(004, "도사"));
        list.add(new Person(005, "창술"));

        // ArrayList객체에 저장된 Person 객체의 갯수 파악하기
        int count2 = list.size();
        System.out.println("list에 저장된 갯수 " + count2);

        // for문을 이용해 ArrayList객체에 저장된 Person객체 출력
        for (Person p : list) {
            int no = p.getNo();
            String name = p.getName();
            System.out.println("번호 : " + no + "  이름 : " + name);
        }

        // ArrayList 객체에서 n 번에 저장된 Person 객체 조회하기
        Person searchP1 = list.get(0);
        Person searchP2 = list.get(1);
        Person searchP3 = list.get(2);
        Person searchP4 = list.get(3);
        Person searchP5 = list.get(4);

        System.out.println("ArrayList에서 0번째  :" + searchP1);
        System.out.println("ArrayList에서 1번째  :" + searchP2);
        System.out.println("ArrayList에서 2번째  :" + searchP3);
        System.out.println("ArrayList에서 3번째  :" + searchP4);
        System.out.println("ArrayList에서 4번째  :" + searchP5);

        // n번째 객체에있는 요소 삭제하기
        list.remove(2);

        // n번째 객체의 요소 변경하기
        list.set(1, new Person(10000, "여포"));
        Person searchP01 = list.get(1);
        System.out.println("ArrayList 1번째 요소 확인 : " + searchP01);
        System.out.println();
        System.out.println("for문 반복문으로 요소 삭제 및 변경 확인하기");

        for (Person pp : list) {
            int no = pp.getNo();
            String name = pp.getName();
            System.out.println("no : " + no + " name : " + name);
        }
        /**
         * remove(2)로 인해 2번째 요소가 삭제되었음
         * set()으로 요소 변경
         */

        // ArrayList 객체에 있는 모든 요소 삭제
        list.clear();

        boolean isListEmpty = list.isEmpty();
        System.out.println("isEmpty()로 요소 비어있는지 확인하기 : " + isListEmpty);

        System.out.println();
        System.out.println("-------------------------------------------------------");
        System.out.println();

        /**
         * Stack
         * Stack은 마지막에 저장한 데이터를 가장 먼저 꺼낸다
         * Last In Fist Out - LIFO 구조
         * QUEUE 는 먼저 저장한 데이터를 먼저 꺼낸다
         * First In First Out  - FIFO 구조
         *
         * Ex. Stack :  0 , 1 , 2 순서로 저장시 꺼낼 때는 2 ,1 ,0
         * 순서대로 데이터를 추가하고 삭제하는 스택에는 ArrayList같은배열 기반 컬렉션클래스가 적절함
         *
         */

        // Stack객체에 String 제네릭 써서 String 타입 저장해야지
        Stack<String> stack = new Stack<String>();

        // Stack 객체에 이제 문자열 저장해야지
        stack.push("일번 입니다");
        stack.push("이번 입니다");
        stack.push("삼번 입니다");
        stack.push("사번 입니다");
        stack.push("오번 입니다");

        // Stack 객체에서 맨위에있는 객체 조회해야지
        // 조회만 하는거야 꺼내는거아니야
        // Last In First Out - LIFO 구조
        // 오번입니다 조회될 예정
        String stValue1 = stack.peek();
        System.out.println("LIFO구조 맨위에있는 객체 '조회' , 꺼내는거아님 //  결과는 " + stValue1);

        /**
         * while문으로 stack이 비어있지않을시 반복문으로 pop로 꺼내서 출력하게만듬
         */
        System.out.println("while문으로 stack.pop()해서 출력하기");
//        while (!stack.empty()) {
//            System.out.println(stack.pop());
//        }
        System.out.println("==========================================================");
        System.out.println();

        // Stack 객체에서 맨위에있는 객체 계쏙 해서 꺼내기
        String value1 = stack.pop();
        String value2 = stack.pop();
        String value3 = stack.pop();
        String value4 = stack.pop();
        String value5 = stack.pop();

        System.out.println("pop()은 stack구조에서 꺼내서 출력하는거라 삭제된다 비어있음면 Exceptiron 발생한다");
        System.out.println(value1);
        System.out.println(value2);
        System.out.println(value3);
        System.out.println(value4);
        System.out.println(value5);

        // stack 객체 비어있나 확인하기
        boolean isStackEmpty = stack.isEmpty();
        System.out.println("isStackEmpty : " + isStackEmpty);

    }
}

class Person {
    private int no;
    private String name;

    public Person() {
    }

    public Person(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    @Override
    public String toString() {
        return "Person{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
