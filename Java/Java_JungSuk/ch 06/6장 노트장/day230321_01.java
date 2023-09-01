public class day230321_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 - 5. Point클래스에 두점 사이의 거리를 double 타입의 값으로 계산해서
		// 반환하는 staic 메서드 getDistance(Point p1 , Point p2)를 추가하시오
		
		Point99 p1 = new Point99();
		Point99 p2 = new Point99();
		
		System.out.println(Point99.getDistance(p1,p2));
	 }
 }
class Point99 {
	int x;
	int y;
	
	Point99(){	}
	
	Point99(int x , int y){
		this.x = x;
		this.y = y;
	}
	
	static double getDistance(Point99 p1, Point99 p2) {
		
		return Math.sqrt((p1.x - p2.x)*(p1.x - p2.x) + (p1.y - p2.y)*(p1.x - p2.x) );
		
	}
}
