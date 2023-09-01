package day15.예제;

abstract class Player {  // 추상 클래스  (추상 메서드를 가지고있는 클래스), 미완성 설계도 미완성 클래스
	abstract void play (int pos); 	// 추상 메서드
	abstract void stop() ;	// 선언부만 있고 구현부 { } 가 없는메서드
}

// 추상 클래스는 상속을 통해 완성해야 객체 생성가능
class AudioPlayer extends Player{
	void play (int pos) {System.out.println(pos +" 위치부터 play 합니다 "); }
	void stop () {System.out.println("재생을 멈춥니다");}
}

public class day230327_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		AudioPlayer ap = new AudioPlayer(); 
		Player ap = new AudioPlayer();
		ap.play(10017);
		ap.stop();
	}

}
