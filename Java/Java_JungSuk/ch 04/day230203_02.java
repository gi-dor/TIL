package day03;

public class day230203_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1부터 5까지의 합을 구하라
		
		// 변수i를 1부터 5까지 변화시키면서 i를 sum에 더해서 누적시키기
		
		
		int sum = 0;
		
		 for (int i = 1; i<=5; i++) {
			 sum = sum+i;
			 System.out.printf("1부터 %d 까지의 합은 = %d%n",i,sum);
		 }

		 	int sum1 = 0;
		 for (int j =1; j<=10;j++) {
			 sum1 = sum1 +j;
			 System.out.printf("1부터 %d까지의 합 = %d%n",j,sum1);
		 }
		 
		
		 
	}

}
