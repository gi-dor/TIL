import java.util.Arrays;

public class day230205_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] iArr1 = new int[10];
		
		int[] iArr2 = new int[10];
		
		int[] iArr3 = {100, 95,80, 70, 60};
		
		char[] chArr = {'a','b','c','d'};
		
		
		
		for ( int i =0; i < iArr1.length; i++) {
			iArr1[i] = 1+i; // 1 ~ 10 �� ���ڸ� ������� �迭�� �ִ´�
		}
		
		for ( int i = 0; i < iArr2.length; i++) {
			iArr2 [i] = (int)(Math.random()*10)+1;
			// 0.0 <= Math.random <1.0
			// 1~ 10 �� ���� ��� ���� *10 + 1
		}
		
		for ( int i = 0; i <iArr1.length; i++) {
		System.out.print(iArr1[i]+",");	
		}
		
		System.out.println();
		// Arrays.toString�� �迭�� ��� ��Ҹ� 		
		// {ù��°���,�ι�°���,����°���...} �� ���� ������ ���ڿ��� ���� ��ȯ�Ѵ�
		System.out.println("iArr1= " +Arrays.toString(iArr1));
		System.out.println("iArr2= " +Arrays.toString(iArr2));
		System.out.println("iArr3 = "+Arrays.toString(iArr3));
		System.out.println("chArr = "+ Arrays.toString(chArr));
		System.out.println("iArr3 = "+iArr3);
		System.out.println("charr = "+chArr);
	}

}