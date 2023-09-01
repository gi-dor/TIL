import java.util.Scanner;

public class day230308_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				System.out.println("i \t i+1 \t i*2 \t i*2-1 \t i*i  (i+2)/3 \t ???");
				for( int i =1; i<=9; i++) {
					System.out.printf("%d \t %d \t %d \t %d \t %d \t %d \t %d%n",
							i , i+1 , i*2 , i*2-1 , i*i , (i+2)/3 , (i%3)+1);
					
				}
				
				System.out.println("연습문제 4 - 2");
//				 1부터 20까지의 정수 중에서 2또는 3의 배수가 아닌수의 총합을 구하시오
//				 int i =1 , i<=20  1부터 20까지의 정수
//				 2의배수가 아닐것   !(i % 2 == 0) , i%2 != 0 
//				 3의배수가 아닐것   !(i % 3 == 0) , i%3 != 0
//				 !(i%2 ==0 || i%3== 0)
//				  i%2 != 0  && i%3 != 0 
				int sum = 0;
					for( int j = 1; j<=20; j++) {
					if(!(j%2==0 || j%3 ==0))  {	// j%2!=0 && j%3!=0						
						sum = sum + j;
					}
				}
					System.out.println("sum = "+sum);
					
					// 연습문제 4-3
					// 1+ (1+2)+ (1+2+3) + (1+2+3+4)....+(1+2+3...+10)의 결과값을 구하라
					// i+ (i+(i+1) + (i+(i+1)+(i+1+1)....대충 이런느낌 ?
					
//					System.out.println("연습문제 4 - 3");
//					int sum = 0;
//					int total = 0;
//					for ( int i = 1; i <=10; i++) {
//						sum = sum +i;
//						total = total + sum ;
//					}
//					
//					System.out.println("sum = "+sum);
//					System.out.println("total = "+total);
					
					System.out.println();
					System.out.println("연습문제 4-6");
					for( int dice1 =1; dice1<=6; dice1++) {
						for(int dice2 = 1; dice2<=6; dice2++) {
							if(dice1+dice2 == 6) {
								System.out.printf("%d+%d = %d%n",dice1,dice2,6);
							}
						}
					}
					
					for( int i = 0; i<=10; i++) {
						for(int j =0; j<=i; j++)
							System.out.print("*");
							System.out.println();
						
					}
					
					for( int i = 0; i<=10; i++) {
						for(int j =0; j<=i; j++) {
							System.out.print("*");
						}
							System.out.println();
					}
							
							
							
							int i1 = 0;
							while(i1<=10) {
								int j1 = 0;
								while(j1 <=i1) {
									System.out.print("*");
									j1++;
								}
							 System.out.println();
							 i1++;
							}
							
							
							System.out.println("연습문제 4-7");
							int value = (int)(Math.random()*6)+1;
							
							System.out.println("value = "+value);
							System.out.println();
							
							System.out.println("연습문제 4-8");
							for( int x = 0; x<=10; x++) {
								for( int y =0; y<=10; y++) {
									if(2*x + 4 * y ==10) {
										System.out.printf("x = %d y = %d%n", x,y);
									}
									
								}
							}
							
							
//							System.out.println("연습문제 4 - 9 ");
//							String str = "12345";
//							int sum1 = 0; 
//							
//			 				for( int i = 0; i<= str.length();i++) {
//								
//								sum1 = sum1+str.charAt(i);
//							}
//							
//							System.out.println("sum = "+sum);
									
							System.out.println("연습문제 4 - 10");
						int num = 12345;
						int sum2 = 0;
						
						while ( num != 0) {
							sum2 = sum2 + (num%10);
						//	sum2 += num%10;
							System.out.printf("num = %d  \t sum2 = %d%n",num,sum2);
							
							num = num/10;
						}
						System.out.println("sum2 = "+sum2);
					
							for( int i = 2; i <= 9; i++) {
								for(int j =1; j<=3; j++) {
									System.out.printf("%d * %d = %d%n", i , j ,i*j);
								}
								System.out.println();
							}
							
							int answer = (int)(Math.random()*100)+1;
							int input = 0;
							int count = 0;
							
							Scanner scanner =  new Scanner(System.in);
							
							do {
								count++;
								System.out.print("1 ~ 100 사이의 정수 입력 >>");
								input = scanner.nextInt();
								
								if(input > answer) {
									System.out.println("더 작은수로 입력하세요");
									System.out.println();
									
								}else if(input < answer) {
									System.out.println("더 큰수로 입력하세요");
									System.out.println();
									
								}else {
								System.out.println("정답 입니다");
								System.out.println("시도횟수는"+count+"번 입니다");
								System.out.println();
								}
							
							} while(true);
	}

}
