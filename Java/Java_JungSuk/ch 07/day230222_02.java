package day15;
// 참조변수의 형변환 
// 자손타입의 참조변수를 조상타입의 참조변수로
// 조상타입의 참조변수를 자손타입의 참조변수로 형변환만 가능하다

// 자손타입 →→ 조상타입 : 형변환 생략 가능
// 조상타입 →→ 자손타입 : 형변환 생략 불가능
public class day230222_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = null;
		FireEngine fe = new FireEngine(); // FireEngine 객체생성
		FireEngine fe2 = null; 
		
		fe.water();
		car = fe;						// fe 값을 car에 저장 
		// car = (Car)fe;
		fe2 = (FireEngine)car;
		// 여기좀 헷갈림 
		// 복습할때 확인하고 이해한 부분 적어두기 메모...
		fe2.water();
		
			
	}

}





class Car {
	String color;
	int door;
	
	void drive() {
		System.out.println("지나갑니다~");
	}
	
	
	void stop () {
		System.out.println("나오십쇼 ~");
	}
}

	class FireEngine extends Car{
		void water() {
			System.out.println("물 뿌립니다~");
		}
	}


