import java.util.Arrays;

public class Ex5_7 {

	public static void main(String[] args) {
	
		int [] numArr = { 0,1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(numArr));
		System.out.println();
		
		
		
		
		for (int i = 0; i <100; i++) {  // 100�� �� ��Ұ� �ٲٱ�
			int n = (int)(Math.random()*10);      // 0 ~ 9 �߿� �� ���� ���Ƿ� ����
			int tmp = numArr [0];
			numArr[0] = numArr[n];
			numArr[n] = tmp;
			
		}
		System.out.println(Arrays.toString(numArr));
	}
		

}
