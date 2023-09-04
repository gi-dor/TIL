public class day230402_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 기초판  try catch
		// 예제 8 - 1
		System.out.println("기본판 예제 8-1");
		System.out.println();
		System.out.println(1);
		try {
			System.out.println(2);
			System.out.println(3);
		}catch (Exception e) {
			System.out.println(4);
		}
		System.out.println(5);
		
			
		// 예제 8-2 
		System.out.println();
		System.out.println("기본판 예제 8 - 2");
		System.out.println(11);
		try {
			System.out.println(13/0);
			System.out.println(12);
			
		}catch (ArithmeticException ea) {
			
			System.out.println(14);
		}
		System.out.println(15);
		
		
		// 기본판 예제 8 - 3
		System.out.println();
		System.out.println("예제 8 - 3");	
	    System.out.println(21);
	    System.out.println(22);
	    
	    try {
	    	System.out.println(23);
	    	System.out.println(24/0);
	    	System.out.println(25);
	    } catch ( ArithmeticException EE){  // 산술계산
	    	System.out.println(26);
	    }
	    
	    System.out.println(27);
	}

}
