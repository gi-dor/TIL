package day15.접근제한자;
class Time {
//	 int hour; 	// 0 ~ 23 값만 가지고 싶음 
//	 int min;
//	 int sec;
	
	private int hour; 	// 0 ~ 23 값만 가지고 싶음 
	private int min;
	private int sec;
	
	public void setHour(int hour) {
		if ( hour < 0 || hour > 23) return;
		
		this.hour = hour;
	}
	public int getHour() { return hour; }
}
public class TimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time t = new Time ();
//		t.hour =200;
//		System.out.println(t.hour);  에러 - private은 같은 클래스 내에서만 쓸수 있음
 		t.setHour(21);
		System.out.println(t.getHour());
		t.setHour(100);
		System.out.println(t.getHour()); 
	}

}
