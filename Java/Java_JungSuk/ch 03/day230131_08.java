package ch03;

public class day230131_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double pi = 3.141593;
		System.out.println("pi ="+pi);
		
		double pi0 = Math.round(pi*10)/10.0;
		System.out.println("pi0 = "+pi0);
		
		double pi1 = Math.round(pi*100)/100.0;
		System.out.println("pi1 = "+pi1);
		
		double pi2 = Math.round(pi*1000)/1000.0;
		System.out.println("pi2 = "+pi2);
		
		double pi3 = Math.round(pi*10000)/10000.0;
		System.out.println("pi3 = "+pi3);
		
		System.out.println("소수점 둘쨰자리 반올림 = "+ Math.round(pi*10)/10.0);
		System.out.println("소수점 셋째자리 반올림 = "+Math.round(pi*100)/100.0);
		System.out.println("소수점 넷째자리 반올림 = "+Math.round(pi*1000)/1000.0);
		System.out.println("소수점 다섯째자리 반올림 = "+Math.round(pi*10000)/10000.0);
			
		// 1000.0 이 아닌 1000으로 나누기
		
		
		// 응용문제
		
		// double pi = 3.141593
		
		
		
		// 값으로 3.141  나오게하기
		System.out.println(pi*1000);
		System.out.println((int)(pi*1000));
		// 형변환 int를 사용해서 값을 손실되게함
		// 실수에서 정수가 되어서 소수점 아래 숫자들이 다 날아감.
		System.out.println((int)(pi*1000)/1000.0);
		
		
		
		// 값으로 3.14159 
		System.out.println(pi*100000);
		System.out.println((int)(pi*100000));
		System.out.println((int)(pi*100000)/100000.0);
				
		
		
		
	
	}

}
