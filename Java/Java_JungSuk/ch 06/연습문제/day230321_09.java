package day15.연습문제;

public class day230321_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			System.out.println("연습문제 6-5");
			Student111 s = new Student111("기선",1,1,100,60,76);
			
			System.out.println(s.info());
	}

}

class Student111 {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	Student111(){}
	
	Student111(String name , int ban , int no, int kor, int eng , int math){
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
	}

	int getTotal () {  // 객체 생성후 iv가 있음 , 매개변수 없는 메서드라는걸 알수있음 
		return kor + eng + math;
	}
	
	double getAverage() {
		 double av = getTotal()/3.0d;
		 double ave = (Math.round(av*10))/10.0d;
		 return ave;
	}
	
		 String info() {
			 return "이름:"+name+" 반:"+ban+"반"+" 번호:"+no+"번"+" 국어:"+kor+" 영어:"+eng+" 수학:"+math+" 총합:"+getTotal()+" 평균:" +getAverage();	
	}
}