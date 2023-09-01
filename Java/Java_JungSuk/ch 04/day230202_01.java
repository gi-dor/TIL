package day03;
import java.util.Scanner;
public class day230202_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
		// if else문 
		// 화면을 통해 숫자를 입력받아 
		// 입력한 값이 조건식과 비교해  true,false구분
		
		// 입력받아 = scanner사용 
		// import문 사용
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자를 입력 해주세요 >> .");
		int num = scanner.nextInt();
		// 화면을 통해 입력받을 숫자를  num 에 저장
		
		if (num == 0) {
				System.out.println("입력하신 숫자는 0 입니다");
		}else { // num 에 입력한 숫자가 0이 아닐시 ( num !=0 )
					System.out.println("입력 하신 숫자는 0 이 아닙니다");
				}
		
		
		
		
				// if문은 조건식이  true이면 실행함 false이면 { } 벗어나서 다음 실행함
		
				// if else문은 else블럭이 추가되었으며 
				// 조건식 결과가 true가 아니고 false일시 else { } 의 문장을 실행함
				
				// if else if 처리해야할 조건식이 3개 이상인 경우에 사용함	
				// 여러개의 조건식을 쓸수 있음
		
	
		
	}

}
