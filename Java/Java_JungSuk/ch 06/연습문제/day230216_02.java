// 다음과 같이 정의된 메서드를 작성하고 테스트하시오
// 연습문제 6-24

// 메서드명: abs
// 기능: 주어진 값의 절대값을 반환한다
// 반환타입 int
// 매개변수 int value


// int abs ( int value ){

// }

package day15.연습문제;

public class day230216_02 {
	// abs 메서드를 작성하시오

	static int abs ( int value) {
//		if ( value >= 0 ) {
//			return value;
//		}else if ( value < 0) {
//			return (value*-1);
//		}
//		return value;
		
		if( value < 0) {
			return -value;
		} else {
			return value;
		}
		
//		return value < 0 ? -value: value;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// day230216_02 m = new day230216_02();
		
		int value = 5;
		System.out.println(value+"의 절대값: "+abs(value));
		value = -10;
		System.out.println(value+"의 절대값: "+abs(value));
	}

}
