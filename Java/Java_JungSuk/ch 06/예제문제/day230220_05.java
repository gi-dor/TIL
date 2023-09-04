package day15.예제문제;
 // 생성자
class Car1{
	String ModelName;
	String color;
	int ModelYear;
	int MaxSpeed;
	
	Car1(String ModelName, String color, int ModelYear,int MaxSpeed){ // 매개변수 있는 생성자
		this.ModelName = ModelName;
		this.color = color;
		this.ModelYear = ModelYear;
		this.MaxSpeed = MaxSpeed;
	}
	String getModel() {
		return  this.ModelName+" " + this.ModelYear +"년식 "+ this.color+"";
	}
}

public class day230220_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car1 mycar = new Car1("소나타", "검정",2021,150 );
		System.out.println(mycar.getModel()); // 호출
	}

}
