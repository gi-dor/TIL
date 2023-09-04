package ch03;

public class day230131_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte g = 10;
		byte h = 20;
		byte j = (byte)(g*h);
		
		System.out.println(j);
		// c의 값이 byte범위를 넘기 때문에 값손실 발생
	
		int a = 100_0000; // 1백만
		int b = 200_0000; // 2백만
		long c = a * b;
		
		System.out.println("a*b = "+c);
		// 검사 결과를 담은 long 타입이지만
		// int / int = 결과값이 int 이기 때문에 
		
		long d = (long)a*b;
		System.out.println("a*b = "+d);
		
		
		
		long z = 100_0000 * 100_0000;
		long x = 200_0000 * 100_0000L;
		
		// int * int = 결과값 int 
		System.out.println("z = "+z);
		
		System.out.println("x = "+x);
		
		// int * long => long* long => long
		long v = 200_0000 * (long)100_0000;
		System.out.println("v = "+v);
		
	}

}
