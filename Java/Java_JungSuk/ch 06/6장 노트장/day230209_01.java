// 자바의 기초 - 상속

// 상속
// 1. 기존의 클래스로 새로운 클래스를 작성하는 것 ( 코드의 재사용 )
// 2. 두 클래스를 부모와 자식으로 관계를 맺는것
// 3. 자손은 조상의 모든멤버를 상속 받는다 ( 생성자 , 초기화 블럭제외 )
// 4. 자손의 멤버개수는 조상보다 적을수 없다.
// 5. 자손의 변경은 조상에 영향을 미치지 않는다

// 구현방법 : 새로 작성하고자 하는 클래스의 이름뒤에
// 상속받고자 하는 클래스의 이름을 키워드 'extends'와 함께 쓴다

// ex)

// Class Parent { 
// Class Child(자식) extends Parents(부모) {

//		}
// }

// ex2 )

//		class Point{
//			 int x;
//	 		int y;
// 		}
//
// 1. 기존의 point와 관계없는 class를 생성
//		class point3D{
//			 int x;
//	 		int y;
//			 int z;
// 			}
//멤버가 계속 3개이며 point class가 변경되어도 point class와 관계가 없어서 영향을 안받음


 // 2. point class를 상속받아서 작성
// 		class point3D extends point{
//				int z;  
// 		}
//
// 부모 자식 관계이기 때문에 부모class에  변경이 있을시 영향이 있음




class Tv {
		boolean power; // 전원상태 on , off
		int channel;	// 채널
	
		void power() 	{ power = !power; }
		void channelUp()	{ ++channel; }	
		void channelDown()	{ --channel; }
}

class SmartTv extends Tv{ 	// SmartTv는 Tv에 캡션 (자막)을 보여주는 기능을 추가
		boolean caption; // 캡션상태 on / off
		void displayCaption ( String text) {
			if(caption) {
				System.out.println(text); // caption 상태가 on (true) 일 때만 text 보여줌
			}
		}
	
}

public class day230209_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		SmartTv stv = new SmartTv();
		stv.channel = 10;
		stv.channelUp();
		System.out.println( "stv.channel = "+stv.channel);
		
		stv.displayCaption("HELLO,WORLD");
		stv.caption = true;  // 캡션 (자막) 기능을 켠다
		stv.displayCaption("HELLO,WORLD");
		}
}
	
