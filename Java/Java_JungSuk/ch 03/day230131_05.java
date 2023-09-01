package day02;

public class day230131_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//증감연산자
		int i =5;
		int j =0;
		
		j = i++;
		
		
		System.out.println("j = i++ 실행후," );
		System.out.println("i="+i );
		System.out.println("j="+j );
		
		
		i = 5;
		j = 0;
		
		j = ++i;
		System.out.println("j = ++i 실행후,");
		System.out.println("i="+i);
		System.out.println("j="+j);
		
		// 부호 연산자 
		
		int q = -10;
		q = +q;
		System.out.println(q);
		// +(-10) = -10
		
		int w = -10;
		w = -w;
		System.out.println(w);
		// -(-10)= +10
	}

}
