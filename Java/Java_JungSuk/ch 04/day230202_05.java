package day03;
	import java. util.Scanner; 
public class day230202_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 입력받은 숫자로 계절을 구분하고 
		// 잘못입력한 숫자는 재입력 하라고 하기
		
		int month = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("현재 월을 입력하시오");
		
		month = scanner.nextInt();
		
		switch (month) {
		 
		case 3:
		case 4: 
		case 5:
			System.out.println("봄 입니다");
			break;
		case 6: 
		case 7:
		case 8:
			System.out.println("여름 입니다");
			break;
		case 9: case 10: case 11:
			System.out.println("가을 입니다");
			break;
		case 12: case 1: case 2:
			System.out.println("겨울 입니다");
			break;
			
			default :
				System.out.println("잘못 입력하셨습니다");
				System.out.println("다시 입력 하세요");
				
		}
		
		
	
		
			
	}

}
