package day02;

public class day230201_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 변수 num의 값중에서 일의 자리를 1로 바꾸는 코드이다
		// 만일 변수 num의 값이 333이라면 331이 되고
		// 777이라면 771이 된다 
		// 화이팅!
		
		
		int num = 333;
		
		// 1. 33.3 만들기
		// 2. int 형변환 시켜서 33만들기
		// 3. * 10을 통해서 330
		// 4. +1 더하면 331
		
		System.out.println(num*0.1);
		System.out.println((int)num*0.1);
		System.out.println((int)(num*0.1));
		System.out.println((int)(num*0.1)*10);
		System.out.println((int)(num*0.1)*10+1);
		
		
		int num2 =777;
		// 1. 77.7
		// 2. 77
		// 3. 770
		// 4. 771
		System.out.println(num2*0.1);
		System.out.println((int)num2*0.1);
		System.out.println((int)(num2*0.1));
		System.out.println((int)(num2*0.1)*10);
		System.out.println((int)(num2*0.1)*10+1);
		
		// num3 = 555
		// 555에서 551 만들기
		
		int num3 = 555;
		
		// 1. 55.5
		// 2. 55
		// 3. 550
		// 4. 551
		System.out.println(num3*0.1);
		System.out.println((int)(num3*0.1));
		System.out.println((int)(num3*0.1)*10);
		System.out.println((int)(num3*0.1)*10+1);
	}

}
