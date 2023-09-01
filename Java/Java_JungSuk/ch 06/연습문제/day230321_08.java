package day15.연습문제;

public class day230321_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("연습문제 6-3");
		System.out.println("연습문제 6-4");
		
		// 평균은 둘째자리 반올림
		
		Student s = new Student();
		s.name = "기선";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math =76;
		
		System.out.println("이름 :"+s.name);
		System.out.println("반 :"+s.ban);
		System.out.println("번호 :"+s.no);
		System.out.println("총점 :"+s.getTotal());
		System.out.println("평균 :"+s.getAverage());
	}

}

class Student {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;

	int getTotal () {  // 객체 생성후 iv가 있음 , 매개변수 없는 메서드라는걸 알수있음 
		return kor + eng + math;
	}
	
	double getAverage() {
		 double av = getTotal()/3.0d;
		 double ave = (Math.round(av*10))/10.0d;
		 return ave;
		
	
	}
}