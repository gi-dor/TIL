package day02;

public class Ex3_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a = 1_000_000;  // 1�鸸
      int b = 2_000_000;  // 2�鸸
      
      // long c = a * b ;   // a * b = 2,000,000,000,000 �ε� ��  -1454759936 ??
       
       // long 10�� 12����
       // int  10�� 9����
       
       
       // 1. a Ȥ��  b�� long ���� ��ȯ
       // 2. a  b �Ѵ� long ���� ��ȯ
      
        long c = (long)a * (long)b;
              
       System.out.println(c);
	}

}
