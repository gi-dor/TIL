package day15.예제문제;


class Student{
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	String info() {
		return name+","+ban+"반,"+no+"번 ,"+kor+"점,"+eng+"점,"+math+"점";
	}
	
	Student() {}
	
//	Student(name,ban,no,kor,eng,math{
//		this("홍길동",1,1,100,60,76);
//	}
	
	Student(String name , int ban , int no , int kor, int eng , int math){
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	

}

public class day230316_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("연습 문제");
		Student s = new Student("홍길동",1,1,100,60,76);
		String str = s.info();
		System.out.println(str);
	
	}

}
