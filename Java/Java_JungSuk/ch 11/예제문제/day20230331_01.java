package day18.예제문제;

import java.util.*;

public class day20230331_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 기본길이(용량 , capacity) 가 10 인 ArrayList 생성
		ArrayList list1 = new ArrayList(10);
		// ArrayList에는 객체만 저장이 가능함
		
		// list1. add(5);
		// 기본형이 참조형으로 됨
		// list1.add(new Integer(5)); 써야하는데 autoboxing에 의해서 
		
		list1.add( new Integer(5));
		list1.add( new Integer(4));
		list1.add( new Integer(2));
		list1.add( new Integer(0));
		list1.add( new Integer(1));
		list1.add( new Integer(3));
		
		// subList - 일부를 뽑아냄
		// 1 <= x <4 
		// 4 ,2, 0 
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		// subList(from ~ to )  1 ~ 3 => 4 2 0
		print(list1,list2);
		
		// Collections 는 유틸 클래스
		Collections.sort(list1); // list1 과 list2 정렬
		Collections.sort(list2); // Collections.sort(List 1)
		print(list1,list2);
		
		// list1이 list2의 모든 요소를 포함하고 있는가 ?
		System.out.println("list1.containsAll(list2) : "+list1.containsAll(list2));
		System.out.println();
		
		list2.add("B");
		list2.add("C");
		// list2에  B,C를 추가함
		// 0 , 2 , 4  -> 0,2,4,B,C
		
		list2.add(3, "A");  // index가 3인 곳에 "A"를 추가
		// 0,2,4,A,B,C
		// 기존 요소들은 하나씩 밀림
		print(list1,list2);
		
		
		
		list2.set(3, "AA");	// index가 3인곳에 "AA"로 변경
		// 0,2,4,A,B,C 에서 index3에 위치한 A자리에 AA로 변경
		print(list1,list2);
		
		
		list1.add(0,"1");
		print(list1,list2);
		
		//  indexOf () 저장된 위치를 반환 - 검색기능
		System.out.println("index = "+ list1.indexOf(1));
		System.out.println("index = "+ list1.indexOf("1"));
		System.out.println("index = "+ list1.indexOf(5));
		System.out.println();
		System.out.println("index = "+ list2.indexOf("AA"));
	
		// 		System.out.println("index = "+ list2.indexOf("A"));
		//		System.out.println("index = "+ list2.indexOf("D"));
		// index = -1 ???????
		
		// list1 에서 list2와 겹치는 부분만 남기고 나머지는 삭제
		System.out.println("list1.retainAll(list2) : "+list1.retainAll(list2));
		
		print(list1, list2);
		
		// list2에서 list1에 포함된 객체들을 삭제
		for( int i = list2.size()-1; i >=0; i--) {
			if ( list1.contains(list2.get(i) ) )
					list2.remove(i); // index가 i인 곳에 저장된 요소를 삭제
		}
		print(list1,list2);
		
		
	}  // main
	
	static void print(ArrayList list1,ArrayList list2) {
		System.out.println("list1 : "+list1);
		System.out.println("list2 : "+list2);
		System.out.println();
	}

} // class
