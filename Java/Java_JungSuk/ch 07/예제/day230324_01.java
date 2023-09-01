package day15.예제;


class Parent {
 int x = 100;
 
 void method() {
	 System.out.println("Parent Method");
 	}
}

class Child extends Parent {
	int x  = 200;
	
	void method() {
		System.out.println("x = "+x);
		System.out.println("super.x = "+super.x);
		System.out.println("this.x = "+this.x);
	}
	
}

public class day230324_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new Parent();
		Child c = new Child();
		
		System.out.println("p.x = "+p.x);
		p.method();
		System.out.println();
		System.out.println("c.x = "+c.x);
		c.method();
	}

}
