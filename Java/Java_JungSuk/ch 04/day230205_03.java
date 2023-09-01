package day03;

import java.util.Scanner;;


public class day230205_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		// do while
				// �� { } �� �ּ��� �ѹ� �̻� �ݺ� - ����� �Է��� ������ �ַ� �̿���
				// while ����  �⺻���� ������ ������
				// ���ǽİ� �� { } �� ������ �ٲ� ���� ���̴�
				
				
				
				// do { 
				 
				
				// } while(���ǽ�);
				
				// �߻������� ������ �ݺ������� ������� �Է��� �޾Ƽ� ó���Ҷ� ���δ�.
				
				
				
				int input = 0;
				int answer = 0;
				
				answer= (int)(Math.random()*100)+1;
				// 1 ~ 100 ������ ������ ���� ����
				
				Scanner scanner = new Scanner(System.in);
				do {
					System.out.print("1�� 100 ������ ������ �Է��ϼ���. >>");
					input = scanner.nextInt();
					
					if (input > answer) {
						System.out.println("�� ���� ���� �Է����ּ��� ");
					} else if (input < answer ) {
						System.out.println("�� ū ���� �Է����ּ��� ");
					}
				} while (input != answer);
			System.out.println("���� �Դϴ�");

	}

}
