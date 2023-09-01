package day03;
import java.util.Scanner;

public class day230202_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 입력받은 숫자로 계절을 구분하기
		// 잘못입력한 숫자는 재입력 하라고 하기
		// switch문이 아닌 if문 사용
		
		int month = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("현재 월을 입력해주세요 >>");
		
		month = scanner.nextInt();
		
		if (month == 3 || month == 4 || month ==5) {
			System.out.println("현재 봄 입니다");
			// if (3 <= month|| month <=5 ){
			// System.out.println("현재 봄 입니다");
			}else if ( month == 6 || month == 7 || month == 8) {
				System.out.println("현재 여름 입니다");
			}else if  ( month == 9 || month == 10 || month ==11) {
				System.out.println("현재 가을 입니다");
			}else if ( month == 12 || month == 1 || month == 2) {
				System.out.println("현재 겨울 입니다");
			}else {
				System.out.println("잘못 입력했습니다");
				System.out.println("다시 입력해주세요");	
			}
			
		
		
		
		
		
	}

}
