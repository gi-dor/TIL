package day15.예제문제;
// 생성자 2

class Car1 {
	String color; //색상
	String geartype;  // 기어 종류  - 자동auto ,수동 - manual
	int door;
	
	Car1 (){}
//	Car1 (String color , String geartype , int door){ 
//		this.color = color;							
//		this.geartype = geartype;					
//		this.door = door;							
//	}
	
	Car1 ( String c , String g , int d){
		color = c;
		geartype = g;
		door = d;
	}
	String getcar() {
		return this.color +"색 "+this.geartype+" 문"+this.door+"개";
	}
	
	}
public class day230220_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car1 car = new Car1("검정","auto-자동",2);
		System.out.println(car.getcar());
	}

}
