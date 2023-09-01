			// 포함관계

			// 클래스의 멤버로 참조변수를 선언하는것
			// 작은단위의 클래스를 만들고  이 둘을 조합해서 클래스를 만든다
			
				
			// 클래스 간의 관계 결정하기
			// 상속관계 : ~은 ~이다 (is-a)
			// 포함관계 : ~은 ~을 가지고 있다 (has-a)
			// 대체로 상속 10 % , 포함 90 %
			
			// 한 클래스를 작성하는데 다른클래스를 멤버변수로 선언하여 포함시키기
			// 하나의 거대한 클래스를 작성하기보다 작은 단위로 여러개의 클래스를 작성한 다음
			// 클래스들을 포함관계로 재사용 하면 쉽게 클래스를 작성 할수 있다.
// class Point{
// 	int x;
// 	int y;
// 	}

// class Circle {
// 	int x;
// 	int y;
// 	int r;
// }

//  포함 관계	
// class Circle {
// 	point c = new Point();
// 	int r;
// 	}

//  상속 + 포함 관계
// class Circle extends Point {
// 	Point p = new Point();
// 	int r;
// 	}




package day15;
	class Point{
		int x;
		int y;
	}

//	class Circle extends Point{	// 상속
//		int r;
//	}

	class Circle { 		// 포함
		Point p = new Point();
		int r;
	}
	
	
public class day230220_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle c = new Circle();
//		c.x = 1;
//		c.y = 2;
//		c.r = 3;
		c.p.x = 1;
		c.p.y = 2;
		c.r = 3; 
		System.out.println("c.p.x = "+c.p.x);
		System.out.println("c.p.y = "+c.p.y);
		System.out.println("c.r = "+c.r);
		
	}

}
