package day02;

public class Ex3_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		
		double pd = 3.141592;
		System.out.println(pd);
		System.out.println(pd*1000);
		System.out.println(Math.round(pd*1000));
		System.out.println(Math.round(pd*1000)/1000);
		System.out.println(Math.round(pd*1000)/1000.0);
		System.out.println((double)Math.round(pd*1000)/1000);
		
		System.out.println();
		System.out.println();
		// 1) �Ҽ��� 4° �ڸ����� �ݿø��ϱ�
		double pi = 3.141592;
		double shortPi = Math.round( pi * 1000) / 1000.0;
		// 1. Math.round(pi * 1000) / 1000.0
	    // 2. Math.round(3.141592 * 1000) / 1000.0
		// 3. Math.round(3141.592) / 1000.0
		// 4. 3142 / 1000.0
		// 5. 3.142	
		System.out.println(shortPi);
		
					
		// 2) �Ҽ��� 2° �ڸ����� �ݿø��ϱ�
		double pc = 3.1615923;
		double Pc = Math.round(pc * 10) / 10.0;
		// 1. Math.round ( pc * 10) / 10.0
		// 2. Math.round ( 3.1615923 * 10) / 10.0
		// 3. Math.round (31.615923) / 10.0
		// 4. 32/ 10.0
		System.out.println(Pc);
				
		// 3) �Ҽ��� 6° �ڸ����� �ݿø��ϱ�
		
		double abc = 3.87653771;
		double ab = Math.round(abc * 100000) / 100000.0;
		// 1) Math.round(abc * 100000) / 100000.0
		// 2) Math.round(3.87653771*100000) / 100000.0
		// 3) Math.round(387653.771) / 100000.0
		// 4) 387654 / 100000.0
		System.out.println(ab);
		
		
		
		
		
	}

}
