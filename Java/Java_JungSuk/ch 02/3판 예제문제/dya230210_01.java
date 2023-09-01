public class dya230210_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			// 예제 2-1
			System.out.println("예제 2 - 1");
			int year = 10;
			int age =14;
			
			System.out.println(year);
			System.out.println(age);
			
			year = age + 2000; // 변수 age의 값에 2000을 더해 변수 year에 저장

			age = age + 1; 		// 변수 age에 저장된 값을 1증가시킨다
			
			System.out.println("year = " + year);
				System.out.println("age = " +age);


				// 예제 2-2 
				System.out.println();
				System.out.println("예제 2 - 2");
				int x =10 , y = 20;
				int tmp = 0;
				
				System.out.println("x: "+x+ " y: "+y);
				
				tmp = x ;
				x = y ;
				y = tmp;
				
				System.out.println("x: "+x+" y: "+y);
				
				
				// 예제 2 - 3

				System.out.println();
			System.out.println( "2 - 3");
	
				String name = "Ja" + "va";
				String str = name + 8.0;
				
				System.out.println(name);
				System.out.println(str);
				System.out.println(8 + " ");
				System.out.println(" " +7);
				System.out.println(7 +"");
				System.out.println(""+7);
				System.out.println(""+"");
				System.out.println(7+7+"");
				System.out.println(""+7+7);
	
				
				// 예제 2 - 4
				System.out.println();
				System.out.println("예제 2 - 4");
				
				byte b = 1;
				short s = 2;
				char c ='A';
				
				int finger = 10;
				long big = 100_000_000_000L;  // long big = 100000000000L;
				long hex = 0xFFFF_FFFF_FFFF_FFFFL;
				
				
				int octNum = 010;	//  8진수 10,  10진수로 8
				int hexNum = 0x10;  // 16진수 10 ,  10진수로 16
				int binNum = 0b10; 	// 2진수 10 , 10진수로 2
				
				System.out.printf("b= %d%n", b);
				System.out.printf("s = %d%n", s);
				System.out.printf("c= %c, %d%n", c ,(int)c);
				System.out.println();
				
				System.out.printf("finger = [%5d]%n", finger);
				System.out.printf("finger = [%-5d]%n", finger);
				System.out.printf("finger = [%05d]%n", finger);
				System.out.println();
				
				System.out.printf("big = %d%n" , big);
				System.out.printf("hex = %#x%n", hex);	// #은 접두사 ( 16진수 0x  8진수 0 )
				System.out.printf("octNum = %o, %d%n", octNum , octNum);
				System.out.printf("hexNum = %x, %d%n", hexNum,hexNum);
			//	System.out.printf("binNum = %s, %d%n", Integer.toBinaryString(binNum));
				// Exception in thread "main" java.util.MissingFormatArgumentException: Format specifier '%d'
				// at boot/day10.dya230210_01.main(dya230210_01.java:90)
	
	}

}

