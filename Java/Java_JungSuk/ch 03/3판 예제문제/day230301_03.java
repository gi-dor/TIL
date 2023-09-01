public class day230301_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ch3 정석 3판 예제 풀기
		
//		System.out.println("예제 3-1");
//		int i = 5;	
//		i++;		// i = i+1; 
//		// 메서드나 수식이 없기때문에 ++i i++ 둘다 그놈이 그놈 차이없음
//		System.out.println(i);
//		
//		i = 5;
//		++i;
//		System.out.println(i);
//		System.out.println();
		
//		System.out.println("예제 3-2");
//		int i1 = 5 , j = 0;
//			
//		j = i1++;
//		System.out.println("j = i1++; 실행후 , i1 = "+i1+ ", j = "+j);
//	
//		i1=5;
//		j=0;
//		j = ++i1;
//		System.out.println("j = ++i1; 실행후 , i1 = "+i1+ ", j = "+j);
//		System.out.println();
		
//		System.out.println("예제3-3");
//		int i = 5;
//		int j = 5;
//		System.out.println(i++);
//		System.out.println(++j);
//		System.out.println("i = "+i+", j = "+j);

//		System.out.println("예제 3-4");
//		int i =-10;
//		i =+i;	// i = i+1;
//		System.out.println(i);
//		
//		i =-10;
//		i = -i;	// i = -(-10);
//		System.out.println(i);
		
//		System.out.println("예제 3-5");
//		int a = 10;
//		int b = 4;
//		
//		System.out.printf("%d + %d = %d%n", a, b, a+b);
//		System.out.printf("%d - %d = %d%n", a, b, a-b);
//		System.out.printf("%d * %d = %d%n", a, b, a*b);
//		System.out.printf("%d / %d = %d%n", a, b, a/b); // int / int = int 소수점자리 버림
//		System.out.printf("%d / %f = %f%n", a, (float)b, a / (float)b);
		
//		System.out.println("예제 3 - 7");
//		byte a = 10;
//		byte b = 30;
//		byte c = (byte)(a*b);	// 형변환 - 데이터 손실 
//		// byte d = a*b; 		// 에러 , byte 범위는 -128 ~ 127 
//		System.out.println(c);
		
//			System.out.println("예제 3-8");
//			int a = 1_000_000; // 백만
//			int b = 3_000_000; // 3백만
//			
//			long c = a * b ; 
//			int d = a * b;
//			System.out.println(c);
//			System.out.println(d);
//			// a*b 의 결과가 이미 int 타입의 값이어서 long타입으로 자동형변ㄴ환 되어도 값이 바뀌지 않음
			
//			System.out.println("예제3-9");
//			long a = 1_000_000 * 1000000; 
//			long b = 3_000_000 * 3000000L;
//			
//			System.out.println(a);
//			System.out.println(b);
//			// int * int = int  값손실
//			// int * long = long  
	
//			System.out.println("예제 3-10");
//			int a = 1000000;
//			int result1 = a * a / a ;
//			int result2 = a / a * a;
//			System.out.printf("%d * %d / %d = %d%n",a ,a,a, result1);
//			System.out.printf("%d * %d / %d = %d%n",a ,a,a, result2);
//			// result1 같은경우 먼저 곱하면서 int의 범위를 벗어났기에 오버플로우 발생
		
//			System.out.println("예제 3-11");
//			char a ='a'; 		// 97
//			char d = 'd';		// 100
//			char zero = '0';  	// 48
//			char two = '2';		// 50
//			System.out.printf(" '%c' - '%c' = %d%n", d , a , d-a);
//			System.out.printf(" '%c' - '%c' = %d%n", two , zero , two-zero);
//			System.out.printf("'%c' = %d%n",a , (int)a);
//			System.out.printf("'%c' = %d%n",d , (int)d);
//			System.out.printf("'%c' = %d%n",zero , (int)zero);
//			System.out.printf("'%c' = %d%n",two , (int)two);
//			// 문자   코드 
//			// 	0	48
//			//	1 	49
//			//	2	50
//			
//			// 	A	65
//			//	B 	66
//			//	C	67
//			
//			//	a	97
//			//	b	98
//			//	c	99
//			// 	d	100
			
//			System.out.println("예제 3-12");
//			char c1 ='a';	// c1에는 문자 'a'코드 값인 97이 저장
//			char c2 =c1;	// c1에 저장되어있는 값이 c2에 저장
//			char c3 =' ';	// c3를 공백으로 초기화
//			
//			int i = c1 +1; // 'a' 는 97 , 97+1 , i = 98
//			
//			c3 = (char)(c1+1);	// c1 = 'a' 97+1 => 98은 'b'
//			
//			c2++;
//			c2++;	// c2 = c1,'97'  97이 1씩 2번증가했으면 '99' => 'c'
//
//			System.out.println("i = " +i);
//			System.out.println("c2 = "+c2);
//			System.out.println("c3 = "+c3);
					
//			System.out.println("예제 3-14");
//			char c = 'a';
//			for ( int i = 0; i < 26; i++) {
//				System.out.print(c++);
//			}
//			System.out.println();
//			
//			c = 'A';
//			for ( int i = 0; i <26; i++) {
//				System.out.print(c++);
//			}
//			System.out.println();
//			
//			c = '0';
//			for ( int i =0; i < 10; i++) {
//				System.out.print(c++);
//			}
		
			System.out.println("예제 3-16");
			float pi = 3.141592f;
			float shortPi = (int)(pi *1000) / 1000f;
			System.out.println(shortPi);
			
			
	}

}
