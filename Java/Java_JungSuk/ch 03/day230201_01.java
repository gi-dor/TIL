package day02;
import java.util.Scanner;
public class day230201_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 사용자로부터 하나의 문자를 입력받아서
		// 숫자인지 영문자 대문자,소문자인지 확인하기
		
		Scanner scanner = new Scanner(System.in);
		// 입력 = 스캐너
		
		char ch = ' '; // 문자 입력받으라 했음
		// 빈공간 외에 숫자 소문자 대문자 아무거나 써도 가능함??
		

		
		System.out.println("문자를 입력해주세요 >> ");
		String str = scanner.nextLine();

		
		
		 ch = str.charAt(0);
		 // 이건 뭔데 쓰는걸까
		 
		 // ch '0' -> 48
		 // ch 'A' -> 65
		 // ch 'a' -> 97
		 
		 if ('0' <= ch && ch <= '9' ) {
			 System.out.println("입력한 문자는 숫자입니다");
		 }
		 if (('a' <= ch && ch <= 'z')) {
			 System.out.println("입력한 문자는 영어 소문자입니다");
		 }
		 if ('A' <= ch && ch <= 'Z') {
			 System.out.println("입력한 문자는 영어 대문자 입니다");
		 }
		 
		 
//		 if('0'<= ch || ch <= '9') {
//			System.out.println("숫자를 입력했습니다");
//	     	}  else if ('a'<= ch || ch <= 'z') {
//				System.out.println("영어 소문자를 입력했습니다");
//			} else if( 'A' <= ch || ch <= 'Z'){
//					System.out.println("영어 대문자를 입력 했습니다");
//			} else {
//				System.out.println();
//			}
//	
	
	}
			
						
}


