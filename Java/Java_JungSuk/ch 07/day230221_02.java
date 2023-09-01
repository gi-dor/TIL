package day15;
// 접근제어자

class Time  {
	private int hour;	// 0 ~ 23 사이의 값을 가져야함
	private int min;
	private int second;

	public void setHour(int hour) {
		if ( hour < 0 || hour > 23 ) {	return; }
		this.hour = hour;
	}
	
	public int getHour () {
		return hour;
	}
}

public class day230221_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Time t = new Time();
	//	t.hour = 25;
		t.setHour(22); // hour의 값을 22로 변경
		System.out.println(t.getHour());
		t.setHour(77); // 
		System.out.println(t.getHour());
	}

}
