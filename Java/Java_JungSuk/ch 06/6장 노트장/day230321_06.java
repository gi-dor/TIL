public class day230321_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Q. 1-10 Point3D클래스의 toString() 이 x,y,z의 값을 문자열로 반환하도록 오버라이딩 하시오
		
		Point93D pd =new Point93D();
		System.out.println(pd.toString());
	}

}
class Point93 {
	int x; 
	int y;
}

class Point93D extends Point93{
	int z;
	Point93D(){}
	Point93D(int x,int y , int z){
		this.x=x;
		this.y=y;
		this.z=z;
	}
public String toString() {
		return "x : " +x+ ", y : "+y+", z : "+z;
	}
}