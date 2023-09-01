package day15.예제문제;

class day230207_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 	
		// Tv클래스 타입의 참조변수 t를 선언
		// Tv 인스턴스를 생성후 생성된 Tv인스턴스의 주소를 t에 저장
		// 클래스의 객체를 생성 후 , 객체의 주소를 참조변수에 저장
		
		// 객체 생성
			Tv t;			
			t = new Tv();	
			// Tv t = new Tv();
		 	
		// 객체 사용 	
		 	t.channel = 7;  // 변수사용
		 	t.channelDown();	// 메서드 사용
		 	System.out.println("현재 채널은 " + t.channel+" 입니다");
			
	}

}

			class Tv {
				// Tv의 속성 ( 멤버변수 )
				String color; 		// 색상
				boolean power;  	// 전원상태 ( on / off)
				int channel; 		// 채널
				
				// Tv의 기능(메서드)
				void power() { power = !power; }  
				void channelUp()	{	++channel; 	}
				void channelDown()	{	--channel;	}
				
			}
