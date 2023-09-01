public class Ex5_5 {

	public static void main(String[] args) {
			// �迭 ����,��� ���ϱ�		
	int sum = 0;
	float average = 0f;
	
	int [] score = { 100, 87 ,100 ,65 ,100} ; // �� 452
	
	for (int i = 0; i< score.length; i++) {
		sum = sum + score[i];
	//	sum += score[i];
	}
		average = sum / (float)score.length;  // ��� ���� floatŸ������ �ޱ�����
		
		System.out.println(" �� �� : " +sum);
		System.out.println(" ��� : "+average);
		
		// 452 / 5 = 90.4
		// 452 / (float)5 = 478/5.0f = 452.0f/5.0f = 90.4f
	
	}
		

}
