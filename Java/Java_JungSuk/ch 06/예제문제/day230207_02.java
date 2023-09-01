package day15.예제문제;

public class day230207_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Tv t1 = new Tv();
			Tv t2 = new Tv();
			Tv t3 = new Tv();
			
			System.out.println("t1의 channel 값은 "+t1.channel+" 입니다");
			System.out.println("t2의 channel 값은 "+t2.channel+" 입니다");
			System.out.println("t3의 channel 값은 "+t3.channel+" 입니다");
	
			
			t1.channel = 6;
			t2.channel = 6; 
			
			t1.channelDown();
			t1.channelDown();
			
			t2.channelUp();
			t2.channelUp();
			t2.channelUp();
			
			t3.channelUp();
			t3.channelUp();
			
			
			System.out.println();
			System.out.println("t1의 channel 값을 "+ t1.channel +" 으로 변경 했습니다");
			System.out.println("t2의 channel 값을 "+ t2.channel +" 으로 변경 했습니다");
			System.out.println("t3의 channel 값을 "+ t3.channel +" 으로 변경 했습니다");
			
			

			t2.channel = t1.channel;
			System.out.println("t2.channel = t1.channel의 channel 값을 "+ t2.channel +" 으로 변경 했습니다");

	}

}
