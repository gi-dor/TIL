package day15;

class Chair{
	int neck;
	int wheel;
	int sheet;
	String color;
	
	static int height = 150;
	static int weight = 100;
	
	Chair(){
		this(1,4,1,"black");
	}
	Chair ( int neck , int wheel , int sheet, String color){
		this.neck = neck;
		this.wheel = wheel;
		this.sheet = sheet;
		this.color = color;
	}
	//  색만 집어넣고 생성 =>  검은, 흰색, 회색
	// 바퀴만 집어넣고, 생성 => 6 8
    //	색, 바퀴같이
	
	// 1. 색만 집어넣어서 생성 => 검정 흰색 회색 파란색 
	
	Chair(String color){
		this(1,4,1,color);
	}
	
	
	
	// 2. 바퀴만 집어넣고 생성 => 6 , 8, 10, 15개
	Chair(int wheel){
		this(1,wheel,1,"black");
	}
	// 3. 색 바퀴 둘다 집어 넣고 생성
	
	Chair ( String color , int wheel){
		this(1,wheel,1,color);
	}
	
	
	
	
	
	
}

public class day230317_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Chair ch = new Chair();
		System.out.println("ch.color = "+ch.color+", ch.wheel = "+ch.wheel+", ch.sheet = "+ch.sheet+", ch.neck = "+ch.neck
				+" , Chair.weight = "+Chair.weight+" , Chair.height "+Chair.height);
		System.out.println(ch.color);
		System.out.println(ch.wheel);
		System.out.println(ch.sheet);
		System.out.println(ch.neck);
		System.out.println(Chair.weight);
		System.out.println(Chair.height);
		
		Chair ch2= new Chair("White");
		System.out.println("ch2.color = "+ch2.color);
		System.out.println("ch.color = "+ch2.color+", ch.wheel = "+ch.wheel+", ch.sheet = "+ch.sheet+", ch.neck = "+ch.neck
				+" , Chair.weight = "+Chair.weight+" , Chair.height "+Chair.height);
		System.out.println();
		
		Chair ch3 = new Chair ("Blue");
		System.out.println("ch3.color = "+ch3.color);
		System.out.println("ch.color = "+ch3.color+", ch.wheel = "+ch.wheel+", ch.sheet = "+ch.sheet+", ch.neck = "+ch.neck
				+" , Chair.weight = "+Chair.weight+" , Chair.height "+Chair.height);
		System.out.println();
		
		Chair ch4 = new Chair("gray");
		System.out.println("ch4.color = "+ch4.color);
		System.out.println("ch.color = "+ch4.color+", ch.wheel = "+ch.wheel+", ch.sheet = "+ch.sheet+", ch.neck = "+ch.neck
				+" , Chair.weight = "+Chair.weight+" , Chair.height "+Chair.height);
		System.out.println();
		
		Chair ch5 = new Chair(6);
		System.out.println("ch5.wheel = "+ch5.wheel);
		System.out.println("ch.color = "+ch.color+", ch5.wheel = "+ch5.wheel+", ch.sheet = "+ch.sheet+", ch.neck = "+ch.neck
				+" , Chair.weight = "+Chair.weight+" , Chair.height "+Chair.height);
		System.out.println();
		
		
		Chair ch6 = new Chair(8);
		System.out.println("ch6.wheel = "+ch6.wheel);
		System.out.println("ch.color = "+ch.color+", ch6.wheel = "+ch6.wheel+", ch.sheet = "+ch.sheet+", ch.neck = "+ch.neck
				+" , Chair.weight = "+Chair.weight+" , Chair.height "+Chair.height);
		System.out.println();
		
		Chair ch7 = new Chair("Yellow",12);
		// 색상 노란색 바퀴수 12개
		System.out.println("ch7.color = "+ch7.color+", ch7.wheel = "+ch7.wheel+", ch.sheet = "+ch.sheet+", ch.neck = "+ch.neck
				+" , Chair.weight = "+Chair.weight+" , Chair.height "+Chair.height);
		
		System.out.println("color = "+ch7.color+", wheel = "+ch7.wheel+", sheet = "+ch.sheet+", Chair.weight = "+Chair.weight+
				" Chair.height = "+Chair.height);
		Chair.height = 10;
		Chair.weight =  20;
		
		System.out.println("height , weight 변경");
		System.out.println("height :"+Chair.height+"  weight :" +Chair.weight);
				}

}
