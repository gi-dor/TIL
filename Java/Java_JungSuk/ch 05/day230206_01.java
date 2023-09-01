import java.util.Arrays;

public class day230206_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 배열의 길이
				// 배열이름.length -배열의 길이 (int형 상수)
				
				// int [] arr = new int[5];  길이가 5인 int배열
				// int tmp = arr.length; 
				// arr.length의 값은 5이고 tmp에 5가 저장된다
				
				// 배열은 한번 생성하면 (실행 하는동안) 그 길이를 바꿀수 없다.
				
				
				
//				int[] score = new int[6];
//				
//				for(int i = 0; i <6; i++) {
//					System.out.println(score[i]);
//					// 배열의 모든 요소 출력
//				}
//				 
//				for( int i =0; i < score.length ; i++ ) {
//					System.out.println(score[i]);
//				}
//				
				int[] arr = new int[7]; // 길이가 5인 int 배열 arr 생성
				// index범위 0~7-1
				
				int[] arr2 = new int [10]; // 길이가 10인 int 배열 arr2
				// index 범위 0 ~ 10-1
				
				System.out.println("arr.length = "+ arr.length);
				System.out.println("arr2.length = "+ arr2.length);
				
				System.out.println();
				
				for ( int i =0; i<7; i++) {
					System.out.println("arr["+i+"]= " +arr[i]);
				}
				
				System.out.println();
				for ( int i =0; i < arr2.length; i++) {
					System.out.println("arr[" +i+ "] = "+ arr2[i]);
				}
				System.out.println();
				
				
				
				// 배열의 초기화
				// 배열의 각 요소에 처음으로 값을 저장하는 것
				int [] score = new int[5];  // index범위:0 ~ 5-1 
				score[0] = 50;
				score[1] = 60;
				score[2] = 70;
				score[3] = 80;
				score[4] = 90;
				
				// int score = new int [5];
				for( int i = 0; i <score.length; i++) {
					score[i] = i*10 +50;
				}
				
		//
				int [] score1 = new int[] { 50, 60,70,80,90};
				int [] score2 = {50,60,70,80,90}; //  주로 사용
				
				System.out.println("score1 = "+score1[2]);
				
				
				// 배열의 출력
				
				
				int[] iArr1 = { 100,90,80,70,60}; // 배열길이 5개
				// iArr.length = 5;
				
				System.out.println("iArr = "+iArr1);  
				//[I@2a139a55 문자열이 출력됨
				// 배열 이름만으로는 출력이 안됨
				
				
				char[] chArr = {'a','b','c','d'};
				System.out.println("chArr = "+chArr);
				// char 배열경우에만 이름만으로 출력이됨
				
								// 0 ~ 5-1(0,1,2,3,4)
//				for ( int i =0; i <iArr.length; i++) {
//					System.out.println(iArr[i]);
//				}
				
				
				System.out.println("Arrays(iArr1) = "+Arrays.toString(iArr1));
													// 배열의 내용을 문자열로
				
				
			int [] iArr2= {100,90,80,70,60,50}; // 길이가 6인 int 배열
			
				//	System.out.println(iArr2);  [I@6d06d69c 출력됨
			
		 	
				for ( int i = 0; i < iArr2.length;i++) {
					System.out.println("iArr2 = "+iArr2[i]);
				}
				
				System.out.println("Arrays(iArr2) = "+Arrays.toString(iArr2));
			
		
	}

}
