package day18.예제문제;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample_01 {
	
    static void println(ArrayList list0 , ArrayList list1, ArrayList list2) {
    	System.out.println("list0 : "+list0);
    	System.out.println("list1 : "+list1);
    	System.out.println("list2 : "+list2);
    	System.out.println();
    }
	
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList list0 = new ArrayList(10);
		// 길이가 10인 ArrayList배열 
		
		
		// list0 배열의 요소
		list0.add(5);
		list0.add(new Integer(7));
		list0.add(new Integer(1));
		list0.add(new Integer(0));
		list0.add(new Integer(5));
		list0.add(new Integer(6));
		
		// list0 배열에서 
		// from ~ to 이용해서 일부 객체 뽑아내기
		ArrayList list1 = new ArrayList( list0.subList(1,4) );
		ArrayList list2 = new ArrayList ( list0.subList(1, 6) );
		
		// ArrayList list2 = new ArrayList ( list0.subList(1, 7) );
		// Exception in thread "main" java.lang.IndexOutOfBoundsException: toIndex = 7
		// main 메서드에 index 범위가 벗어났다는 Exception 에러 
		// ArrayList list0 의 길이는 6 index의 범위는 0 ~ 5
		// subList (1,7)  = > from 1 ~ 7 =>  1 ~ 7-1 => list [1] ~ list [7-1] 까지
		// subList(1,6) 으로 수정  => from 1 ~ 6   => index[1] ~ index[6-1] 
		


		
		// ArrayList 배열 list0 list1 list2 출력
		// 위에 선언된 println(ArrayList lsit0 ,ArrayList list2) 메서드 호출
		println(list0,list1,list2);
		
		
		// 배열 오름차순으로 정렬
		Collections.sort(list0); 
		Collections.sort(list1); 
		Collections.sort(list2); 
		
		// 정렬후 출력
		// 지정된 정렬 기준으로 ArrayList 정렬

		// 왜 Collections일까 ?
//		 책에는 void sort (Comparator c) 라고 나와있는데
		System.out.println("배열 정렬 Collections.sort()");
		println(list0,list1,list2);
		
		// list0 이 list1 요소를 모두 포함 했나 ?
	
		System.out.println("list0 이 list1 요소를 모두 포함 했나 ? = "+list0.containsAll(list1));
		System.out.println("list0 이 list2 요소를 모두 포함 했나 ? = "+list0.containsAll(list2));
		System.out.println();
		
		
		// list1에 인덱스 1에 "A"추가
		System.out.println("1 ) list1에 인덱스 1에 \"A\"추가");
		System.out.println("변경 전 list1 = "+list1);
		
		list1.add(1,"A");
		System.out.println("list1.add(1,\"A\");");
		
		System.out.println("변경 후 list1 ="+list1);
		System.out.println();
		
		// list2 에 인덱스 4에 "C"추가
		System.out.println("2 ) list2 에 인덱스 4에 \"C\"추가");
		System.out.println("변경 전 list2 = "+list2);
		
		list2.add(4,"C");
		System.out.println("list2.add(4,\"C\");");
		
		System.out.println("변경 후 list2 = "+list2);
		System.out.println();
		
		// list0 에 인덱스 5에 8추가
		System.out.println("3) list0 에 인덱스 5에 8추가");
		System.out.println("변경 전 list0 = "+list0);
		
		list0.add(5,8);
		System.out.println("list0.add(5,8);");
		
		System.out.println("변경 후 = " +list0);
		System.out.println();
		
		System.out.println("최종 정렬");
		println(list0,list1,list2);
	
		// 해당 요소가 어디 index에 있는가 ? - 검색
		System.out.println("list0.indexOf(8) = "+list0.indexOf(8));
		System.out.println("list0.indexOf(6) = "+list0.indexOf(6));
		System.out.println("list0.indexOf(7) = "+list0.indexOf(7));
		System.out.println();
		
		System.out.println("list1.indexOf(A) = "+list1.indexOf("A"));
		System.out.println("list1.indexOf(1) = "+list1.indexOf(1));
		System.out.println("list1.indexOf(7) = "+list1.indexOf(7));
		System.out.println();
		
		System.out.println("list2.indexOf(1) = "+list2.indexOf(1));
		System.out.println("list2.indexOf(5) = "+list2.indexOf(5));
		System.out.println("list2.indexOf(6) = "+list2.indexOf(6));
		System.out.println("list2.indexOf(C) = "+list2.indexOf("C"));
		System.out.println("list2.indexOf(7) = "+list2.indexOf(7));
	}

}
