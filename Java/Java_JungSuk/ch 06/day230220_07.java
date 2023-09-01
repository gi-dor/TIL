package day15;
// 생성자 2
// 클래스 bike
// 이름 - 슈퍼커브
// 색상 - 검정 
// 년식 - 2023
// cc - 110cc
// gear - auto -자동

class Bike{
	String name;
	String color;
	int year;
	int cc;
	String gear;
	
	Bike(){}
//	Bike(String name , String color , int year , int cc, String gear){
//		this.name = name;
//		this.color = color;
//		this.year = year;
//		this.cc = cc;
//		this.gear = gear;
//	}
	Bike ( String n , String c , int y , int c1 , String g){
		name = n;
		color = c;
		year = y;
		cc = c1;
		gear = g;
	}
	
	String mybike () {
		return this.name+" "+this.color +"색 " + this.year+"년식 "+this.cc+"cc "+this.gear+"-자동";
	}
	
}
public class day230220_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Bike bike = new Bike("혼다-슈퍼커브" ,"검정" ,2022 , 110 ,"auto");
		System.out.println(bike.mybike());
	
	}

}
