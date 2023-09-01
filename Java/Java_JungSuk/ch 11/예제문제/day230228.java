package day18.예제문제;

import java.util.*;


// ch 11
// 예제 11-1
public class day230228 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 기본 길이( 용량 capacity)가 10인 ArrayList 생성
		ArrayList  list1 = new ArrayList(10);
		
		// ArrayList에는 객체만 저장이 가능하다
		// autoboxing에 의해서 기본형이 참조형으로 자동변환됨 
		//list1.add(new Integer(5));
		list1.add(5);
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
	
		ArrayList list2 = new ArrayList(list1.subList(1,4));
		print(list1,list2);
		
		// Collection은 인터페이스 , Collections 는 유틸클래스
		Collections.sort(list1); 	// list1 과 list2를 정렬한다
		Collections.sort(list2);	// Collections.sort(List l)
		print(list1,list2);
		
		System.out.println("list1.containsAll(list2) : "+list1.containsAll(list2));
		
		list2.add("B");
		list2.add("C");
		list2.add(3,"A");	// 인덱스가 3인곳에 A를 추가
		print(list1,list2);
		
		
		list2.set(3, "AA");	// 인덱스가 3인곳에 AA로 변경
		print(list1,list2);
		
		list1.add(0, "1");
		// indexOf() 는 지정된 객체의 위치 (인덱스) 를 알려준다
		System.out.println("index= "+list1.indexOf("1"));
//		list1.remove(1);	// 인덱스가 1인 객체를 삭제함 
		
		list1.remove(new Integer(1)); // 1 을 삭제
		
		
		// list1에서 list2와 겹치는 부분만 남기고 나머지는 삭제
		System.out.println("list1.retainAll(list2) : "+list1.retainAll(list2));
		
		print(list1,list2);
		
		// list2에서 list1에 포함된 객체들을 삭제한다
		for ( int i = list2.size()-1; i >= 0; i--) {
			if(list1.contains(list2.get(i)))
				list2.remove(i);
			// get(i)로 list2에서 하나씩꺼냄
			// contain()로 꺼낸 객체가 list에 있는지 확인
			// remove(i)로 해당 객체를 list2에서 삭제 
		}
		print(list1,list2);
	}
	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1: "+list1);
		System.out.println("list2: "+list2);
		System.out.println();
	}

}
