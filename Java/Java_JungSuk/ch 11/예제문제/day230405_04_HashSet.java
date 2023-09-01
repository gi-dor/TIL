package day18.예제문제;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class day230405_04_HashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// p426 기초편 예제 11-10 HashSet
		
		Set s = new HashSet();
		
		for ( int i = 0; s.size()<6;i++) { 
			// 0 1 2 3 4 5에 6개 랜덤난수 담을때 까졍 반복
			int num = ( int)(Math.random()*45)+1;
			s.add(new Integer(num));
			
		}
		
		System.out.println(s);
		// s 는 정렬안됨
		// s를 List 로 옮기고 List를 정렬
		
		List l = new LinkedList(s);
		// List 인터페이스에서 LinkedList 클래스로 구현 
		// 매개변수로 HashSet()을넘겨주고 s에 들어있는 요소로 LinkedList() 객체 l 만듬
		// List특징이 순서 o 중복o 중복값은 없으니 순서에 맞게 정리해줌
		
		Collections.sort(l); 
		// Collections 클래스  
		// sort()는 Collections 클래스에서 주어진 정렬 메서드
		// sort() 메서드가 웃긴게 Comparable 인터페이스에있는 compareTo() 메서드를 호출함
		
		System.out.println(l);
	}

}
