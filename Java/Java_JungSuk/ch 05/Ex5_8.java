import java.util.Arrays;

public class Ex5_8 {

	public static void main(String[] args) {
	
	 int[] lotto = new int[45];      // 45���� ������ �����ϱ����� �迭����
	 
	 // �迭�� �� ��ҿ� 1 ~ 45 �� ����
	 for (int i = 0; i < lotto.length; i++) 
		 lotto[i] = i +1;    // lotto[0]�� 1�� ����
		 
		 int tmp = 0;  	  //�� ���� �ٲٴµ� �� �ӽú���
		 int j = 0;     	// ������ ���� �� ������ ����
		 
		 // �迭�� i��° ��ҿ� ������ ��ҿ� ����� ���� ���� �ٲ㼭 ���� ���´�
		 // 0 ��°���� 5��° ��� ���� ��� 6���� �ٲ۴�
		 
		 for (int i = 0; i < 6; i++) {
			 j = (int)(Math.random() * 45);  // 0 ~ 44���� ������ ���� ����
			 tmp = lotto [i];
			 lotto [i] = lotto [j];
			 lotto [j] = tmp;
		 }
		 
		 for (int i = 0; i <6; i++) {
			 System.out.printf("lotto[%d] = %d%n", i , lotto[i]);
	 }
	}
		

}
