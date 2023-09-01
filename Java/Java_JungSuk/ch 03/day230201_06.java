package day02;

public class day230201_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
		
// 		int Apples = 123;
// 		int bucket = 10;
// 		int numbucket = (Apples / bucket )+1;
// 				// numbucket = (Apples / bucket )+1; 
				
// 				System.out.println("필요한 바구니의 수 "+numbucket);
		
			
				
		
// 			int apple1 = 1231;
// 			int bucket1 = 70;
// 			int numbucket1 = (apple1 / bucket1)+1;
// 			System.out.println("필요한 바구니의 수 "+numbucket1);
		
		// 위에 사용된 코드는 나누었을 때 나머지가 있다면 가능한 식이지만
		// 나머지가 0 이라면 +1을 해두어서 잘못됨
		// 그래서 사과와 바구니를 나누어서 나머지가 있거나 나머지가 없는 2가지 경우이니
		// 조건식 연산자를 이용했음
		
		// 사과를 담는데 필요한 바구니의 수를 구하는 코드
		// 만약 사과의 수가 123개이고 
		// 하나의 바구니에 10개의 사과를 담을수 있다면
		// 13개의 바구니가 필요할것이다
		
		int apple2 = 123;
			int bucket2 = 10;
			int numbucket2 = (apple2 % bucket2==0)? (apple2/bucket2):(apple2/bucket2)+1;
			System.out.println("최종 필요한 바구니의 수 "+numbucket2);
		
	}

}
