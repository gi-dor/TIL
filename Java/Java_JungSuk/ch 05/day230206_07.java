public class day230206_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
		// 2차원 배열
		// 테이블 형태의 데이터를 저장하기 위한 배열
		
		int[][] score5 = new int[4][3];
		
		// 4행 3열 ,2차원 배열 생성
		
		// 행: 0,1,2,3 열 :0,1,2
		
		// 0,0  0,1  0,2 
		// 1,0  1,1  1,2
		// 2,0  2,1  2,2
		
		score5[0][0] = 100;
		System.out.println("score5[0][0] = "+score5[0][0]);
		System.out.println();
		
		
		int[][] score = {
				{100,100,100},
				{20,20,20},
				{30,30,30},
				{40,40,40}
				};
		
		int sum = 0;
		
		for ( int i =0; i < score.length; i++) { //score.length =4
			for ( int j =0; j < score[i].length; j++) {
									// score[i].length = 4
				System.out.printf("score[%d][%d] = %d%n", i ,j, score[i][j]);
				
				
				sum = sum + score [i][j];
			}
		
		}
		System.out.println("sum = "+sum);
		
			
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		int[][] score1 = {
				{100,100,100},
				{20 ,20, 20},
				{30,30,30},
				{40,40,40},
				{50,50,50}
				};
		
		
		// 과목 총점
		 int korTotal = 0;
		 int engTotal = 0;
		 int mathTotal = 0;
		 
		 System.out.println( " 번호 국어 영어 수학 총점 평균 ");
		 System.out.println("=============================");
		
		 
		 for ( int i =0; i < score1.length; i++) {
			 int sum1 = 0;
			 double avg = 0.0;
			 
			 korTotal = korTotal + score1[i][0];
			 engTotal = engTotal + score1[i][1];
			 mathTotal = mathTotal + score1[i][2];
		 System.out.printf("%3d" , i+1);
		
		 for (int j = 0; j < score1[i].length; j++) {
			 	sum1 = sum1 + score1[i][j];
			 	System.out.printf("%5d", score1[i][j]);
		 }
		 avg = sum1 / (double)score1[i].length;
		 System.out.printf("%5d %5.1f%n", sum1, avg);
		 }					
		 System.out.println("==============================");
		 System.out.printf("총점 : %d %d %d%n", korTotal,engTotal,mathTotal);
		 
		 
			 
	}

}
