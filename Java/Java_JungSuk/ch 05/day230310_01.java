//package day28;
//
//import java.util.Arrays;
//
//public class day230310_01 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//				// Q .1 배열 arr의 정렬된 결과를 출력하시오
//				// int [] arr = { 7,4,1,6,4,2,2,3,5,3,1};
//
//				int[] arr = {7,4,1,6,4,2,2,3,5,3,1};
//				System.out.println("Arrays.toString(arr) 요소 확인하기");
//				System.out.println(Arrays.toString(arr));
//
//				System.out.println(); // 구분선 줄 띄우기
//
//				for(int i = 0; i< arr.length-1; i++) {
//					// 총 11개의 요소를 총 10번 비교 하기 때문에 length-1
//					for( int j = 0; j < arr.length-1-i;j++){ //
//															 // 비교횟수 10 - i
//						if( arr[j] > arr[j+1]) {		  	 // 9 <= 10-1
//							int tmp = arr[j];				 // 8 <= 10-2
//							arr[j] = arr[j+1];				 // 7 <= 10-3
//							arr[j+1] = tmp;
//						}
//						System.out.println(Arrays.toString(arr)); // 순서 바꾸는 과정 출력
//
//					}
//				}
//
//				for ( int i = 0; i < arr.length; i++) {
//					System.out.print(arr[i]);
//				}System.out.println();
//
//				System.out.println(Arrays.toString(arr)); // 최종출력
//
//
//
//				// Arrays로 배열 다루기
//
//				// 배열의 정렬 - sort()
//
//					int[] arr = {7,4,1,6,4,2,2,3,5,3,1};
//
//					Arrays.sort(arr);
//					System.out.println(Arrays.toString(arr));
//
//
//
//	 	}
//
//}
