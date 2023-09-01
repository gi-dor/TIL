class Mypoint{
	int x;
	int y;  // 인스턴스 변수 iv
	
	Mypoint(int x,int y){
		this.x =x;
		this.y = y;
	}
	
	double getDistance(int x1, int y1) {
		double result = Math.sqrt((x-x1)*(x-x1)+(y-y1)*(y-y-1));
		return result;
	}
}

public class day230215_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mypoint p = new Mypoint(1,1);
		
		System.out.println(p.getDistance(2,2));
	}

}
