package day22;

public class day230302_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4); 	// 실행되지 않음
		} catch (ArithmeticException ae) {
			System.out.println("true");
			System.out.println("ArithmeticException");
		}catch (Exception e) {
			System.out.println("Exception");
		}	// try catch문의 끝
		System.out.println(6);
	}	// main 메서드의 끝

}
