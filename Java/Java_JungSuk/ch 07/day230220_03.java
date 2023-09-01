package day15;
// 오버라이딩 

// 조상 클래스로부터 상속받은 메서드 내용을 변경함

// 오버라이딩 조건
// 1. 선언부가 조상클래스의 메서드와 일치해야한다 - 반환타입 메서드이름 매개변수 목록이 같아야함
// 2. 접근제어자를 조상클래스의 메서드보다 좁은 범위로 변경할수 없다
// 3. 예외는 조상 클래스의 메서드보다 많이 선언할수 없다




// 조상클래스의 메서드를 자손클래스에서 오버라이딩 할 때


class Point1 {
	int x ;
	int y;
	String getLocation() {
		return "x:" +x+", y:"+y;
	}
}
class Point3D extends Point1 {
	int z;
	// int y;
	// iny x;
	// String getLocation() {
	// return "x:"+x+" , y:"+y+"

	//	 조상의 getLocation() 을 오버라이딩
		String getLocation() {
			return "x:"+x+", y:"+y+", z:"+z;
		}
 	}

public class day230220_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point3D p = new Point3D();
		p.x = 3;
		p.y = 5;
		p.z = 7;
		
		System.out.println(p.getLocation());
	}

}
