import java.util.Arrays;

public class day230309_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열의 활용
		System.out.println("예제 5-5 총합과 평균");
		
		int sum = 0;  // 총점 저장할 변수
		float average = 0f;	// 평균을 저장할 변수
		
		int [] score = {100,88,100,100,90};
		// 총합 구하기
		for( int i = 0; i<score.length; i++) {
			sum = sum+ score[i];
		}
		// 평균 구하기
		average = (float)sum / score.length;
		System.out.println("sum = "+sum);
		System.out.println("average = " +average);
		
		System.out.println();
	
			
			
			

	}

}
