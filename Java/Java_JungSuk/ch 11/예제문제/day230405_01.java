package day18.예제문제;

import java.util.*;

public class day230405_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			// 기초편 p421 예제 11-7 Comparator , Comparable
		
		String[] strArr = { "cat", "Dog", "lion", "tiger" };
		// String배열
		Arrays.sort(strArr); // 정렬 
		System.out.println("strArr = "+Arrays.toString(strArr));
		// 대문자 소문자 중에 대문자 먼저 출력함
		
		Arrays.sort(strArr,String.CASE_INSENSITIVE_ORDER); 
		System.out.println("strArr = "+Arrays.toString(strArr));
		// String.CASE_INSENSITIVE_ORDER 정렬 기준
        // strArr 은 정렬 대상
		
		Arrays.sort(strArr, new Descending()); //역순 정렬
		System.out.println("strArr = "+Arrays.toString(strArr));
        // new Descending() 정렬 기준
        // strArr  정렬 대상
	}

}

class Descending implements Comparator {  // Comparator 인터페이스를 구현
	public int compare( Object o1, Object o2) { //매개 변수 2개를 비교
		if ( o1 instanceof Comparable && o2 instanceof Comparable) {
			Comparable c1 = (Comparable) o1;
			Comparable c2 = (Comparable) o2;
			return c1.compareTo(c2) * -1 ;  // c1.compareTo 기본정렬기준
			}	
		return -1;
	}
}