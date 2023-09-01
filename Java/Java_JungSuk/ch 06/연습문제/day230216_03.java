package day15.연습문제;
// 연습문제 6-20
// 다음과 같이 정의된 메서드를 작성하고 테스트하시오

// 메서드명 : shuffle
// 기능 : 주어진 배열에 담긴 값의 위치를 바꾸는 작업을 반복하게 뒤섞이게 한다
// 		처리한 배열을 반환한다
// 반환타입 : int[ ] 
// 매개변수 int[ ] arr - 정수 값이 담긴 배열

// 
public class day230216_03 {

	static int[] shuffle ( int [] arr) {
		
		// 임시 저장 공간
		int tmp = 0;
			 
		for ( int i = 0; i < arr.length; i++) { // { }안의 내용을 배열의 길이만큼 반복
			
			// 0~1 사이의 랜덤한 난수 * 배열의 길이(9)
			// 나올 수 있는 숫자범위 = 0 ~ 8
			int j = (int)(Math.random()*arr.length); 
			
				// arr[i]와 arr[j]의 값을 바꾼다
		 		tmp =  arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
		}
		return arr;	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int[] original = {1,2,3,4,5,6,7,8,9};
			System.out.println(java.util.Arrays.toString(original));
			
			int[] result = shuffle (original);
			System.out.println(java.util.Arrays.toString(result));
	}

}
