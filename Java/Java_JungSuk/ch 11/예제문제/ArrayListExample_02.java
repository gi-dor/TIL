package day18.예제문제;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample_02 {

	// 매개변수로 ArrayList list1,list2 주고 그 값을 출력하는 메서드pront
	
	static void pront(ArrayList list1 , ArrayList list2) {
		System.out.println("list1 = "+list1);
		System.out.println("list2 = "+list2);
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		ArrayList list1 = new ArrayList(7);
		
		list1.add(9);
		list1.add(99);
		list1.add(new Integer(2));
		list1.add(new Integer(4));
		list1.add(new Integer(1));
		list1.add(new Integer(10));
		// [9 99 2 4 1 10]
		
		ArrayList list2 = new ArrayList(list1.subList(1, 5));
		// subList(1,5) =>  1<= x < 5
		// [ 99 2 4 1]
		System.out.println("배열 출력");
		pront(list1,list2);
		
		// 정렬하기
		Collections.sort(list1);
		Collections.sort(list2);
		System.out.println("오름 차순으로 정렬하기 sort");
		pront(list1,list2);

		// 사이에 값 저장하기
		System.out.println(".add 해당 index에 추가하기");
		System.out.println("index 1에 20 저장");
		System.out.println("index 0에 17 저장");
		
		list1.add(1, 20);
		list2.add(1, 17);
		pront(list1,list2);
		
		System.out.println("index 5에 250");
		System.out.println("index 5에 30");
		
		list1.add(5, 250);
		list2.add(5, 30);
		pront(list1,list2);
		
		// 요소 확인하기 - 검색
		// 해당 값이 어느 index에 있는가 ? ?
		Collections.sort(list1);
		Collections.sort(list2);
		
		
		System.out.println(list1);
		
		System.out.println("list1.indexOf(250) = "+list1.indexOf(250));
		System.out.println("list1.indexOf(9) = "+list1.indexOf(9));
		System.out.println("list1.indexOf(4) = "+list1.indexOf(4));
		System.out.println("list1.indexOf(10) = "+list1.indexOf(10));
		System.out.println("list1.indexOf(99) = "+list1.indexOf(99));
		// Ex. 250이 몇번쨰 에있는가 ? 
		// 숫자 20이 몇번째 에 있는가 ?
		
		
		System.out.println();
		
		System.out.println(list2);
		System.out.println("list2.indexOf(30) = "+list2.indexOf(30));
		System.out.println("list2.indexOf(4) = "+list2.indexOf(4));
		System.out.println("list2.indexOf(99) = "+list2.indexOf(99));
		System.out.println("list2.indexOf(17) = "+list2.indexOf(17));
		System.out.println();
		
		System.out.println(".retainAll()");
		//list1에서 list2와 겹치는 부분을 남기고 나머지는 삭제
//				list1 = [9, 99, 2, 4, 1, 10]
//				list2 = [99, 2, 4, 1]
				// 2 4 99 1 제외하고 
				// 10 삭제
				// 1 2 4 99 + 20,250
				// 1 2 4 99 + 30,17
		
		//System.out.println("list1.retainAll(list2) true or false = "+list1.retainAll(list2) );
	
		System.out.println("retainAll() 하기 전");
		System.out.println(list1);
		System.out.println(list2);
		System.out.println(); 
		
		list1.retainAll(list2);
		list2.retainAll(list1);
		
		System.out.println(list1);
		System.out.println(list2);
		//pront(list1,list2);
	}

}
