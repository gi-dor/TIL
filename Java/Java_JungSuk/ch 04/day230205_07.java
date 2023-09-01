package day03;

public class day230205_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// �̸� ���� �ݺ���
		// �ݺ����� �̸��� �ٿ��� �ϳ� �̻��� �ݺ����� ���� ���� �ִ�
		

		asd1 : for ( int i =2; i <= 9; i++) {
			for(int j =1; j <=9; j++) {
				if (j==5)
					break asd1;
				System.out.println(i+"*"+j+"=" +i*j);
				
			}
			System.out.println();
		}
		
	}

}
