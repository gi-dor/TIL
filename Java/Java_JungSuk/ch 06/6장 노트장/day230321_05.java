public class day230321_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 - 9 Point3D클래스에서 생성자 Point3D(int x, int y , int z ) 와 기본생성자(x,y,z를 모두 1로 초기화)
	}

}
class Point96 {
	int x;
	int y;
}
class Point3DD extends Point96{
	int z;
	
	Point3DD(){
		this(1,1,1);
	}
	
	Point3DD(int x, int y, int z ){
		this.x=x;
		this.y=y;
		this.z=z;
	}
	
	 public String toString() {
		return "x : "+x+", y : "+y+", z : "+z;
		
	}
}
