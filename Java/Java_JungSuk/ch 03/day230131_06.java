package day02;

public class day230131_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 형변환 연산자
		
		double d = 85.4;
		int score = (int)d;
		
		System.out.println("score = "+score);
		System.out.println("d = "+d);
		
		// d의 값 85.4 는 형변환 후에도 아무런 변화가 없음.
		
		float f =3.14f;
		int i = (int)3.14f;
		
		System.out.println("f="+f);
		System.out.println("i="+i);
		
		// 사칙연산자
		// + ,- , * ,/
		
		System.out.println();
		System.out.println("사칙연산 예제");
		int a = 10;
		int b = 4;
		System.out.println("1.더하기");
		System.out.println(a+b);
		System.out.printf("%d + %d = %d%n" , a,b ,a+b);
		System.out.println("2.빼기");
		System.out.println(a-b);
		System.out.printf("%d - %d =%d%n" , a , b ,a-b);
		System.out.println("3.곱하기");
		System.out.println(a*b);
		System.out.printf("%d * %d = %d%n",a,b,a*b);
		System.out.println("4.나누기");
		System.out.println(a/b);
		System.out.printf("%d / %f = %f%n", a,(float)b, a/(float)b);
		// a 와 b 어느 한쪽만 바꾸면 됨
		// 결과값 %f 주의!	
		
		
	}

}
