package day15.연습문제;


class Excercise{
	// 연습문제 6-6 
	// 메서드 문제
	
	// 두점 (x,y) 와 (x1,y1)의 간의 거리를 구하시오 
	// 제곱근 계산은 Math.sqrt(double a)를 사용하시오
	
	static double getDistance (int x , int y , int x1, int y1) {
				// double result  =  (x-x1)^2 + (y-y1)^2;
				// double result =  (x-x1)*(x-x1) + (y-y1)*(y-y1);
				// return result =  ??
		
			    // Math.pow(x-x1,2); 
			// Mth.pow ( ) -> 제곱을 해주는 메서드
			//  (x-x1)^5 
			// Math.pow(3,5) 3의 5제곱 
				
				double result = Math.sqrt(Math.pow(x-x1,2)+Math.pow(y-y1, 2));
				// Math.sqrt((x-x1)*(x-x1) + (y-y1)*(y-y1));
				
				
		        return result ;
		        
		      
	}
}

public class day230215_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// error: System.out.println(getDistance(1,1,2,2));
		// The method getDistance(int, int, int, int) is undefined for the type day230215_01
		// 클래스이름 없이  메서드이름(매개변수,매개변수...)로 입력해서 오류 
		
		// 해결방법 :
		// 우석적으로 클래스가 다르다
		// 클래스메서드는 객체를 생성하지않고 '클래스 이름.메서드이름(매개변수,매개변수...)'로 호출이 가능함
		System.out.println(Excercise.getDistance(1, 1, 2, 2));
		
		
		
	}

}
