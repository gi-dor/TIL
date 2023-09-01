package day02;

public class day230201_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 조건 연산자
		int x;
		int y;
		int z;
		
		int absX, absY ,absZ;
		char signX ,signY ,signZ;
		
		x = 10;
		y = -5;
		z = 0;
		
		absX = (x>=0)? x:-x;
		System.out.println("x>=0 ,"+absX);
		
		absY = (y>=0)? y : -y;
		System.out.println("y>=0 ,"+absY);
		
		absZ = (z>=0)? z : -z;
		System.out.println("z >= 0 ,"+absZ);
		
		signX = x>0? '+':(x==0)?' ' : '-';
		System.out.println("signX = ,"+signX);
		
		signY = y>0? '+':(y==0)?' ' : '-';
		System.out.println("singY = ,"+signY);
		
		signZ = z>0? '+':(z==0)?' ' : '_';
		System.out.println("signZ = ,"+signZ);
		
		System.out.printf("x = %c%d%n" ,signX,absX);
		System.out.printf("y = %c%d%n" , signY,absY);
		System.out.printf("z = %c%d%n" , signZ,absZ);
	}

}
