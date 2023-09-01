package day15.예제;

class Tv {
	boolean power;
	int channel;
	
	void power() { power = !power;}
	void channelUp() { ++channel;}
	void channelDown() { --channel;}
	
}

class CaptionTv extends Tv{  // Tv클래스를 상속받은 CaptionTv클래스
	 boolean caption;
	 void displayCaption(String text) {
		 if(caption) {
			 System.out.println(text);
		 }
	 }
	
}

public class day230318_01 {	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("예제 7 - 1");
			
			// Tv클래스의 멤버 5개 
			// CaptionTv클래스의 멤버 2개 + 상속받은 멤버 5개 총 7개
		
			CaptionTv cp = new CaptionTv();
			cp.channel = 10;
			cp.channelUp();
			System.out.println("channle = "+cp.channel);
			cp.displayCaption("무야호1");
			System.out.println("caption 상태가 false 상태임");
			
			cp.caption = true;
			cp.displayCaption("무야호2");
			
			// CaptionTv 내의  void displayCaption () 메서드 사용
			// void displayCaption(String text) {
			// if(caption) {
			//	 System.out.println(text);
			 
			
	}

}
