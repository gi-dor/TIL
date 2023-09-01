package day18.예제문제;

import java.util.*;

public class day230404_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 기초편 예제 11 - 6 p418
		
		int[] arr = { 0,1,2,3,4 };
		int[][] arr2D = { {11,12,13} ,{21,22,23} };
		
		System.out.println("arr = "+Arrays.toString(arr));
		System.out.println("arr2D = "+Arrays.deepToString(arr2D) );  // 다차원은 deepToString 사용해야함
		
		// 복사
		int[] arr2 = Arrays.copyOf(arr,arr.length);
		int[] arr3 = Arrays.copyOf(arr,3); // 요소 3개만 복사
		int[] arr4 = Arrays.copyOf(arr,8); // 요소 8개 복사 모자르면 0 으로 채우기
		int[] arr5 = Arrays.copyOfRange(arr,2 ,4); // from2 ~ to4  2 <= x < 4
		int[] arr6 = Arrays.copyOfRange(arr,1 ,6); // from1 ~ to6  1 <= x < 6
		System.out.println("arr2 = "+ Arrays.toString(arr2) );
		System.out.println("arr3 = "+ Arrays.toString(arr3) );
		System.out.println("arr4 = "+ Arrays.toString(arr4) );
		System.out.println("arr5 = "+ Arrays.toString(arr5) );
		System.out.println("arr6 = "+ Arrays.toString(arr6) );
		
		int[] arr7 = new int[15]; // 길이가 15인 배열 arr7
		
		Arrays.fill(arr7, 2);  // 배열 2로 채우기
		System.out.println("arr7 = "+ Arrays.toString(arr7) );
		
		Arrays.setAll(arr7, i -> (int)(Math.random()*8)+1); // 난수로 채우기
		System.out.println("arr7 = "+ Arrays.toString(arr7) );
		
		String[][] str2D = new String[][] { {"aaa","bbb"} , {"AAA","BBB"} };
		String[][] str2D2 = new String[][] { {"aaa","bbb"} , {"AAA","BBB"} };
		System.out.println(Arrays.equals(str2D, str2D2) );  
		System.out.println(Arrays.deepEquals(str2D, str2D2) );
		
		// equals() 는 문자열을 비교하는게 아닌 배열에 저장된 주소를 비교함

		char [] chArr = { 'A','E', 'D','C','B'};
		System.out.println("chArr = "+Arrays.toString(chArr));
		System.out.println("intdex : " +Arrays.binarySearch(chArr, 'B'));  // 정렬 안했음
		
		System.out.println("sort 정렬");
		Arrays.sort(chArr);
		System.out.println("chArr = "+Arrays.toString(chArr));
		System.out.println("intdex : "+Arrays.binarySearch(chArr, 'B') );  
		

	}

}
