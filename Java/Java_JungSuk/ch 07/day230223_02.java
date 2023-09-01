package day15;
// 다형성 복습 
// 정의 : 조상타입의 참조변수로 자손타입의 객체를 다루는것

//	생성된 인스턴스를 다루기위해 인스턴스의 타입과 일치하는 타임의 참조변수만 사용했음
//	Tv인스턴스를 다루기위해 Tv타입의 참조변수를 사용하고
//	SmartTv인스턴스를 다루기 위해 SmartTv타입의 참조변수를 사용했다.
//	 그러나 Tv와 SmartTv클래스가 서로 상속관계라면 ?

//	Tv t = new SmartTv(); , 가능	조상타입 참조변수로 자손타입 인스턴스 참조
//  SmartTv s = new Tv(); , 불가능 자손타입 참조변수로 조상타입 인스턴스 참조 할수가 없다.
// 					Tv의 멤버 개수보다 참조변수 s가 사용할수있는 멤버 개수가 더 많기 때문

// 1. 참조변수 타입을 인스턴스의 타입과 반드시 일치 해야할까?
// no , 일치하는것이 보통이지만 일치하지 않을수도 있음

// 2. 참조변수가 조상타입 일 때 와 자손타입 일 때의 차이는 ?
//  참조변수로 사용할수 있는 멤버의 갯수가 달라짐 

// 3. 자손타입 참조변수로 조사타입 객체를 가리킬수 있는가?
//  no , 불가 

class Tv{
	boolean power;
	int channel;
	void channelUp(){ ++channel;}
	void channelDown() { --channel; }
}

class SmartTv extends Tv {
	String color;
	String text;
	void caption() { System.out.println("이게 되네"); }
	
}

public class day230223_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tv t = new Tv();

		SmartTv s = new SmartTv();
		
		Tv t1 = new SmartTv();
		
		t.channel =10;
		System.out.println("Tv참조변수 Tv인스턴스 , Tv의 채널은"+ t.channel);
		t.channelUp();
		t.channelUp();
		t.channelUp();
		t.channelDown();
		// 예상 채널 12
		System.out.println("Tv참조변수 Tv인스턴스, Tv의 현재 채널은"+ t.channel);
		
		t1.channel = 5;
		System.out.println("Tv참조변수 SmartTv인스턴스, SmartTv의 채널은"+ t1.channel);
		t1.channelDown();
		t1.channelDown();
		t1.channelDown();
		System.out.println("Tv참조변수 SmartTv인스턴스, SmartTv의 현재 채널은" + t1.channel );
		
		System.out.println("t1.color = White; ,에러 발생 Tv클래스는 color변수가 없음");
		
//		t1.color = "White";	// 에러 발생 Tv클래스는 color변수가 없음
//		System.out.println("SmartTv의 색상은"+ t1.color );
		
		s.color = "White";
		System.out.println("SmartTv참조변수 SmartTv인스턴스 ? " + s.color);
		System.out.println("s.caption() 메서드 호출 ");
		s.caption();
	//	t1.caption(); t1 참조변수는 caption기능을 사용 할수가 없습니다..
		
	}

}
