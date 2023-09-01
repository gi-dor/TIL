package day03;

import java.util.Scanner;

public class day230205_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// continue��
				// �ڽ��� ���Ե� �ݺ����� ������ �̵� - ���� �ݺ����� �Ѿ
				// ��ü �ݺ��߿��� Ư�� ���ǽ� �ݺ��� �ǳʶ� �� ������
				
				System.out.println("-----1��-----");
				 for ( int i = 0; i <= 10; i++) {
					 if ( i%3 == 0) // 3�� ���
						 continue;
					 // ���ǽ��� true�� �Ǿ� continue������ ����Ǹ�
					 // ���� ������ �̵���
					 System.out.println(i);
				 }
				 System.out.println("-----2��-----");
				 for ( int j =0; j <=15 ; j++) {
					 if ( j%2==0)
						 continue;
					 System.out.println(j);
				 }
	}

}
