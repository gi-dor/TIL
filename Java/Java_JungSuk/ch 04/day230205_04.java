package day03;

import java.util.Scanner;


public class day230205_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	// �ڽ��� ���Ե� �ϳ��� �ݺ����� �����
		
		// ���ڸ� 1���� ��� ���ϸ�  ����� ���ؾ� 100�� �Ѵ°� ?
		
		// i�� ���� 1���� 1�� ������Ű�� ���ϸ鼭 sum�� ����
		// sum�� ���� 100 �� ������ break���� ����Ǿ�
		// �ݺ��� ������ ����
		
		int sum = 0;
		int i = 0;
		
		while (true) {  // ���� �ݺ���  for(;;), while���� true �����Ұ�
			if ( sum > 100)
				break;  // sum > 100 �� true�̸� break�����
			++i;
			sum = sum +i ;
		}
		
		System.out.println("i = "+i);
		System.out.println("sum = "+sum);
		
	}

}
