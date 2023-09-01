package day03;

public class day230205_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("1 ��");
			int i = 5;
			while ( i!=0) {
				i--;
				System.out.println(i +" - I can do it");
					
					
			}
			System.out.println("2 ��");
			i =5;
		while ( i!=0) {
			System.out.println(i +" l I can do it 2");
			i--;
		}
		
		// 1���� ����� ���ؾ� 100�� ���� ������?
		
		int sum = 0;
		int x = 0;
		
		while (sum <=100) {
			System.out.printf("%d - %d%n ",x ,sum);
			sum =sum+(++x);
		// sum += ++x;
		}
	}

}
