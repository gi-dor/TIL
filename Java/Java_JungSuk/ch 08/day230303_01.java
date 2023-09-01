package day22;
	// ch 8  예외발생시키기
	// 키워드 throw를 사용해서 고의로 예외를 발생시킬수 있음

	// 1. 연산자 new를 이용해서 발생시키려는 예외클래스의 객체를 만든다
	//Exception e =new Exception ("예외 발생");
	
	// 2. 키워드 throw를 이용해서 예외를 발생시킨다 
	//throw e;
public class day230303_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Exception e = new Exception("예외 발생");
			throw e;	// throw new Exception("예외 발생");  한줄로 줄일수 있
		} catch (Exception e) {
			System.out.println("에러 메세지: "+e.getMessage());
			e.printStackTrace();
			}
		System.out.println("프로그램 정상 종료");
	}

}
