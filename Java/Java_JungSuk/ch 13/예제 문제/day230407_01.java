package day03;

public class day230407_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// p514 예제 13-2
		
		long startTime = System.currentTimeMillis();
		
		for ( int i = 0; i <300; i++)
			System.out.printf("%s", new String("-"));
		
		System.out.print("소요시간1:"+(System.currentTimeMillis() - startTime) );
		
		
		for( int i = 0; i < 300; i++)
			System.out.printf("%s", new String("|"));
			
			
			System.out.print("소요시간2:"+ (System.currentTimeMillis()- startTime));
	}

}
