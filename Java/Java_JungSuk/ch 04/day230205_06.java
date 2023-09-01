package day03;

import java.util.Scanner;

public class day230205_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// break���� continue��
		
		int menu = 0;
		int num = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println(" 1. square");
			System.out.println(" 2. square root");
			System.out.println(" 3. log");
			System.out.print("���ϴ� �޴� 1~3 �� �����ϼ��� . ����(0)");
			
			menu = scanner.nextInt();
			// ȭ�鿡�� �Է¹��� ������ menu��
			
			if ( menu ==0) {
				System.out.println("���α׷��� �����մϴ�");
				break;
			}else if ( !(1 <= menu && menu <=3)) {
				System.out.println("�޴��� �߸� �Է� �ϼ̽��ϴ�. ����(0)");
				continue; // �Է��� ��� �޾ƾ��ϴ� continue ���
			}
			System.out.println("�����Ͻ� �޴���" + menu +"�� �Դϴ�");
		}
	}

}
