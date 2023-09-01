package day03;
import java.util.Scanner;
public class day230202_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// switch 문 
		// scanner로 입력받은 점수를 switch문으로 학점 구분하기
		// switch 문의 조건식은 정수 , 문자열 이 들어감
		// switch 문 조건식에 변수 실수 사용 불가
		int score = 0;

		Scanner scanner  = new Scanner (System.in);
		System.out.println("점수를 입력하세요.>> "); 
		
		score = scanner.nextInt();
		
		switch ( score ) {
		
			case 100:
			case 99:
			case 98:
			case 97:
				System.out.println("A+");
				break;
				
			case 96:
			case 95:
			case 94:
				System.out.println("A");
				break;
			case 93:
			case 92:
			case 91:
			case 90:
				System.out.println("A-");
				break;
			case 89: case 88: case 87:
				System.out.println("B+");
				break;
			case 86: case 85: case 84: 
				System.out.println("B");
				break;
			case 83: case 82: case 81: case 80:
				System.out.println("B-");
				break;
			case 79: case 78: case 77: case 76: case 75:
			case 74: case 73: case 72: case 71: case 70:
				System.out.println("C");
				break;
				
				default :
				System.out.println("D");
		}
		
		
		
	}

}
