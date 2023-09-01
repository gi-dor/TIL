import java.util.Arrays;

public class day230206_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		// 배열의 총합과 평균 구하기
		System.out.println("1. 배열의 총합과 평균 구하기");
		int sum = 0;
		double average = 0;
		int[] score = { 100,88,100,100,90};
		
		for ( int i = 0; i < score.length; i++) {
			sum = sum +score[i];
			
		}
		average = sum / (double)score.length;
		
		
		System.out.println("총합 = "+ sum);
		System.out.println("평균 = "+ average);
		System.out.println();
		
		System.out.println("2. 배열의 최소값과 최대값 구하기");
		int[] score1 = {79,88,91,33,100,55,95};
		
		int max = score1 [0]; // 배열의 첫번째 값 79로 최대값 초기화
		int min = score1 [0]; // 배열의 첫번째 값 79로 최소값 초기화
			
				// i = 1  -> 88, 배열의 두번째 요소부터 읽기 위해서 i의 값을 1로 초기화
		for ( int i = 1; i < score1.length; i++) {
		if ( score1[i] > max) {
			max = score1[i];
		}else if ( score1[i]<min) {
			min = score1[i];
			}
		} System.out.println("최대값 :"+ max);
		  System.out.println("최소값 :"+ min);
		  System.out.println();
		  
		  System.out.println("3. 배열의 섞기");
		  int [] numArr = {0,1,2,3,4,5,6,7,8,9};
		  System.out.println(Arrays.toString(numArr));
		  
		  for ( int i = 0; i<100; i++ ) {
			  int n = (int)(Math.random()*10); // 0 ~ 9중의 한 값을 임의로 얻기
			  int tmp = numArr[0];
			  numArr[0] = numArr[n];
			  numArr[n] = tmp;
			  
		  }
		  System.out.println(Arrays.toString(numArr));
		  System.out.println();
		  
		  
		  
		  System.out.println("4. 로또 번호 만들기");
		  
		  int[]ball = new int[45]; // 45개의 정수값 저장하기위해 배열 생성
		  
		  for ( int a  = 0; a < ball.length; a++) 
			  ball[a] = a+1;	// 1 ~ 45
		  
		  
			  
			  int tmp = 0; // 두 값을 바꿀 임시저장공간
			  int j  = 0; // 임의의 값을 얻어서 저장할 변수
			
			  for ( int a =0; a< 6 ; a++) {
				  j = (int)(Math.random()*45);
			 tmp = ball[a];
			 ball [a] = ball[j];
			 ball[j] =  tmp;
			  }
			  
			  for ( int a =0; a <6; a++) {
				  System.out.printf("ball[%d] = %d%n" , a ,ball[a]);
			  }
			  
		  
		  
		  
	}

}
