public class day20230402_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("예제 8-5");
		System.out.println("printStackTrace() , getMessage()");
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(3/0);   // 이때 에러 예외 발생
										// 예외 객체가 생성이됨
			System.out.println("이거 실행 못할듯");
			
		} catch ( ArithmeticException ae) {  
		
			ae.printStackTrace();
			System.out.println("getMessage() : "+ae.getMessage());
		} // catch 끝남
		
		System.out.println();
		System.out.println("예아");
		
		
	
	}

}
