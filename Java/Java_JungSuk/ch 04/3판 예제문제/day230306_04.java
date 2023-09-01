import java.util.Scanner;

public class day230306_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
			System.out.println("예제 4 - 12");
		
			for ( int i = 1; i <= 5; i++)
				System.out.println(i);
			
			for (int i = 1; i <= 5; i++) 
				System.out.print(i);
				
				System.out.println();
			
				System.out.println("예제 4 - 13");
				
				int sum = 0; // 합을 저장할꺼임 ㅇㅇ
				for ( int i = 1; i <= 10; i++) {
					sum +=i;	// sum = sum + i; -> 0 = 0 + i;
					System.out.printf("1부터 %d까지의 합은 : %d%n",i ,sum);
				}
				// sum = sum +i
				// 0 = 0+1
				// 3 = 1+2
				// 6 = 3+3
				// 10 = 6+4
				// 15 = 10+5
				// 21 = 15+6
				// 28 = 21+7
				// 36 = 28 +8
				// 45 = 36 + 9
				// 55 = 45+10
				
				
				
					System.out.println("예제 4- 14");
						for ( int i = 1, j=10; i<=10; i++ , j--) {
							System.out.printf("%d \t %d%n" ,i ,j);
						}
						// 예상 : 
						// 1 10
						// 2 9
						// 3 8
						// 4 7
						//....
						// 10 1
				
						System.out.println("예제 4 - 15");
				
						
						System.out.println("i \t 2*i \t 2*i-1 \t i*i \t 11-i \t i%3 \t i/3");
						System.out.println("---------------------------------------------------");
						for ( int i =1; i <= 10; i++ )
							System.out.printf("%d \t %d \t %d \t %d \t %d \t %d \t %d%n",i ,2*i ,2*i-1 ,i*i ,11-i ,i%3 ,i/3 );
		
		
						for( int i = 1; i<=5; i++) {
							for ( int j = 1; j<=10; j++) {
								System.out.print("*");
							}
							System.out.println();
						}
						
						System.out.println();
						for( int i  = 1; i <=1;i++) {System.out.print("*");}System.out.println();
						for( int i  = 1; i <=2;i++) {System.out.print("*");}System.out.println();
						for( int i  = 1; i <=3;i++) {System.out.print("*");}System.out.println();
						for( int i  = 1; i <=4;i++) {System.out.print("*");}System.out.println();
						for( int i  = 1; i <=5;i++) {System.out.print("*");}System.out.println();
		
						System.out.println();
						for( int i = 1; i<=6; i++) {
							for( int j = 1; j <= i; j++) {
								System.out.print("*");
							}System.out.println();
						}
						
						System.out.println();
//						System.out.println("예제 4 -17");
//						
//						System.out.print("*을 출력할 라인의수를 입력하세요 >>");
//						
//						Scanner scanner= new Scanner(System.in);
//						int num = scanner.nextInt();
//						
//						// for( int i = 1; i<= num ; i++){
//						//		for( int j = 1; j <=i j++) {
//						//			System.out.print("*");
//						//		}System.out.println();
//						for( int i = 0; i < num; i++) {
//							for( int j = 0; j <= i ; j++) {
//								System.out.print("*");
//							}System.out.println();
//						}
						
						System.out.println();
						System.out.println("예제 4 -18");
						for ( int i  = 2; i <= 9; i++) {
							for ( int j = 1; j<=9; j++) {
								System.out.printf("%d * %d = %d%n",i , j, i*j);
							}
						}
						
						System.out.println();
						System.out.println("예제 4 - 19");
						for ( int i = 1; i<= 3; i++) {
							for( int j = 1; j <= 3; j++) {
								for( int k =1; k <=3; k++) {
									System.out.println(""+i+j+k);
//									 System.out.printf("%d%d%d%n", i,j,k);
								}
							}
						}
						
						System.out.println();
						System.out.println("예제 4 - 20");
						for ( int i = 1; i<= 5; i++) {
							for( int j = 1; j <= 5; j++) {
								System.out.printf("[%d,%d]",i,j);
							}System.out.println();
						}
						
						System.out.println();
						System.out.println("예제 4 - 21");
						for( int i = 1; i<= 5; i++) {
							for( int j = 1; j <= 5; j++) {
								if(i==j) {
									System.out.printf("[%d,%d]",i,j);
								}
								else {
									System.out.printf("%5s", " ");
								}
							}
							System.out.println();
						}
	
						for( int i = 1; i<= 5; i++) {
							for( int j = 5; j >= 1; j--) {
								if(i==j) {
									System.out.printf("[%d,%d]",i,j);
								}
								else {
									System.out.printf("%5s", " ");
								}
							}
							System.out.println();
						}
						
						
						
	}	

}
