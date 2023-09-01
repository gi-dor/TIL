package day15.예제;

class Product2 {
	int price;
	int bonusPoint;
	
	Product2(){}
	Product2(int price){
		this.price = price;
		bonusPoint = (int)(price / 10.0);
	}
	
}

class Tv2 extends Product2 {
	Tv2(){
		super(100);
	}
	public String toString() {
		return "Tv";
	}
}

class Computer2 extends Product2 {
	Computer2(){
		super(200);
	}
	public String toString() {
		return "Computer";
	}
}

class Keyboard2 extends Product2 {
	Keyboard2(){
		super(50);
	}
	public String toString() {
		return "Keyboard" ;
	}
}

class Buyer2{
	int money = 1000;
	int bonusPoint = 0;
	Product2[] cart = new Product2[10];
	
	int i = 0;
	
	
	void buy(Product2 p) {
		if (money < p.price) {
			System.out.println("잔액이 부족합니다");
			return;
		}
		
		money = money - p.price;
		bonusPoint = bonusPoint + p.bonusPoint;
		cart[i++] = p;
		
		
		System.out.println(p +" 을/를 구입 하셨습니다");
		
	}
	
	void summary() {
		int sum = 0;
		String itemList = "";
		
		for ( int i = 0; i < cart.length; i++) {
			if (cart [i] == null)
				break;
			
			sum = sum + cart[i].price;
			itemList = itemList + cart[i].toString()+",";
		}
		System.out.println("구입하신 물품의 총금액은 "+sum+ "만원 입니다");
		System.out.println("구입하신 제품은 " +itemList+" 입니다");
	}
}

public class day230329_02 {

	public static void main(String[] args) {
		
		Buyer2 bb = new Buyer2();
		
		bb.buy(new Tv2());
		bb.buy(new Computer2());
		bb.buy(new Keyboard2());
		bb.summary();

	}

}
