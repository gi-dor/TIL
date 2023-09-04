package CH02;

public class day230301_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 예제 2-7
		System.out.println("예제 2-7");
		char ch = 'A';	// char ch = 65;
		int code = (int)ch;	// ch에 저장된 값을 int 타입으로 변환하여 자장
		
		System.out.printf("%c = %d(%#X)%n", ch , code , code);
		char hch = '가'; 	// char hch = 0xAC00;
		System.out.printf("%c = %d(%#X)%n", hch , (int)hch, (int)hch);
		
		
		
		// 예제 2-8
		System.out.println();
		System.out.println("예제 2-8");
		System.out.println('\'');
		System.out.println("abc\t123\b456");
		System.out.println('\n');
		System.out.println("\"Hello\"");
		System.out.println("c:\\");
	
		// 예제 2 - 9 
		System.out.println();
		System.out.println("예제 2-9");
		short  sMin = -32768;
		short sMax = 32767;
		char cMin = 0;
		char cMAx = 65535;
		
		// short 타입 최대값 32767
		// short 타입 최소값 -32768
		// cahr 타입 최대값 65535
		// char 타입 최소값 0
		System.out.println("sMin =" +sMin);
		System.out.println("sMin-1 =" +(short)(sMin-1));
		System.out.println("smax =" +sMax);
		System.out.println("sMax+1 =" +(short)(sMax+1));
		System.out.println("cMin =" +(int)cMin);
		System.out.println("cMin-1 =" +(int)--cMin);
		System.out.println("cMax =" +(int)cMAx);
		System.out.println("cMax+1 =" +(int)++cMAx);
		
		
		// 예제 2 - 10
		// %f는 소수점이하 6자리까지만 출력하므로 7째 자리에서 반올림되어 9.123457
		// %24.20f는 전체자리 24자리(소수점포함), 20자리는 소수점 이하의 수를 출력 빈공간은 0 으로 채움
		System.out.println();
		System.out.println("예제 2-10");
		float f = 9.12345678901234567890f;
		float f2 = 1.2345678901234567890f;
		double d = 9.12345678901234567890d;
		
		System.out.printf("     123456789012345678901234%n");
		System.out.printf("f   : %f%n", f);
		System.out.printf("f   : %24.20f%n", f2);
		System.out.printf("f2  : %24.20f%n",  f2);
		System.out.printf("d   :%24.20f%n",   d);
		
		
		// 예제 2 - 11
		System.out.println();
		System.out.println("예제 2-11");
		float f3 = 9.1234567f;
		int i = Float.floatToIntBits(f3);
		
		System.out.printf("%f%n", f);
		System.out.printf("%X%n", i);  // 16진수로 출력하라
		
		System.out.println();
		System.out.println("예제 2-12");
		double d1 = 85.4;
		int score = (int)d;
		
		System.out.println("score = " +score);
		System.out.println("d1 = "+d1);	// 형변환 후에도 피연산자에는 영향이 없어 변화가 없음
		
		// int -> char   (char)65   ->'A'
		// char -> int 	 (int)'A'   -> 65
		// float -> int  (int)1.6f  -> 1  	// float -> int로 변환시 소수점 이하의 값을 반올림하지 않고 '버림'처리한다
		// int -> float  (float)10  -> 10.0f
	
		System.out.println();
		System.out.println("예제 2-13");
		int i1 = 10;
		byte b = (byte)i1;
		System.out.printf("[int -> byte] i = %d -> b = %d%n", i1 , b);
		
		i1 = 300;
		b = (byte)i1;
		System.out.printf("[int -> byte] i = %d -> b = %d%n", i1 , b);
		
		b = 10;
		i1 = (int)b;
		System.out.printf("[byte -> int] b = %d -> i = %d%n",b,i);
		
		b = -2;
		i1 = (int)b;
		System.out.printf("[byte -> int] b = %d -> i = %d%n",b ,i);
		
		System.out.println("i = "+Integer.toBinaryString(i1));
		// Integer.toBinaryString(int i)  메서드 이용하면
		// 10진 정수를 2진정수로 변환한 문자열을 얻을수 있다.
		
		System.out.println();
		System.out.println("예제 2-14");
		float f4 = 9.1234567f;
		double d4 = 9.1234567;
		double d5 = (double)f;
		
		System.out.printf("f4 = %20.18f%n",f4);
		System.out.printf("d4 = %20.18f%n",d4);
		System.out.printf("d5 = %20.18f%n", d5) ;
		
		
		System.out.println();
		System.out.println("예제 2 - 15");
		
		int i01 = 91234567;  	// 8자리의 10진수
		float f01 = (float)i01;	// int 를 float로 형변환
		int i02 = (int)f01;		// float를 다시 int로 형변환
		
		double d01 =  (double)i01;	// int를 double로 형변환
		int i03 = (int)d;			// double을 다시 int로 형변환
		
		float f02 = 1.666f;
		int i04 = (int)f02;
		
		System.out.printf("i01 = %d%n",i01);
		System.out.printf("f01 = %f  i02 = %d%n", f01,i02);
		System.out.printf("d01 = %f  i03 = %d%n", d01, i03);
		System.out.printf("(int)%f = %d%n", f02 , i04);
	}
	

}
