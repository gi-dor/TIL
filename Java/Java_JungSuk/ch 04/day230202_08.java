package day03;

public class day230202_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
		// 임의의 정수 만들기
		// Math.random() 랜덤값 뽑기
		// Math.round()  소수점 첫째자리 반올림
		
		// 0.0  ~ 1.0 사이의 범위에 속하는 하나의 double값을 반환함
		// 0.0은 포함되고 1.0은 포함되지않음
		// 0.0 ~ 0.9999999999999999999999999999999999999  까지만 포함
		
		// 만약  1 ~ 5사이의 ( 1 <= x && x <= 5) 정수 5개  구하기
		
		// 0.0 <= Math.random() < 1.0
		// 0.0 * 5 <= Math.random() *5 < 1.0*5
		// 정수로 바꾸기
		// (int)0.0 <= (int)(Math.random() *5 ) < (int)*5
		// 0 <= (int)(Math.random()*5)<5
		// 1 ~ 5 사이의 값을 구하려고 하기때문에 
		// 1 <= x && x <=5
		// 0 +1 <= (int)(Math.random()*5) +1 < 5 +1
		// 1 <= (int)(Math.random()*5)+1 < 6
		// (int)(Math.random() *5 )
		// 1 은 포함되며 6은 포함되지 않은 정수가 랜덤으로 나옴

		
		System.out.println("1. 1 ~ 20 난수20개 구하기");
		// 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20
		// 20개
		System.out.println();
		
		for (int i = 1; i <=20; i++) {
			// System.out.println(Math.random()); 0.0 <= x < 1.0
			// System.out.println(Math.random()*20); 0.0 <= x < 19.0
			// System.out.println((int)(Math.random()*20)); 0 <= x < 19
			System.out.println((int)(Math.random()*20)+1); //1 <= x <20
		}
		
		
		System.out.println("2. -5 ~ 5 난수 20개 구하기");
		// -5 -4 -3 -2 -1 0 1 2 3 4 5
		// 11개 
		for (int i =1; i<=20; i++) {
			// System.out.println((int)(Math.random()*11)); 0 <= x < 11
			// 0 <= x < 11
			// -5 <= x < 6
			// -5 
			System.out.println((int)(Math.random()*11)-5);
		}
		// 로또 게임 
		// 숫자의 범위는 1 ~ 45
		// 번호의 갯수는 6개 
		System.out.println("3. 로또 게임");
		int x = 1;
		
		 for ( int y  = 1; y <= 6 ; y++) { // 조건식이 false가 되기전까지 반복
			x = (int)(Math.random () * 45)+1 ;
			
			System.out.println(x);
		 }
		 
		 System.out.println();
		 System.out.println();
		 
		 // 0.0 <= Math.random() <1.0
		 // 원하는 값의 범위가  1 ~ 45  45개 
		 // 0.0 *45 <= Math.random () *45 < 1.0*45
		 // 0.0 <= Math.random()*45 < 45.0
		 // (int)0.0 <= (int)(Math.random)() *45 < (int)45.0
		 // 0 <= (int)(Math.random()*45) < 45
		 // 0 ~ 44 까지의 범위이니
		 
		 // 1 ~ 45를 위해 +1씩
		 // 0 +1 <= (int)(Math.random()*45)+1 < 45 +1
		 // 1 <= (int)(Math.random()*45) +1 < 46
		 
		 // 1 ~ 45  까지의 랜덤 값
	
		 // 주사위  
		 // 6번 던져서 나온 모든 값에 합구하기
		 // 주사위 1 ~ 6까지 숫자니깐 *6
		 // 값 나올때를 sum으로 하고
		 // 계속 더 해줘야하니 대충 sum = sum + ?
		 
		 System.out.println("4. 주사위 게임");
		 int sum = 0;
		 int num = 0;
		 for (int i = 1 ; i <= 6 ; i++) {
			 num = (int)(Math.random()*6)+1;
		 
			 System.out.println("주사위 나온 숫자"+num);
			 sum  = sum + num ;
		 }
		 // sum + sum +num ; 이곳에 두면 
		 // 6번째 던진 주사위 값만 나옴  
		 System.out.println("주사위 6번던진 합"+sum);
	
	
	
	
	}
	
}
