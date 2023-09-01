package day03;

import java.util.Scanner;;


public class day230205_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//  ����ڷκ��� ���ڸ� �Է¹޾�
		// �� ������ �� �ڸ��� ���� ���ϴ� ����
		// ex) 12345 �Է½�
		// 1+2+3+4+5 = 15
		
		int num = 0;
		int sum = 0;
		System.out.print("���ڸ� �Է��ϼ���. >>");

		Scanner scanner = new Scanner(System.in);
		
		num = scanner.nextInt();
		// ��ȯ���� ���ڷ� �ٷ� �Է¹޴´�
		
//		String tmp = scanner.nextLine();
		// �Է¹��� ������ tmp�� ���� 
		
//		num = Integer.parseInt(tmp);
		// �Է¹��� ������ int Ÿ������ ��ȯ
		
		while ( num!=0) {
			sum = sum + num%10; 
			// num �� 10���� ���� �������� sum�� ����
			// 12345%10 =5
			// 1234%10 =4
			// 123%10 =3
			// 12 %10 = 2
			// 1%10 =1
		System.out.printf("sum = %d  num = %d%n",sum ,num);
			
			num = num / 10 ;
			
		}
		
		System.out.println("�� �ڸ����� �� :" +sum);
	}

}
