public class day230320_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Q. 1-1 두개의 정수 x ,y 를 저장하기위한 인스턴스 변수가 선안된 Point 클래스를 정의하시오
		// Q. 1-2 Point 클래스를 작성된것을 보고 Point객체를 생성하는 코드를 작성
		
		// Q. 1-3 Point클래스에 toString() 을 오버라이딩해서 x와 y의 값을 포함한 문자열을 반환하도록하시오
		// 	 	  객체를 생성한 다음 x와y의 값을 3과 5로 초기화 하시오
		// 		  toString()을 호출해서 x와 y의 값을 출력하시오
		 
				
		
		
		// Q. 1-2 Point 클래스를 작성된것을 보고 Point객체를 생성하는 코드를 작성
		//	Point p = new Point();
		
		// Q. 1-3  객체를 생성한 다음 x와y의 값을 3과 5로 초기화 하시오
			Point p = new Point();
			p.x = 3;
			p.y = 5;
			System.out.println(p.toString());
		
	}

}

//Q. 1-1 두개의 정수 x ,y 를 저장하기위한 인스턴스 변수가 선안된 Point 클래스를 정의하시오
 	class Point{
 		int x;
 		int y;
 		
 		Point(){}  // 기본생성자 - 추가안하면 위에 객체 생성부분인 new Point() 에러발생
 		
 		Point(int x , int y){
 			this.x =x;
 			this.y =y;
 		}
 			
 		public String toString() {
 				return "x : " +x+ ", y : "+y;
 		}
 		
 		
 	}
