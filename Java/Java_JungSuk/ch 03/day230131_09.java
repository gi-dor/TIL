package ch03;

public class day230131_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 나머지 연산자 
		// 피연산자는 나누고 남은 나머지를 반환
		
		int x = 10;
		int y = 8;
		int c = -10;
		int v = -8;
		
		// 양수/양수
		System.out.println("양수/양수");
		System.out.printf("%d를 %d로 나누면%n", x,y);
		System.out.printf("몫은%d 나머지는 %d %n",x/y,x%y);
		System.out.println();
		
		// 음수/양수
		System.out.println("음수/양수");
		System.out.printf("%d를 %d로 나누면%n", c ,y);
		System.out.printf("몫은 %d 나머지는 %d %n", c/y,c%y);
		System.out.println();
		
		// 양수/음수
		System.out.println("양수/음수");
		System.out.printf("%d를 %d로 나누면 %n",x ,v);
		System.out.printf("몫은 %d 나머지는 %d%n" , x/v ,x%v);
		System.out.println();
		
		// 음수/음수	
		System.out.println("음수/음수");
		System.out.printf("%d를 %d로 나누면 %n",c ,v);
		System.out.printf("몫은 %d 나머지는 %d%n" , c/v ,c%v);
		
		
		
	
	}

}
