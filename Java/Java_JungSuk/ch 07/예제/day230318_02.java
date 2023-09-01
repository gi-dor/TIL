package day15.예제;

public class day230318_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Point[] p = { 
				new Point(100,100),
				new Point(200,150),
				new Point(300,220)		
							};
		
		Triangle t = new Triangle (p);
		Circle c = new Circle (new Point(150,150),50);
		
		t.draw();
		c.draw();
				}
		}





class Shape {
	String color = "black";
		void draw() {		// 작업을 수행하는 입력 결과값이 없기에 void가 타입이됨
				System.out.printf("color = %s%b",color);	
			}
		}


class Point {
	int x ;
	int y;

	Point() {			// 생성자 Point에서
			this(0,0);		// 생성자 Point( int x , int y )호출
				}
	Point(int x, int y ){
			this.x = x;
			this.y = y;
				}
	
	String getXY() {   // String 타입의 메서드 
				return "("+x+","+y+")";		// (x,y) 값 반환
								}
			
				}



class Circle extends Shape{
		Point center;	// 원의 원점 좌표 ? 뭔말이냐 이게 
						// Point p = new Point();  그냥 이거 집어넣고 쓰면 안되나 ???
		int r; 			// 원의 반지름 

//	Shape 클래스의 멤버2개 포함되어있음	
//	String color = "black";
//		void draw() {		// 작업을 수행하는 입력 결과값이 없기에 void가 타입이됨
//							System.out.printf("color = %s%b",color);
//							}
		
		
	Circle (){
		this(new Point (0,0),100);     // Point클래스의 x,y의 값을 0 ,0 으로 초기화 하고
						}				// Circle 클래스의 r 값을 100으로 초기화 한다는 말인거 같음 
								// this(new Point (0,0),100) 이거 좀 쉽게 못쓰나.. 어려워서 나중에쓰것나
								// Point center 이딴거 말고 
								// Point p = new Point(); 이렇게 쓰지 좀;
	
	Circle(Point center , int r){
			this.center = center;
			this.r = r;
						}

void draw() {  
// 입력,결과값없는 메서드인가봄 그러니 int나 string 안쓰고 타입을 void로 쓰게
System.out.printf("center = (%d,%d) , r = %d  , color = %s%n" , center.x, center.y ,r,color);
						}
		
			}



class Triangle extends Shape{
	
			Point [] p = new Point[3];


				Triangle(Point[] p) {
										this.p = p;
												}

void draw () {
System.out.printf("p1 = %s , p2 = %s , p3 = %s , color = %s%n", 
		p[0].getXY(),p[1].getXY(),p[2].getXY(),color);
							}

		}


