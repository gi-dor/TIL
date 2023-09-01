package day18.예제문제;

import java.util.*;

public class day230405_06_HashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 기초판 예제 11-12 p 428
		HashSet setA = new HashSet();
		HashSet setB = new HashSet();
		HashSet setHab = new HashSet();
		HashSet setKyo = new HashSet();
		HashSet setCha = new HashSet();
		
		setA.add("1");
		setA.add("2");
		setA.add("3");
		setA.add("4");
		setA.add("5");
		System.out.println("A = "+setA);
		
		setB.add("4");
		setB.add("5");
		setB.add("6");
		setB.add("7");
		setB.add("8");
		System.out.println("B = "+setB);
		
		// 교집합
//		setA.retainAll(setB);
//		System.out.println(setA);
		
		// 합집합 setB의 모든 요소를 추가 ( 중복제거 )
//		setA.addAll(setB);
//		System.out.println(setA);
		
		// 차집합
		setA.removeAll(setB);
		System.out.println(setA);
		
		
		
//		Iterator it = setB.iterator();
//		while(it.hasNext() ) {
//			Object tmp = it.next();
//			if ( setA.contains(tmp))
//				setKyo.add(tmp);
//		}
//		
//		it = setA.iterator();
//		while(it.hasNext() ) {
//			Object tmp = it.next();
//			if( ! setB.contains(tmp) )
//				setCha.add(tmp);
//		}
//		
//		it = setA.iterator();
//		while(it.hasNext() )
//			setHab.add(it.next());
//		
//		it = setB.iterator();
//		while(it.hasNext() )
//			setHab.add(it.next());
		
		System.out.println("A ∩ B = " +setKyo );
		System.out.println("A ∪ B = " + setHab);
		System.out.println("A - B = " +setCha);
	}

}
