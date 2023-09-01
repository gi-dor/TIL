//package day17;
//// 다형성
//
//// 여러 가지 형태를 가질수 잇는 능력을 의미한다
//// 자바에서는 한 타입의 참조변수로 여러타입의 객체를 참조할수 있도록 한다
//
//// 조상클래스 타입의 참조변수로  자손클래스의 인스턴스를 참조할수 있도록!
//
//// Tv t = new Tv();에서
//// Tv t  = new SmartTv();
//
//class Tv {
//	boolean power; // 전원 상태 on, off
//	int channel;  	// 채널
//
//	void power() { power = !power; }
//	void channelUp() { ++channel; }
//	void channelDown() { --channel; }
//
//}
//
//class SmartTv extends Tv {
//	String text;
//	void caption () {
//
//	}
//}
//
//public class day230222_01 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Tv t = new Tv ();
//		SmartTv s = new SmartTv();
//
//		Tv t = new SmartTv();  // 조상타입Tv의 참조변수 t로 자손타입의 SmartTv 객체 참조
//
//		t.channelUp();
//		System.out.println(t.channel);
//		// 참조변수 t로 SmartTv의 모든 모든 멤버를 사용할수는 없다
//		// SmartTv 멤버 중에서 Tv클래스에 정의 되지 않은 멤버 text와 caption() 은 참조변수 t로는 사용이 불가하다
//		// 같은 타입의 인스턴스지만 참조변수의 타입에 의해 사용 할수 있는 멤버의 개수가 달라진
//
//
//
//
//	}
//
//}
