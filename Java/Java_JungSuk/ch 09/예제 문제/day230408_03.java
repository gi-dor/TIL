package weekend;
class Person{
	long id;	// 주민번호
	public boolean equals (Object obj) {
		if( obj instanceof Person) {
			return id == ((Person)obj).id;
		}else {
			return false;
		}
	}
	
	Person (long id ){
		this.id = id;
 	}
	
}

public class day230408_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person(9401200000000L);
		Person p2 = new Person(9401200000000L);
		
		if(p1.equals(p2) ) {
			System.out.println("p1,p2는 같다");
		}else {
			System.out.println("p1,p2는 다르다");
		}
			
		
	}

}
