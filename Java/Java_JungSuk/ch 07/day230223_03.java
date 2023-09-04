//package day15;
//
////	 참조변수의 형변환 복습
//// 사용할수있는 멤버의 갯수를 조절함
//// 조상,자손 관계의 참조변수는 서로 형변환 가능함
//public class day230223_03 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		Car car = null;
//		FireEngine fe = new FireEngine();
//		FireEngine fe2 = null;
//
//		fe.water(); // ok
//		car = fe;	//  형변환
//		// car = (Car)fe;
//
//		// 조상타입을 자손타입으로 형변환 하는 경우 형변환 생략불가
//		fe2 = (FireEngine)car;
//		fe2.water();
//	}
//
//}
// 	class Car {
// 		String color;
// 		int door;
// 		void drive() {
// 			System.out.println("출발 합니다");
// 		}
// 		void stop() {
// 			System.out.println("정지 합니다");
// 		}
// 	}
//
// 	class FireEngine extends Car{
// 		void water(){
// 			System.out.println("물 뿌립니다");
// 		}
// 	}
