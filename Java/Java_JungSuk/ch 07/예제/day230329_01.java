//package day36;
//
//class Product {
//	int price;
//	int bonusPoint;
//
//	Product(int price){
//		this.price = price;
//		bonusPoint = (int)(price / 10.0);
//	}
//}
//
//class Tv extends Product {
//	Tv(){
//		super(100);
//	}
//	public String toString() {
//		return "Tv";
//	}
//}
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
//class Keyboard extends Product {
//	Keyboard(){
//		super(50);
//	}
//	public String toString() {
//		return "Keyboard" ;
//	}
//}
//
//class Buyer{
//	int money = 1000;
//	int bonusPoint = 0;
//
//	void buy (Product p ) {
//		if (money < p.price) {
//			System.out.println("잔액이 부족합니다");
//			return;
//		}
//		money = money - p.price;
//		bonusPoint = bonusPoint + p.bonusPoint;
//
//
//		System.out.println(p +" 을/를 구입 하셨습니다");
//
//	}
//}
//public class day230329_01 {
//
//	public static void main(String[] args) {
//
//		Buyer b = new Buyer ();
//
//		b.buy(new Tv());
//		b.buy(new Computer());
//
//		b.buy(new Keyboard());
////		Keyboard k = new Keyboard();
////		b.buy(k);
//
//		System.out.println("현재 남은 돈은 "+ b.money +"만원 입니다");
//		System.out.println("현재 보너스 점수는 " +b.bonusPoint + "점 입니다");
//
//	}
//
//}
