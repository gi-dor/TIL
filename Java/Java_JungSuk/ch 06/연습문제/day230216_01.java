package day15.연습문제;

// 연습문제 6-23
// 메서드명 : max
// 기능 : 주어진 int형 배열의 값중에서 제일 큰값을 반환한다
// 만약 주어진 배열이 null이거나 크기가 0인경우 -999999을 반환한다
 

// 반환타입 : int
// 매개변수 int[]arr

// int (int[]arr){  // 선언부 
// int[] arr == null ||  arr.length == 0  
// return -999999 

public class day230216_01 {

	// 클래스 메서드static 인 이유는 
	// 인스턴스 메서드는 객체를 생성해야 호출할수있기 때문
static	int max  (int [] arr) {
		if(arr == null  ||  arr.length == 0)
			return  -999999;
		// max = -999999
		
		
		int max = arr[0];
		// -999999을 arr[0]첫번째 배열에 입력
				
		// arr[0]= -999999이니 arr[1]부터 비교
		for ( int i =1; i < arr.length; i++) {
			 if ( arr[i] > max) {
				 max = arr[i];
			 }			
			
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] data = {3,2,9,4,7};
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("최대값 : "+ max(data));
	
		System.out.println("최대값 : "+ max(null));
		System.out.println("최대값 : "+ max(new int[] { }) ); //크기가 0 인 배열
	}

}
