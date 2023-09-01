class Point {
	int x ;
	int y;
	
}

//class Circle extends Point{	// 상속
//	int r;
// }

class Circle {	// 포함
	Point p = new Point();
	int r;
}
public class day230209_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle c = new Circle();
//		c.x = 1;
//		c.y = 2;
		
		c.p.y = 2;
		c.p.x = 1;
		c.r = 3;		
		
		
//		System.out.println("c.x = "+c.x);
//		System.out.println("c.y = "+c.y);
//		System.out.println("c.r = "+c.r);

		System.out.println("c.p.x = "+c.p.x);
		System.out.println("c.p.y = "+c.p.y);
		System.out.println("c.r = "+c.r);
		
	}

}
