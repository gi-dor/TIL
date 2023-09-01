package day03;

public class day230203_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		// for문
		// for문은 초기화 조건식 증감식 블럭{ } 4부분으로 이루어져 있으며 
		// 조건식이 true 인동안 문장들을 반복하다가 false가되면 반복문을 벗어난다
		// 초기화 -> 조건식 -> 수행될문장 -> 증감식  순서로 진행
			// 1부터   	 5까지  1씩 증가
			// i = 1 , 2, 3 ,4 ,5
		System.out.println("1. 1부터 1씩 증가");
		for ( int i = 1; i <=5; i++) { // {  } 안의 문장 5번 반복
			System.out.println(i);
		}
	
		System.out.println("2. i를 2배씩 증가");
		
				//  i를 1씩 증가가 아닌 2배씩 증가
				// for (int i =1 ; i <=10; i=i*2)  1,2,4,8
				// for (int i =2; i <=12; i=i*2)  2,4,8
		
		for(int i =1 ; i <=10; i=i*2) {
			System.out.println(i);
		}
		
		
		
		
				// i를 2씩 증가
				// for(int i =1; i <=10 ; i= i+2)  1,3,5,7,9
				// for(int i =0; i<=10 ; i= i+2) 0,2,4,6,8,10
				
		System.out.println("3. 1부터 2씩 증가");
		
		for(int i =1; i <=10 ; i= i+2) { // 1 3 5 7 9 
			System.out.println(i);
		}
		
		
		System.out.println("4. 0부터 2씩 증가");
			
		for(int i =0; i<=10 ; i= i+2) {   // 0 2 4 6 8 10
			System.out.println(i);
		}
			

			System.out.println("5. int i ,j 사용");
			
			for( int i = 1 ,j=10; i <=10 ; i++ ,j--) {
				System.out.println("i = "+i+", j = "+j);
			}
			
			
			
			System.out.println("6. int i ,j 빼서 사용");
			
			int i;
			int j;
			for (i = 10, j =1; i>=1 ; i--,j++) {
				System.out.println("i = "+i+", j = "+j);
			}
			
	//		System.out.println("무한 반복문");
			// 조건식을 생략한다면 true로 간주되어서 무한반복문이 됨
	//		for (;;) {
		//		System.out.println("i = "+i+", j = "+j);
		//	}
		
				
	}

}		
