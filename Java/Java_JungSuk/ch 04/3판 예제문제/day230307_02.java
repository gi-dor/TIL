import java.util.Scanner;

public class day230307_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			System.out.println("예제 4-28");
			int input =0;
			int answer = 0;
			answer =(int)(Math.random()*100)+1;
			Scanner scanner = new Scanner(System.in);
			
			do {
				System.out.print("1 ~ 100 사이의 정수를 입력하세요. >>");
				input = scanner.nextInt();
				
				if(input > answer) {
					System.out.println("더 작은수로 입력하세요");
				}else if( input < answer){
					System.out.println("더 큰수로 입력하세요");
				}
			} while (input != answer );
		System.out.println("정답 ");
	}

}
