public class day230309_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			int[][] arr= {
					{ 5,5,5,5,5,},
					{10,10,10,10,10},
					{20,20,20,20,20},
					{30,30,30,30,30}
			};
			
			int total = 0;
			float average = 0;
			
			for( int i = 0; i< arr.length;i++) {
				for(int j = 0; j < arr[i].length; j++) {
					System.out.printf("arr[%d][%d] = %d%n",i,j,arr[i][j]);
					
					total = total + arr[i][j];
					average = (float)total/ (arr[i].length*arr.length);  // arr[i].length = 5; , arr.length = 4
				}		// 325.0 / 20
			}
			
			System.out.println("total = "+total);
			System.out.println("average = "+average);
	}

}
