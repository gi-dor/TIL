package day15.예제문제;

class Car {
	String color;
	String gearType;
	int door;
	
	Car(){}
	Car(String c,int d){
		color = c;
		door = d;
		
	}
}


public class day230217_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 매개변수 있는 생성자 예제 6-24
		
		Car c1 = new Car();
		c1.color = "white";
		c1.gearType = "auto";
		c1.door = 4;
		Car c2 =new Car("blue",2);
		// gearType은 지정안해줘서 참조형 기본값인 null
		// 색상과 문 갯수는 지정 해줌
		
		System.out.println("c1.color = "+c1.color+" , c1.gearType = "+c1.gearType+" , "+"c1.door = "+c1.door);
		System.out.println("c2.color = "+c2.color+" , c2.gearType = " +c2.gearType+" , c2.door = "+c2.door);
		
	}

}
