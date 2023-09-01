package day18.예제문제;

import java.util.*;


public class day230405_05_HashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// p427 기초편 예제 11-11 HashSet예제 3
		
		 HashSet a = new HashSet();
		 // HashSet 순서유지 x 중복허용 x
		 // Set a = new Set(); 에러 왜 ? Set은 인터페이스 잖아.. 인터페이스는 혼자 객체 못만들어..
		 // HashSet a = new HashSet(); ok
		 
		 a.add("abc");
		 a.add("abc");
		 a.add(new Person("David",10) );
		 a.add(new Person("David",10) );
		 
		 System.out.println(a);
		 
	}

}

// eqauls() 랑 hashCode() 오버라이딩해야 HashSet이 제대로 작동함

class Person{
	String name;
	int age;	

	@Override
	public int hashCode() {
		// int hash (Object ...values); // 가변인자
		return Objects.hash(name, age);
	}
 
	@Override
	public boolean equals(Object obj) {
		if( !(obj instanceof Person) )
			return false;
			
			Person p = (Person)obj;
			
			// 자신 this의 이름과 나이를 p와 비교
			return this.name.equals(p.name) && this.age==p.age;
	}

	Person(String name , int age){
		this.name = name;
		this.age = age;
	}
	
	 public String toString() {
		return name+":"+age;
	}
}