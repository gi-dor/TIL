package day22;

public class day230303_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//  printStackTrace()  와 getMessage() 
		
		// 1. printStackTrace()  
		// 예외발생 당시의 호출스택에 있었던 메서드의 정보와 예외 메시지를 화면에 출력
		
		// 2. getMessage()
		// 발생한 예외클래스의 인스턴스에 저장된 메시지를 얻을수 있다.
		
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(4/0);
			System.out.println(5);
		}	catch (ArithmeticException ae) {
			ae.printStackTrace();
			System.out.println("getMessage() - 예외메세지 출력 : "+ ae.getMessage());
		}
		
	}

}
