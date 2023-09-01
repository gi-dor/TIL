package day03;

public class day230201_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// if 문
		// if (조건식) 조건식이 true이면 { } 안의 문장들을 실행함
		// false 이면 {  } 다음 문장을 실행함.
		
		
		
			int score =70;
			if (score > 60) {
				System.out.println("합격입니다");
				System.out.println("축하 합니다");
			}
			if ( score >60)  
				System.out.println("합격입니다 1"); // 대괄호 없이 if문 수행가능한 문장
			
			if (score > 65)
				System.out.println("합격입니다2"); // 대괄호 없이 if문에 속한 문장
				System.out.println("합격입니다3"); // 대괄호가 없어 if문에 속하지 않은 문장
				
			int x = 0;
			System.out.printf("x = %d 일때 , true 인 것은 %n" ,x);
			
				// 비교연산자 == 사용
			if (x==0) System.out.println("x==0");
				// x는 0이다
			if (x!=0) {
				System.out.println("x !=0");
			} 	// x는 0이 아니다
			if (!(x==0))System.out.println("!(x==0)");
				// !(x는 0이다) -> x는 0 아니다
			if (!(x !=0)) {
				System.out.println("!(x !=0)");
			}	// !(x가 0 이 아니다)  -> x는 0 이다 
			
			
			x = 1;
			System.out.printf( "x가 %d일떄 , true 인 것은%n", x);
			if(x==0) System.out.println("x==0");
				// x가 0 과 같을때 
			if(x != 0)System.out.println("x!=0");
				// x가 1일 아니다
			if(!(x==0))System.out.println("!(x==0)");
				// !(x는 0과같다) -> x는 0이 아니다
			if(!(x != 0))System.out.println("!(x !=0)");
				// !(x는 0 이 아니다) -> x는 0이다
	}

}
