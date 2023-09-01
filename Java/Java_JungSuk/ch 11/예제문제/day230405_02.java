package day18.예제문제;

import java.util.Arrays;
import java.util.Comparator;

public class day230405_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 기초편 예제 p423 11-8
		// Integer Comparable
		
		
		Integer[] arr = { 30,50,10,40,20};
		// Integer 배열 arr 
		Arrays.sort(arr); // 정렬 
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr, new DescComp());
		System.out.println(Arrays.toString(arr));
	}

}

class DescComp implements Comparator {
	public int compare(Object o1 , Object o2) {
		if ( ! (o1 instanceof Integer && o2 instanceof Integer))
			return -1;
		
		Integer i = (Integer)o1;
		Integer i2 = (Integer)02;
		
		return i.compareTo(i2)* -1 ;
	}
}