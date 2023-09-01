// 상속

// 1.기존의 클래스를 재사용해서 새로운 클래스를 작성하는것
// 2.상속 해주는 클래스를 '조상 클래스' 상속받는 클래스를 '자손 클래스' 
// 3.자손 클래스는 조상클래스의 모든 멤버를 상속받는다(생성자, 초기화 블럭은 제외)
// 4.자손 클래스의 멤버개수는 조상 클래스로부터 항상 같거나 많다

// 새로 작성하려는 클래스 이름 뒤에 상속 받고자 하는 클래스의 이름을 extends와 함꼐 쓰면된다
// class Parent{ }
// class Child extends Parent {  }

// 예제 기초편 7-1

package day15;
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


public class day230220_01 {

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
			// 그래서 무야호 1 출력이 안됨
			
			cp.caption = true;
			cp.displayCaption("무야호2");
			
			// CaptionTv 내의  void displayCaption () 메서드 사용
			// void displayCaption(String text) {
			// if(caption) {
			//	 System.out.println(text);
			 
	
	}

}
