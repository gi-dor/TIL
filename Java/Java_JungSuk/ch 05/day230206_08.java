import java.util.Scanner;

public class day230206_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		String[][] words = {
				{"chair", "의자"},  		 // word[0][0] , word[0][1]
				{"computer" , "컴퓨터"},  // word[1][0] ,word[1][1]
				{"integer" , "정수"}  	// word[2][0] ,word[2][1]
		};
		
		Scanner scanner = new Scanner ( System.in);
		
		for ( int i =0; i <words.length; i++) {
			System.out.printf("Q%d.)  %s의 뜻은 ?%n", i+1 ,words[i][0]);
									// %s 문자열 , %n 줄바꿈   
			String tmp = scanner.nextLine();
			
			if ( tmp .equals(words[i][1])) {
				System.out.printf("정답 입니다");
			}else {
				System.out.printf("틀렸습니다 , 정답은 %s입니다 %n%n" , words[i][1]);
			}
			
		}
	}

}
