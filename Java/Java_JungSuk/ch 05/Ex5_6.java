public class Ex5_6 {

	public static void main(String[] args) {
		
	// �迭 �ִ밪 , �ּҰ� ���ϱ�
		int[] score = { 79 , 87, 99, 101 ,61};
		
		int max = score[0];   // �迭 ù��° ��ҿ� �ִ밪, �ּҰ� �ʱ�ȭ
		int min = score [0];
		
		for (int i = 1; i < score.length; i++) { //�迭 2��° ��Һ��� �б����� 1�� �ʱ�ȭ
			if(score[i] > max) {
				max = score [i];
			}else if (score [i] < min) {
				min = score[i];
			}
			
		}   // for�� ������ ��ȣ
       	System.out.println("�ִ밪 : "+max);
       	System.out.println("�ּҰ� : "+min);
	}
		

}
