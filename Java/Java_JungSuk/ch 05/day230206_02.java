import java.util.Scanner;

public class day230206_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 연습문제 4-10
		
		// int 타입 변수num이 있을때 
		// 각자리의 합을 더한 결과를 출력하는 코드
		
		int num =0;
		int sum = 0;
		System.out.println("수를 입력하세요 >>");
		Scanner scanner = new Scanner (System.in);
	
		 num = scanner.nextInt();
		
		 while (num!=0 ) {
			 sum= sum+num % 10 ;
			 System.out.printf("sum = %d num %d%n",sum,num);
			 
			 num = num/10;
		 }
		sum = sum+num;
		 
		System.out.println("sum = "+sum);
		
	}

}
