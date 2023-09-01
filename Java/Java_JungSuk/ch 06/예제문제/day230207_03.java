package day15.예제문제;

public class day230207_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 객체 생성없이 사용 , cv
		System.out.println("Card.width = "+ Card.width);
		System.out.println("Card.height = "+ Card.height);
		
		Card c1 = new Card(); // 객체 생성
		c1.kind = "HEART";
		c1.number = 5;
		
		Card c2 = new Card(); // 객체 생성
		c2.kind = "Spade";
		c2.number = 8;
		
		System.out.println("c1은 "+c1.kind+", "+c1.number+ "이며, 크기는 ("+ c1.width +","+c1.height+")" );
		System.out.println("c2은 "+c2.kind+", "+c2.number+ "이며, 크기는 ("+ c2.width +","+c2.height+")" );
		System.out.println();
		
		System.out.println("c1의 width 와 height 를 각각 60 , 90 으로 변경");
		
		// cv
		Card.width = 60;
		Card.height = 90;
		
		
		System.out.println("c1은 "+c1.kind+", "+c1.number+ "이며, 크기는 ("+ c1.width +","+c1.height+")" );
		System.out.println("c2은 "+c2.kind+", "+c2.number+ "이며, 크기는 ("+ c2.width +","+c2.height+")" );
		
		
	}

}
class Card {
	
		// iv
		String kind;	// 무늬
		int number;		// 숫자
		
		// cv
		static int width = 100;		// 폭
		static int height = 250;	// 높이
}
