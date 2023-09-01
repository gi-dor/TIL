package day15.예제;

abstract class Unit{
	int x;
	int y;
	abstract void move( int x, int y);
	void stop() { System.out.println("멈춰!");}
}
interface Fightable{
	public abstract void move(int x , int y);
	void attack(Fightable f);	// public abstract 생략
}

class Fighter extends Unit implements Fightable{
	public void move( int x, int y) {
		System.out.println("["+x+","+y+"]로 이동");
	}	// 오버라이딩 -> 조상에게 받아서 자손에서 수정
	public void attack(Fightable f) {
		System.out.println(f+"를 공격");
	}	// 오버라이딩 조건 : 조상 (현재 public임)보다 접근제어자 범위가 좁으면 안되서 public 
	
	Fightable getFightable() {
		Fighter f = new Fighter();
		return (Fightable)f;
	}
}


public class day230408_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fighter f = new Fighter();
		Fightable f2 = f.getFightable(); 
		
//		// Unit f = new Fighter();	// Unit에는 attack()없음
//	 	// Fighter f = new Fighter();
//		 Unit u = new Fighter();	
//		 Fightable f = new Fighter(); // attack() , move()만있음	
//	
//		 u.move(175,219);
////		 u.attack(new Fighter()); // Unit에 attack() 없어서 호출불가
//		 u.stop();
//		 
//		 f.move(175,219);
//		 f.attack(new Fighter());
////		 f.stop(); // Fightable stop()없어서 호출불가
//		 
		 
		 //Fighter f = new Fighter();
	 	
	 
	
		
	}

}
