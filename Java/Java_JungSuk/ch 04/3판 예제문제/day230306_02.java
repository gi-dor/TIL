import java.util.*;

public class day230306_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 예제 4-1
		System.out.println("예제 4-1");
		int x = 0;
		System.out.printf("x = %d 일때 , true인 것은%n",x);
		
		if (x==0) System.out.println("x == 0");
		if (x!=0) System.out.println("x!= 0");
		if(!(x==0))System.out.println("!(x == 0)");
		if(!(x!=0))System.out.println("!(x != 0)");
		
		x = 1;
		System.out.printf("x = %d 일때 , true인 것은%n",x);
		if(x==0) System.out.println("x==0");
		if(x!=0) System.out.println("x!=0");
		if(!(x==0))System.out.println("!(x==0)");
		if(!(x!=0))System.out.println("!(x!=0)");
		
		System.out.println();
		// 예제 4-2
		System.out.println("예제 4 - 2");
		int input; 
		System.out.print("숫자를 하나 입력하세요 >>");
		
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();
		input = Integer.parseInt(tmp);
		
		if (input == 0) {
			System.out.println("입력한 숫자는 0 입니다");
		}
		if(input != 0) 
			System.out.println("입력한 숫자는 0 이 아닙니다");
			System.out.printf("입력한 숫자는 %d 입니다%n", input);
			// 두번째 if문에서 { } 생략 했기에 바로 다음에오는 문장만 if문에 속한다
			// 세번째 출력문이 항상 출력된다
			
		System.out.println();
		System.out.println("예제 4 - 3");
		System.out.println("숫자를 입력하시오 >>");
		int num = scanner.nextInt();
		
		if( num ==0) {
			System.out.println("입력한 숫자는 0 입니다");
		}else {	// num != 0 
			System.out.println("입력한 숫자는 0 이 아닙니다");
		}
		
		System.out.println();
		System.out.println("예제 4 - 4");
		
		int score = 0;
		char grade = '0';
		
		System.out.print("점수를 입력하세요 >>");
		
		Scanner scanner1 = new Scanner(System.in);
		score = scanner1.nextInt();

		//	int score = scanner1.nextInt();
		// 에러 메세지 Duplicate local variable score
		//  변수중복이라 충돌 일어나니깐  이름 바꾸란 뜻인듯?
		 if(score>90) {
			 grade = 'A';
		 }else if (score >80) {
			 grade = 'B';
		 }else if (score > 70) {
			 grade = 'C';
		 }else if (score > 60) {
			 grade = 'D';
		 }else {
			 grade ='F';
		 }
		 System.out.println("당신의 학점은 "+grade+"입니다");
		 System.out.println("당신의 점수는 "+score+"입니다");
		 System.out.println();
		 System.out.printf("당신의 학점은 %c점, 점수는 %d점 입니다%n ",grade,score);
		 
		 System.out.println();

		
				 
				
			}
		}
		
