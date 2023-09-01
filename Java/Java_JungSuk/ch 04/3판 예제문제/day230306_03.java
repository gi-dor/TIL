import java.util.Scanner;

public class day230306_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 System.out.println("예제 4-5");
//		 
//		 int score = 0;
//		 char grade = '0';
//		 char opt = '0';
//		 
//		 System.out.print("점수를 입력하세요 >>");
//		 
//		 Scanner scanner = new Scanner(System.in);
//		 score = scanner.nextInt();
//		 
//		 System.out.printf("당신의 점수는 %d 점 입니다%n", score);
//		 
//		 if(score >= 90) {
//			 grade = 'A';
//			 if(score >= 97) {
//				 opt = '+';
//			 } else if ( score < 94){
//				 opt = '-';
//			 }
//		 } else if ( score >= 80) {
//			 grade ='B';
//			 if(score >= 87) {
//				 opt ='+';
//			 }else if(score < 84) {
//				 opt ='-';
//			 }
//		 }else if ( score >= 70) {
//			 grade ='C';
//			 if( score >= 77) {
//				 opt = '+';
//			 }else if (score < 74 ) {
//				 opt = '-';
//			 }
//			 
//		 } else {
//					grade = 'D';
//			 		}
//					System.out.printf("%c%c학점 입니다",grade,opt);
//					
//					
//
//		
//				System.out.println();
//				System.out.println("예제 4-6");
//					 
//				System.out.print("현재 월을 입력하시오 >>");
//				
//				Scanner scanner = new Scanner(System.in);
//				int month = scanner.nextInt();
//				
//				switch(month) {
//				case 1:
//				case 2:
//					System.out.println("겨울");
//					break;
//				case 3:
//				case 4:
//				case 5:
//					System.out.println("봄");
//					break;
//				case 6:
//				case 7:
//				case 8:
//					System.out.println("여름");
//					break;
//				case 9: case 10: case 11:
//					System.out.println("가을");
//					break;
//					
//					default :
//				case 12: System.out.println("겨울");
//				 break; 생략 
//					}
//		
//		
//		
//				System.out.println("if - else if문으로 바꾸기");
//				if ( month == 3 || month == 4|| month == 5) {
//					System.out.println("봄");
//				} else if ( month == 6 || month == 7 || month == 8) {
//					System.out.println("여름");
//				} else if ( month == 9 || month == 10 || month == 11) {
//					System.out.println("가을");
//				} else if ( month == 12 || month == 1 || month == 2) {
//					System.out.println("겨울");
//				}
//				
//				System.out.println(" 예제 4 - 7");
//				
//				System.out.println("가위(1) 바위(2) 보(3) 중 하나를 입력하세요 >");
//				Scanner sc = new Scanner(System.in);
//				
//				int user = sc.nextInt();
//				int com = (int)(Math.random()*3)+1; // 1 ,2,3 중 하나가 랜덤하게 나옴
//				
//				System.out.println("당신은 "+user+"입니다");
//				System.out.println("컴퓨터는 "+com+"입니다");
//				
//				switch ( user - com) {
//				case 1: case -2:
//					System.out.println("당신이 승리 했습니다");
//					break;
//				case 0 : 
//					System.out.println("무승부 입니다");
//					break;
//				case 2: case -1:
//					System.out.println("컴퓨터가 승리 했습니다");
//					break;
//					}
//				
//				System.out.println();
//				System.out.println("예제 4 - 8");
//				
//				System.out.println("당신의 주민번호를 입력하세요");
//				System.out.println("Ex ) 990120-1111111 >" );
//				Scanner scanner = new Scanner(System.in);
//				
//				String id = scanner.nextLine();
//				char no = id.charAt(7);		// 문자열.charAt(index) 로 문자열에 저장된 문자 가져오기
//				
//				switch(no) {
//				case '1':
//				case '3':
//					System.out.println("남자");
//					break;
//				case '2':
//				case '4': 
//					System.out.println("여자");
//					break;
//					
//					default :
//						System.out.println("잘못 입력했습니다.");	
//				}
//				
//				
//				System.out.println();
//				System.out.println("예제 4-9");
//				
//				char grade = ' ';
//				System.out.print(" 당신의 점수를 입력하세요 (1 ~ 100) >");
//				
//				
//				Scanner scanner = new Scanner ( System.in);
//				int score = scanner.nextInt();
//				
//				switch (score) {
//				case 100: case 99: case 98: case 97: case 96:
//				case 95: case 94: case 93: case 92: case 91: case90:
//					grade = 'A';
//				break;
//				case 89: case 88: case 87: case 86: case 85: case 84: case 83:
//				case 82: case 81: case 80:
//					grade = 'B';
//					break;
//				 case 79: case 78: case 77: case 76:  case 75: case 74: case 73: case 72:
//				 case 71: case 70: 
//					 grade = 'C';
//					 break;
//					 
//					 default :
//						 grade = 'D';
//				}
//				System.out.println("당신의 학점은 "+grade+" 점 입니다");
//				System.out.printf("당신의 학점은 %c 점 입니다",grade);
//				
//				System.out.println("예제 4-10");
//				// 이전문제 줄여서 만들기
//				char grade = ' '; 
//				System.out.println("당신의 점수를 입력하세요. ( 0 ~ 100) >>");
//				 Scanner scanner = new Scanner(System.in);
//				 
//				 int score = scanner.nextInt();
//				 
//				 switch ( score /10 ) {
//				 case 10:
//				 case 9:
//					 grade = 'A';
//					 break;
//				 case 8: case7:
//					 grade = 'B';
//				 break;
//				 case 6: case 5: 
//					 grade = 'C';
//					 break;
//					 
//					 default :
//					 grade = 'F';
//				 }
//				 System.out.println("당신이 입력한 점수는 "+score+"점 입니다");
//				 System.out.println("당신의 학점은 "+grade+"점 입니다");
//	
				 
				 
				 // switch 문의 중첩
				 System.out.println("예제 4-11");
				 
				 System.out.print("주민번호를 입력하세요 . Ex). 990120-1133222");
				 Scanner sc = new Scanner(System.in);
				 String id = sc.nextLine();
				 char no = id.charAt(7);
				 
				 switch(no) {
				 case '1': case '3':
					 switch(no) {
					 case '1': 
						 System.out.println("2000년 이전에 태어난 남성입니다");
						 break;
					 case '3':
						 System.out.println("2000년 이후에 태어난 남성입니다");
					 }
					 break;
					 
				 case '2': case '4':
					 switch(no) {
					 case '2': 
						 System.out.println("2000년 이전에 태어난 여성입니다");
						 break;
						 
					 case '4': 
						 System.out.println("2000년 이후에 태어난 여성입니다");
					 }
					 break;
					 
					 default :
						  System.out.println("잘몹 입력하셨습니다.");
				 }
				 
				 
				 
	}

}
