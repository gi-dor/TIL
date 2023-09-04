public class day20230402_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("예제 8-6");
		System.out.println("예외 발생시키기");
		// 연산자 new 를 이용해서 발생시키려는 예외 클래스의 객체를 만듬
		// Exception e = new Exception ("123");
		
		//  키워드 throw를 이용해서 예외 발생함
		// throw e;
		
		// throw new Exception("123");
		
		
		try {
		 	Exception e = new Exception (" 123 ");
		    throw e ;
		    // throw new Exception ("123");
		    
		    } catch ( Exception e ){
		    System.out.println("에러 메세지 : "+ e.getMessage() );
		    e.printStackTrace();
		    }
		    System.out.println("종료 되었습니다");
		    
		    
	}

}
