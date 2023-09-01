package day15.예제;

// 조상타입의 참조변수와 자손타입의 참조변수의 차이점은 사용할수 있는 멤버의 갯수
// 조상클래스에서 선언된 멤버변수와 자손클래스에 같은이름의 iv 를 중복으로 정의 했을때
// 조상타입 참조변수로 자손인스턴스를 참조
// 자손타입 참조변수로 자손인스턴스 참조 하는 경우
// 서로 다른 결과를 얻는다
public class day230325_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent1 p1 = new Parent1();
		Child1 c1 = new Child1();
		System.out.println("p1.x = "+ p1.x);
		p1.method();
		System.out.println("c1.x = "+c1.x);
		c1.method();
		}

}

class Parent1 {
	int x = 100;
	void method() {
		System.out.println("Parent Method");
	}
}

 class Child1 extends Parent{
	int x = 200;	// 조상 클래스 멤버와 같은 이름의 멤버
	
	void method() {
		System.out.println("Child Method");
	}
}
