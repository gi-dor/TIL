package day15.예제;
//  매개변수의 다형성 예제 
//	참조형 매개변수는 메서드 호출시 
//	'자신과 같은타입 또는 자손타입의 인스턴스'를 넘겨줄수있다

class Product {
	int price; 	// 제품의 가격
	int bonusPoint;	// 제품구매 시 제공하는 보너스 점수
	
	Product(int price) {
		this.price = price;
		bonusPoint =  (int)(price/10.0);
	}
}


class Tv1 extends Product{
	Tv1(){			// 조상클래스의 생성자 Product(int price)를 호출한다
		super(100);	// Tv의 가격을 100만원으로 함
	}
	public String toString() { return "TV";	}
}

class Computer extends Product{
	Computer(){		// 조상클래스의 생성자 Product(int price) 호출
		super(200);	// Computer의 가격을 200 으로함
	}
	public String toString() { return "Computer"; }
}

class Buyer{		// 고객 물건을 구매 하는 사람
	int money = 1000;	// 소유 금액
	int bonusPoint = 0;	//보너스 점수
	
	void buy ( Product p ) {
		if(money < p.price) {
			System.out.println("잔액이 부족합니다");
			return;
		}
		money = money - p.price;
		bonusPoint = bonusPoint + p.bonusPoint;
		System.out.println(p + "을/를 구매 했습니다");
	//	System.out.println(p.toString() + "을/를 구매 했습니다");
			
	}
}

public class day230224_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buyer b = new Buyer();
		
//		Product p = new Tv1(); 
//		p.buy(p);	
		b.buy(new Tv1());	// buy(Product p)
		b.buy(new Computer());	// but (Product p)
		
		System.out.println("현재 남은 돈은 "+ b.money+"만원 입니다");
		System.out.println("현재 보유한 보너스 점수는 "+b.bonusPoint+"점 입니다");
	}

}
