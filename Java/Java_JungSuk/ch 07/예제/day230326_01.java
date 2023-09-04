//package day15.예제;
//
//public class day230326_01 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//
//		Buyer b = new Buyer();
//
//		Product p = new Tv();
//		Keyboard k = new Keyboard();
//		Computer c = new Computer();
//		Tv t = new Tv();
//
//		b.buy(p);
//		//	b.buy(new Tv());
//		System.out.println("가격은 "+ t.price +" 만원 입니다");
//		System.out.println("현재 남은 돈은 "+b.money+" 만원 입니다");
//		System.out.println("현재 보너스 점수는 "+ b.bonuspoint+" 점 입니다");
//		System.out.println();
//
//		b.buy(new Keyboard());
//		System.out.println("가격은 "+ k.price +" 만원 입니다");
//		System.out.println("현재 남은 돈은 "+b.money+" 만원 입니다");
//		System.out.println("현재 보너스 점수는 "+ b.bonuspoint+" 점 입니다");
//		System.out.println();
//
//		b.buy(new Computer());
//		System.out.println("가격은 "+c.price+ " 만원 입니다");
//		System.out.println("현재 남은 돈은 "+b.money+" 만원 입니다");
//		System.out.println("현재 보너스 점수는 "+ b.bonuspoint+" 점 입니다");
//
//	}
//
//}
//
//class Product{
//	int price;
//	int bonuspoint;
//
//	Product(int price){
//		this.price = price;
//		bonuspoint = (int)(price/10.0);
//			}
//	}
//
//class Tv extends Product {
//	Tv() {
//		super(100);		// super 는 조상클래스의 생성자를 호출함
//						// 왜 ? 상속받은거 초기화 해야하 잖아...;
//	}
//	public String toString() {	// toString 메서드는 public 붙인다고함 이유는 나도 잘몰라 !
//	return "Tv";				// Object 최고조상 뭐시꺵이인거 같기도 한데.. 일단 넘어가자!
//	}
//}
//
//
//class Computer extends Product {
//	Computer(){
//		super(200);
//	}
//	public String toString() {
//		return "Computer";
//	}
//}
//
//
//class Keyboard extends Product{
//	Keyboard(){
//		super (30);
//	}
//	public String toString() {
//		return "Keyboard";
//	}
//}
//
//
//class Buyer{
//	int money = 1000;
//	int bonuspoint = 0;
//      // buyer클래스 money - Product p
//	  // product p는 객체 자손타입 , 자기자신 다 다룰수있음 개꿀임
//	  // product 참조변수가 매개변수면 자손타입 참조변수 아무거나 매개변수로 쓸수있음
//	  // 5번 보고 이해함 ㅋㅋ
//	void buy(Product p) {
//		if(money < p.price ) { // 보유 금액보다 제품가격이 비싸다면
//		System.out.println("잔액이 부족해 제품을 구매 할수 없습니다");
//		return ;	// void 인데 왜 return 할까?
//			}
//
//	  money = money - p.price;
//	  bonuspoint = bonuspoint+ p.bonuspoint;
//	  System.out.println("제품 "+ p+ " 을/를 구매하셨습니다");
//		}
//}