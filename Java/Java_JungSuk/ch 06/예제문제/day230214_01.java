package day15.예제문제;

public class day230214_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 메서드 예제
		// 메서드선언 , 메서드 호출
		MyMath mm = new MyMath();
		
		
		 
		int add01 = mm.add(2, 7);
				System.out.println("add(2,7) = "+add01);
		long add02 = (int)mm.add1(3, 4L);  
				System.out.println("add1(3,4L) = "+ add02);
		int add03 = (int)mm.add2(5L,6L);  // 형변환 (int)사용
				System.out.println("add2(5L,6L) = " + add03);
				
				
		int sub01 =mm.sub(3,6);
				System.out.println("sub(3,4) = "+sub01);
		long sub02 = mm.sub1(7,2L);
		System.out.println("sub1(7,2L) = "+sub02);
		int sub03 = (int)mm.sub2(6L, 1L);
		System.out.println("sub2(6L,1L) = "+sub03);
		
		
		int multi01 = mm.multi(3, 5);
		System.out.println("multi(3,5) = "+multi01);
		
		long multi02 = mm.multi1(6,2L);
		System.out.println("multi1(6,2L) = "+multi02);
		
		double multi03 = mm.multi2(8L, 11L);
		System.out.println("multi2(8L,11L) = "+multi03);
	
		

		
		
	}

}


class MyMath {
	int add ( int a , int b) {
		int result = a + b ;
		return result;
	}
	
	long add1 (int a, long b) {
		long result = a+b;
		return result;
	}
	
	long add2 ( long a , long b) {
		long result = a + b;
		return result;
	}
	
	int sub ( int a , int b ) {
		int result = a -b;
		return result;
	}
	
	long sub1 (int a, long b) {
		long result = a - b;
		return result;
	}
	
	long sub2 ( long a, long b) {
		long result = a - b;
		return result;
	}
	
	int multi ( int a , int b) 
		{return a * b;} // int result = a * b
						// return result  두줄을 한줄로 변경
	long multi1 (int a , long b)
	{ return a * b; }
	
	long multi2 ( long a , long b)
	{ return a * b; } 
	
	
	void print99danAll() {
		for ( int i = 1; i <= 9 ; i++) {
			for ( int j =2; j <=9; j++) {
				System.out.print(j +"*"+ i +"="+(i*j) );
			}
			System.out.println();
		}
	}
	
	
	
 }



