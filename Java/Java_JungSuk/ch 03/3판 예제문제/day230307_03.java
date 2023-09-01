public class day230307_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int x = 2;
//		int y = 5;
//		char c = 'A';
//		
//		System.out.println(1+ x << 33);
//		System.out.println(y >= 5 || x <0 && x>2);
//		System.out.println(y +=10 - x++);
//		System.out.println(x +=2);
//		System.out.println(!('A'<= c && c<= 'Z'));
//		System.out.println('C'-c);
//		System.out.println('5'-'0');
//		System.out.println(c+1);
//		System.out.println(++c);
//		System.out.println(c++);
//		System.out.println(c);
		
		int apple = 123;
		int bucket = 10;
		
		int bucket2 = (apple%bucket==0) ? apple/bucket : (apple/bucket)+1;
		
//		if (apple % bucket == 0) {
//			apple / bucket;
//		}else {
//			( apple / bucket)+1;
//		}
//		System.out.println(bucket2);
//	
//		int num = 10;
//		System.out.println(num == 0? 0 : (num > 0 ) ? "양수 " : "음수");
//	
//		int no = 456;
//		System.out.println((int)(no*0.01)*100);
//		
//		int size = 777;
//		System.out.println((int)(size*0.1) *10 +1);
//		System.out.println();
//		
//		
//		byte a = 10;
//		byte b = 20;
//		byte c = (byte) (a +b) ;
//		
//		char ch = 'A';
//		ch = (char) (ch + 2);
//		
//		
//		float f = 3f / 2f;
//		long l = 3000L * 3000L * 3000L;
//		 float f2 = 0.1f;
//		 double d = 0.1;
//		 boolean result = (float)d == f2;
//		 
//		 
//		 System.out.println("c = "+c);
//		System.out.println("ch = "+ch);
//		System.out.println("f = "+f);
//		System.out.println("l = "+l);
//		System.out.println("result ="+result);
	
		
		char ch ='z';
		boolean b = (('a'<= ch || ch <='z') || 
						('A'<=ch || ch <= 'Z')||
							(0 <= ch || ch <= 9 ));
		System.out.println(b);
		
		
		
	
	}

}
