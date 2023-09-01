package day15.연습문제;

public class day230321_14 {

	static	int abs (int value) {
			if(value >= 0 ) {
				value = value*1;
			}else {
				value = value *-1;
			}
			return value;
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				System.out.println("연습문제 6- 24");
			int value = 5;
			System.out.println(value+"의 절대값 :"+abs(value));
			value = -10;
			System.out.println(value+"의 절대값 :"+abs(value));
	}

}
