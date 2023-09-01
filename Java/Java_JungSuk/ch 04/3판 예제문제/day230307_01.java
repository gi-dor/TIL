import java.util.Scanner;

public class day230307_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
//		for ( int i = 1; i <=5; i++) {
//			for(int j =1; j<=i; j++) {
//				System.out.printf("[%d,%d]",i,j);
//			}
//			System.out.println();
//		}
//		
//		System.out.println();
//		System.out.println("2.");
//
		for ( int i=1; i<=5; i++) {
			for(int j =1; j<=5; j++) {
				if(i==j) {					
					System.out.printf("[%d,%d]",i,j);
				}else {
					System.out.print("     ");
				}
			}
			System.out.println();
		}
//		
//		System.out.println();
//		System.out.println("3.");
//	
		for ( int i=1; i<=5; i++) {
			for(int j =5; j>=1; j--) {
				if((i==j)) {					
					System.out.printf("[%d,%d]",i,j);
				}else {
					System.out.print("     ");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		for ( int i=1; i<=5; i++) {
			for(int j =1; j<=5; j++) {
				
				if(i==j || j == 6-i) {					
					System.out.printf("[%d,%d]",i,j);
				}else {
					System.out.print("     ");
				}
			}
			System.out.println();
		}
		
		
//		
//		System.out.println("예제 4-23");
//		 int i = 5;
//		 while ( i!=0) {
//			 i--;
//			 System.out.println(i+"-can do it");
//		 }
//		 
//		 System.out.println("예제 4-24");
//		 
//		 int i1 = 11;
//		 System.out.println("카운트다운 시작");
//		 while(i1!=0) {
//			 i1--;
//			 System.out.println(i1);
//			 for(int j = 1; j<200000000L; j++) {
//				 ;
//			 }
//		 }
//		System.out.println("GG");
//	
//		System.out.println();
//		System.out.println("예제 4-25");
//		
//		int sum = 0;
//		int sum1 = 0;
//		System.out.print("숫자를 입력하세요 >>");
//		Scanner scanner = new Scanner(System.in);
//		int num = scanner.nextInt();
////		String tmp = scanner.nextLine()
////	    num = Integer.parseInt(tmp);
//		while(num!=0) {
//			sum = sum + num%10;
//			System.out.printf("sum = %d  num = %d%n",sum,num);
//			num = num/10;
//		}
//		System.out.println("각자리 합: "+sum);
//	}
	
//	int sum = 0;
//	int i = 0;
//	
//	while((sum=sum+ ++i) <= 100) {
//		System.out.printf("%d - %d%n",sum,i);
//		
//		}
//			System.out.println("예제4-27");
//			int num = 0;
//			int sum = 0;
//			boolean flag = true;
//			
//			System.out.println("입력한 값을 더하는 계산기");
//			Scanner scanner = new Scanner(System.in);
//			
//			System.out.println("숫자를 입력하세요 . 끝내려면 0.");
//			
//			while(flag) {
//				System.out.print(">> ");
//				
//				num = scanner.nextInt();
//				
//				if(num != 0) {
//					sum = sum +num;	
//				}else {
//					flag = false;
//				}
//			} System.out.println("합계 : "+sum);
	
		
		
			
	}
}
