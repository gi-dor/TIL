package day03;

public class day230406_01_Thread1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread1 t1 = new Thread1();
		
		Runnable r = new Thread2();
		Thread t2 = new Thread(r);
		//Thread t = new Thread ( (new Thread2() );

		t1.start(); // 0 을출력
		t2.start(); //1 을 출력
	
		
	}

}
class Thread1 extends Thread{ // 상속
	public void run() {
		for( int i = 0; i < 5; i++) {
			System.out.println(this.getName());
		}
	}
}

class Thread2 implements Runnable{ // 구현 
	public void run() {     // implements Thread 아님 Runnable임 ! 주의
		for( int i= 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
}
