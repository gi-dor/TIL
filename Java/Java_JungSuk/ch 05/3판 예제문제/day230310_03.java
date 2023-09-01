public class day230310_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				// 예제 5 - 19
		System.out.println("번호   국어   영어  수학   총점   평균");
		System.out.println("=================================");
		
		int[][] score = {
				{ 100 , 100 ,100},
				{ 20 , 20 , 20 },
				{ 30 , 30 , 30 },
				{ 40 , 40 , 40},
				{ 50 , 50 , 50},
				};
		
			int kor = 0;
			int eng = 0;
			int math = 0;
			for ( int i = 0; i < score.length; i++) {
				kor = kor + score[i][0];
				eng = eng + score[i][1];
				math = math + score[i][2];
				int sum = 0;
				float average = 0.0f;
				
				System.out.printf("%2d",i+1);
				
				for( int j = 0; j< score[i].length; j++) {
					sum = sum + score[i][j];
					System.out.printf("%6d", score[i][j]);
				}
				
				average = (float)sum / score[i].length;
				System.out.printf("%6d %6.2f" , sum , average);
				System.out.println();
		}
			System.out.println("==================================");
	 		System.out.printf("총점 : %3d %4d %5d",kor, eng, math);
			
				 	
	
	}

}
