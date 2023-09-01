package day03;

import java.util.*;
public class Ex4_8{

	public static void main(String[] args) {
		
		int input = 0;   int answer = 0;
			// 1���� 100������ ���� �Է��ؼ� ���� ���߱�
		answer = (int)(Math.random() * 100) +1;
		Scanner scanner = new Scanner(System.in);
		

		
		do {
			System.out.println("1 ~ 100 ������ ������ �Է��ϼ���  ���� ");
			input = scanner.nextInt();
			
			if (input > answer) { 
				System.out.println("�� ���� ���� �ٽ� �Է��ϼ���");
				System.out.println();
				
		}else if (input < answer) {
			System.out.println("�� ū ���� �ٽ� �Է��ϼ���");
			System.out.println();
		}
		}while (input != answer);
	System.out.println("�� �� ");
			
	}
}


