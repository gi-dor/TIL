package day15.예제문제;

public class day230316_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student2 ss = new Student2();
		ss.name = "홍길동";
		ss.ban =1;
		ss.no= 1;
		ss.kor =100;
		ss.eng = 60;
		ss.math = 76;
		
		System.out.println("연습문제");
		System.out.println("이름 :"+ss.name);
		System.out.println("총합 :"+ss.getTotal());
		System.out.println("평균 :"+ss.getAverage());
		
	}

}
class Student2 {
	
	String name ;
	int ban ;
	int no;
	int kor;
	int eng ;
	int math;
	
	int getTotal(){
		return kor +eng +math;
	}
	double getAverage() {
	
		double average = getTotal()/3.0;
		double	Ave = (Math.round(average*10)/10.0);
		return  Ave;
		

	}
}
