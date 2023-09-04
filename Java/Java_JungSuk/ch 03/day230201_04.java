package ch03;

public class day230201_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 456을 400으로 만들어야하는 문제
		// 100의자리 이하를 버리는 코드이다
		// 111이라면 100이 되게 만들수 있어야한다
		
		

		int num = 456;
		// 456*0.01 = 4.56
		// 4.56에서 int 형변환으로 0.56없이 4 나오게
		// 4에서 400 만들기
		System.out.println(num * 0.01);
		System.out.println((int)(num*0.01));
		System.out.println((int)(num*0.01)*100);
		
		// 변수 num1 에 값에 따라 '양수' '음수' '0' 을 출력하는 코드이다
		// 삼항 연산자를 이용해서 알맞은 코드를 넣으시오
		// 힌트 : 삼항연산자 두번사용하셈
	
		int num1 = 10;
		
		char ch = num1 < 0 ? '-' :(num1 == 0)?'0': '+';
		
		System.out.printf("ch = %c%n" , +ch);
		System.out.println("ch = "+ch);
		
		String str = num1 < 0 ? "음수" : (num1==0)? "0" : "양수";
		
		System.out.println("str = " +str);
		System.out.printf("str = %s%n" , str);
		
		
		
	}

}
