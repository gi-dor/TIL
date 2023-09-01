package day22;

public class day230303_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 
		System.out.println("예제 8-1");
		System.out.println(1);
		try {
			System.out.println(2);
			System.out.println(3);
		}	catch (Exception e) {
			System.out.println(4); // 실행 x
		}
		System.out.println(5);
		
		System.out.println("예제 8-2");
		System.out.println(1);
		try {
			System.out.println(0/0);  // 0/0고의적으로 ArithmeticException 발생
			System.out.println(2);	// 생략
		}	catch (ArithmeticException e) {
			System.out.println(3);
		}
		System.out.println(4);
		
		System.out.println("예제 8-3");
		System.out.println(1);
		System.out.println(2);
		
		try { 
			System.out.println(3);
			System.out.println(3/0);	// 0으로 나누어서 고의적으로 ArithmeticException 발생
			System.out.println(4);		// 생략
		}	catch (Exception e)	{	// AritmethicException 대신 Exception 사용
				System.out.println(5);
		}
		System.out.println(6);
	}

}
