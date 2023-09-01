package day15.예제문제;

public class day230214_02 {
// 반환값이 없는 메서드 호출
	
	public static void main(String[] args) {
		 Note n = new Note();    
		 n.print99danAll();
		 	
		 
		 // 객체 생성안하고 책에있는거 그대로 
		 // point99danAll(); 입력하고 왜 안되는지 꿍시렁거림..
		 
		 // Note 클래스 참조변수 n 선언하고
		 // new 연산자로 객체(인스턴스) 생성
		 
		 // 클래스 내의 '메서드를 호출'하기 위해서는 
		 // 해당 클래스의 인스턴스를 생성한다음 참조변수를 통해야 한다.
		
	}

}

class Note{		// 클래스 명은 항상 대문자로 시작하기
	
	void print99danAll() {
		for ( int i = 2; i <= 9 ; i++) {
			for ( int j =1; j <=9; j++) {
				System.out.print(i +"*"+ j +"= "+(i*j) );
				System.out.println();
			}
			System.out.println();
			
		}
	}
	
	
	
}
