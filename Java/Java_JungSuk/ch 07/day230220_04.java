package day15;
// 오버라이딩 

// 조상 클래스로부터 상속받은 메서드 내용을 변경함

class Point2 extends Object {
	int x ;
	int y;
	
	// Object클래스의 toString()을 오버라이딩
	public String toString() {
		return "x:" +x+", y:"+y;
	}
}


public class day230220_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point2 p = new Point2();
		p.x = 5; 
		p.y = 11;

		System.out.println("p: "+p);
		System.out.println("p.toString: "+p.toString());
		System.out.println("p.x = "+p.x);
		System.out.println("p.y = "+p.y);
	}

}
