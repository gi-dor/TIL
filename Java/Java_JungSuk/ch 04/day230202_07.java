package day03;

import java.util.Scanner;
public class day230202_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner = new Scanner(System.in);
		
		int month = 0;
		
		System.out.println("현재 월을 입력하세요. >>");
		
		month = scanner.nextInt();
		
		if (3 <= month && month <=5 ) { // 3보다 같거나 크고 5보다 같거나 작아야함
			System.out.println("현재 봄 입니다");
			
			}else if (6 <= month && month <= 8 ) { // 6월보다 크거나 같고 8월보다 작거나 같음
				System.out.println("현재 여름 입니다");
			}else if  (9 <= month && month <= 11  ) { // 9보다 크거나 같고 11월보다 작거나 같음
				System.out.println("현재 가을 입니다");
			}else if ( 12 <= month && month < 13 ) { // 12이랑 같고 13보다 작게		
				System.out.println("현재 겨울 입니다");
			}else if (month <= 2) { // 1월 보다 크고 3월보다 작게
				System.out.println("현재 겨울 입니다");
			}else {
				System.out.println("잘못 입력했습니다");
				System.out.println("다시 입력해주세요");	
			}
		
		
		
		
		
	}

}
