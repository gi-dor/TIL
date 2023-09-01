package day03;


public class Ex4_6{

	public static void main(String[] args) {
		// �� ��� 
		// i = 1 2 3 4 5   5�� �ݺ�
		System.out.println("���� 1��");
		for (int i =1; i <= 10; i++) {
			System.out.println("**********");
		}
		System.out.println();
		
		System.out.println("���� 2��");
		for (int i =1; i<=6; i++) {
			for(int j =1; j<=4; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		System.out.println();
	
		System.out.println("���� 3��");
		for (int i = 1; i <= 7; i++) {   // �� ����
			//	System.out.println("*********");
			for (int j = 1; j <=i; j++) {
				System.out.print("*");   // ������ �� � ������
			}
			System.out.println();  // �ٹٲ�
		}
		
		for (int i = 7; i >= 1; i-- ) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("���� 4��");
		for (int i =1; i<=10 ; i++) {
			for (int j = 1; j <=i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	
   }
}

