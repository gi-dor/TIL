import java.util.Arrays;

public class day230205_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] iArr1 = new int[10];
		
		int[] iArr2 = new int[10];
		
		int[] iArr3 = {100, 95,80, 70, 60};
		
		char[] chArr = {'a','b','c','d'};
		
		
		
		for ( int i =0; i < iArr1.length; i++) {
			iArr1[i] = 1+i; // 1 ~ 10 의 숫자를 순서대로 배열에 넣는다
		}
		
		for ( int i = 0; i < iArr2.length; i++) {
			iArr2 [i] = (int)(Math.random()*10)+1;
			// 0.0 <= Math.random <1.0
			// 1~ 10 의 값을 얻기 위해 *10 + 1
		}
		
		for ( int i = 0; i <iArr1.length; i++) {
		System.out.print(iArr1[i]+",");	
		}
		
		System.out.println();
		// Arrays.toString은 배열의 모든 요소를 		
		// {첫번째요소,두번째요소,세번째요소...} 와 같은 형식의 문자열로 만들어서 반환한다
		System.out.println("iArr1= " +Arrays.toString(iArr1));
		System.out.println("iArr2= " +Arrays.toString(iArr2));
		System.out.println("iArr3 = "+Arrays.toString(iArr3));
		System.out.println("chArr = "+ Arrays.toString(chArr));
		System.out.println("iArr3 = "+iArr3);
		System.out.println("charr = "+chArr);
	}

}
