public class day230215_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Student1 s = new Student1();
		s.name = "홍길동";
		s.ban =1;
		s.no =1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		
		System.out.println("이름: "+s.name);
		System.out.println("총점: "+s.getTotal());
		System.out.println("평균: "+s.getAverage());
	}

}
// Student  클래스에 메서드 추가하기
class Student1{
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;

	int getTotal() {
	  int result = kor+eng+math;
	  return result;
	}
	
	
	float getAverage() {
		float result1 = (float)getTotal()/3.0f;
		float result = (float)(Math.round(result1*10)/10.0);
		return result;
	}
	
	
	
	
	
}
