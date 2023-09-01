//package day34_2;
//
//import day34.MyParent;
//
//class MyChild extends MyParent{  // MyParent 에러
//								 // import day34.MyParent;
//								 // class MyChild extends day34.MyParent
//	public void printMembers() {
////		System.out.println(prv);	// 에러 다른패키지 부모클래스를 가져왔는데 private 은 같은 클래스 파일에서만 가능함
////		System.out.println(dft);	// 에러 다른패키지 부모클래스에서 가져옴, default는 같은 패키지에서만 사용가능
//		System.out.println(prt);	// 같은패키지 + 다른패키지여도 자손이면 가능!
//		System.out.println(pub);	// 제한없음 이곳 저곳에서 쓸수있음.
//	}
//}
//public class pkg2 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		MyParent p = new MyParent();
////		System.out.println(p.prv);	// 에러 private은 같은 클래스에서만 사용
////		System.out.println(p.dft);	// 에러 default,같은 패키지
////		System.out.println(p.prt);	// 자손관계도 아니도 다른패키지 다른 클래스 여서 에러
//		System.out.println(p.pub);	// public 상관없음
//	}
//
//}
