package day15.예제문제;



public class day230213_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 정석 3판 예제 6-6 
		// 메서드 - 호출스택 문제
		
		Mymath m = new Mymath();
		
		long result1 = m.add(5, 2);
		long result2 = m.sub(10, 7);
		float result3 = m.multi(2, 6);
		double result4 = m.divide(10, 4);
		float result5 = m.multi1(10, 4);
		//   
		
		
		System.out.println("add(5,2) = "+result1);
		System.out.println("sub(10,7) = "+result2);
		System.out.println("multi(2,6) = "+result3);
		System.out.println("divide(10,4) = "+result4);
		System.out.println("divide(10,4) = "+result5);
		
		
	}

}
	class Mymath{
	
			long add(int x, int y) { // 반환타입(출력)  메서드 이름 ( 매개변수(입력값),매개변수(입력값))
				long result = x + y;	// result = x +y
				return result;	// result 결과 값을 반환
			}
			
			long sub( int x , int y) { // 매개변수는 메서드내에 선언 된것으로 간주하기 때문에 '지역변수 (lv)'이다
				int result = x - y;
				return result;
			}
			
			float multi ( int a , long b) { // int로 입력값을 받았지만 자동형변환에 의해
				float  result = a * b;		// 2.0 6.0을 입력받았음
				return result;
			}
			
			double divide ( int a , int b ) {	// 마찬가지로 int값을 입력받아서 	
				double result = a / b;			// double로 자동형변환 되어서
				return result;					// 10/4 가 아닌 10.0/ 4.0 = double타입의 값 이 도출됨
			}
			
			float multi1 ( int a , long b) { // 입력받는 매개변수 타입이 다를시
				long  result = a * b;	// result 타입이 long인데 자동형변환됨
				return result;				// long < float 이기 때문에  반환타입 float로 해도 가능	
			}
			
			
//			int multi2 ( int a , long b) { 
//				float  result =  a * b;	
//				return result;			
//			}
			//	Type mismatch: cannot convert from float to int
			// 해결 방법 : 
			//	1. int multi2 ( int a, long b) -> float multi2 ( int a, long b)
			//  2. float result = a* b; -> int result = a * b;
			//	3. flaot (int)result;    
			
			
			

	
}
