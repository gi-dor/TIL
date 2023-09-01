package day03;
import java.util.Scanner;
public class day230202_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int score = 0;
		String grade = " ";
		String opt = " ";
		
			System.out.println("점수를 입력 하세요 . >>");
			Scanner scanner = new Scanner(System.in);
			
			score = scanner.nextInt();
			// 화면에서 입력한 점수를 score에 저장
			
			System.out.println("당신의 점수는 "+score+" 점 입니다" );
			System.out.printf("당신의 점수는 %d점 입니다%n",score);
			
			if (score >= 90) { 
				grade = "A";  // score >=90 이 true 일때 실행
				if(score > 97) {    
					opt = "+"; // score >=90 이 true 이고 score > 97 true 일때 실행
				}else if (score < 93) {
					opt = "-"; // score >=90 이 true 이고 score < 94 true일때 실행
				}
			} else if ( score >= 80) {
				grade = "B";  // score>=80 이고 true일때 실행
				if (score > 87) {
					opt = "+"; // score > 87 trut일때
				}else if ( score < 83) {
					opt = "-";
				}
			}else if ( score >= 70) {
				grade = "C";
				if( score > 77) {
					opt = "+";
				}else if (score < 73) {
					opt = "-";
				}
			}else if (score >= 60) {
				grade = "D";
				if (score > 67) {
					opt ="+";
				}else if (score < 63) {
					opt = "-";
				}
			}else {
				grade = "E";
			}
		
		System.out.printf("%d점, %s%s 학점 입니다%n" , score,grade,opt);
		System.out.println("수고 많았습니다");
	}

}
