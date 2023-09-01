//package day18;
//// ch 11 - vector
//import static org.junit.Assert.assertTrue;
//
//import java.util.Vector;
//
//import org.junit.Test;
//
//// 1. 객체를 저장할 객체 배열과 크기를 저장할 변수를 선언
//// 2. 생성자 MyVector(int capacity)와 기본생성자 MyVector()를 선언
//// 3. 메서드 구현
////  int size () = 컬렉션의 크기 ( size, 객체배열에 저장된 객체의 개수)를 반환
////	int capacity() = 컬렉션의 용량 (capacity, 객체배열의 길이) 를 반환
////	boolean isEmpty() = 컬렉션이 비어있는지 확인
////	void clear() =  컬렉션의 객체를 모두 제거 ( 객체배열의 모든 요소를 null로 )
////	Object get (int index) =  지정된 객체의 index를 반환 ( 못찾는다면 -1 )
////	void setCapacity (int capacity) = 컬렉션의 용량을 변경함
////	void ensureCapacity (int minCapacity) = 컬렉션의 용량을 확보
//// 	Object remove (int index) = 컬렉션에서 객체를 삭제
////	boolean add (Object obj) = 컬렉션에 객체를 추가
//
//public class day230223_01 {
//	Vector v = new Vector ();
//	Vector v1 = new Vector(5);	// 용량(capacity)이 5인 vector
//	Vector v2 = new Vector(7); // 용량이(capacity) 7인 vector
//
////	Myvector v = new Myvector();
//
//	@Test
//	public void test() {
//		assertTrue(v.size()==0);
//
//		v.add("1");
//		assertTrue(v.size () == 1);
//
//		v.add("2");
//		assertTrue(v.size()==2);
//
//		v.add("3");
//		assertTrue(v.size()==3);
//
//		v.add("4");
//		assertTrue(v.size()==4);
//	}
//
//	@Test
//	public void test1() {
//		// Vector v1 = new Vector(5);	// 용량(capacity)이 5인 vector
//		assertTrue(v1.size()==0);
//
//
//		v1.add("1");
//		assertTrue(v1.size()==1);
//		assertTrue(v1.capacity()==5);
//		// assertTrue(v1.capacity()==1); 에러, new Vector(5)로 설정했음;
//
//		v1.add("2");
//		assertTrue(v1.size()==2);
//		assertTrue(v1.capacity()==5);
//		// assertTrue(v1.capacity()==2);  에러, new Vector(5)로 설정했음;
//
//		v1.add("3");
//		assertTrue(v1.size()==3);
//		// assertTrue(v1.capacity()==3); 에러, new Vector(5)로 설정했음;
//
//		v1.trimToSize(); // 빈공간을 없앤다 - 용량과 크기가 같아진다
//		assertTrue(v1.size()==3);
//		assertTrue(v1.capacity()==3);
//
//		v1.ensureCapacity(6);	// capacity 가 6이상 되도록 한다
//		assertTrue(v1.size()<=6);
//		assertTrue(v1.capacity()==6);
//
//		v1.setSize(7);  			// size가 7 이 되게한다
//		assertTrue(v1.size()==7);
//		assertTrue(v1.capacity()==12);
//		// 기존 capacity 용량이 6인데 크기가 7임
//		// capacity > size
//		// (capacity)*2  capacity = 12
//		v1.clear();				// vector에 저장된 모든 요소를 제거한다
//		assertTrue(v1.size()==0);	// size객체만 제거 , null값이 됨
//		assertTrue(v1.capacity()==12);
//		assertTrue(v2.isEmpty()==true);
//	}
//	@Test
//	public void test2() {
//		// Vector v2 = new Vector(7); // 용량이(capacity) 7인 vector
//		v2.add("3");			// 객체마다  입력
//		assertTrue(v2.size()==1);
//		assertTrue(v2.capacity()==7);
//
//		v2.add("2");
//		assertTrue(v2.size()==2);
//		assertTrue(v2.capacity()==7);
//
//		v2.add("5");
//		assertTrue(v2.size()==3);
//		assertTrue(v2.capacity()==7);
//
//		v2.add("2");
//		assertTrue(v2.size()==4);
//		assertTrue(v2.capacity()==7);
//
//		v2.trimToSize(); 		// 빈공간 없애기
//		assertTrue(v2.size()==4);
//		assertTrue(v2.capacity()==4);
//
//		v2.ensureCapacity(10);	// capacity ( 용량 )가 10이되게하라
//		assertTrue(v2.size()==4);
//		assertTrue(v2.capacity()==10);
//
//		v2.setSize(12);			// size ( 크기 )가 12가 되게한다
//		assertTrue(v2.size()==12);
//		assertTrue(v2.capacity()==20); // 기존capacity는 10이었다 하지만 size가 12가 되면서 담을수 없어 capacity 용량을 2배로 늘렸다
//		// (capacity)*2
//
//		v2.clear();				// vector의 저장된 모든 요소를 제거, size도 다 죽음
//		assertTrue(v2.size()==0);
//		assertTrue(v2.capacity()==20);
//		assertTrue(v2.isEmpty()==true);
//
//	}
//
//
//}
