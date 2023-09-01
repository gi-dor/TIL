import java.util.Scanner;

public class day230210_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(" 예제 2 - 5");
		String url = "www.codechobo.com";
		
		float f1 = .10f;		// 0.10 , 1.0e-1
		float f2 = 1e1f;		// 10.0 , 1.0e1, 1.0e+1
		float f3 = 3.14e3f;		
		double d = 1.23456789;
		
		System.out.printf("f1 = %f, %e , %g%n", f1 , f1 ,f1);
		System.out.printf("f2 = %f , %e , %g%n", f2 , f2 , f2);
		System.out.printf("f3 = %f , %e , %g%n", f3 , f3 , f3);
		
		System.out.printf("d = %f%n", d);
		System.out.printf("d =%14.10f%n", d);
		
		System.out.printf("[12345678901234567890]%n");
		System.out.printf("[%s]%n", url);
		System.out.printf("[%20s]%n", url);
		System.out.printf("[%-20s]%n", url);
		System.out.printf("[%.8s]%n", url);
		System.out.println();
		
		System.out.println(" 예제 2 - 6");
		Scanner scanner = new Scanner ( System.in);
		
		System.out.println("두자리 정수를 하나 입력하세요. >>");
		
		String input = scanner.nextLine();	
		int num = Integer.parseInt(input); // 입력받은 문자열을 숫자로 변환
		// int num = scanner.nextInt();  
		
		System.out.println("입력내용 : "+input);
		System.out.printf("num = %d%n", num);
		
	}

}
