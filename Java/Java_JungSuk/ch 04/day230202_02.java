package day03;
import java.util.Scanner;
public class day230202_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		//if else if
		
		// 조건식에 true false만 가능함
		// 조건이 많아 진다면  else if 계속 늘어남
	
		// if  (조건식1){
		 		// 조건식1의 결과가 true일시 수행될 문장
		//	} else if(조건식2){
				// 조건식 2의 결과가 true일 때 수행될문장
		//	} else if(조건식 3) {
				// 조건식3의 결과가 true 일 때 수행될 문장
		//	} else {  마지막은 else 블럭으로 끝나며 , else블럭은 생략 가능함
				// 위의 조건식에도 만족하지 앟았을때 수행될 문장
		//  }  // 끝 
		
		
		// 입력받은 숫자를 통해 score에 저장
		// 점수를 입력해서 점수별로 학점 A B C D
		
			int score = 0;
			String grade = "0";
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("점수를 입력하세요. >>");
			
			score = scanner.nextInt();
			
			if (score >= 90) {
				grade = "A";
			}else if ( score >= 80) {
				grade ="B";
			}else if (score >= 70) {
				grade = "C";
			}else if (score >= 60) {
				grade = "D";
			}else {
				grade = "E";
			}
			System.out.println("당신의 점수는 "+score+"입니다");
			System.out.println("당신의 학점은 "+grade+"입니다");
			
			System.out.printf("당신의 점수는 %d점 이고 학점은 %s 입니다%n" , score ,grade);
		
		
		
		
		
		
	}

}
