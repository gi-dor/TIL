package day15.접근제한자;


public class MyParent{	// 접근제한자 default 이기 때문에 패키지에서만 사용가능 
						// public으로 변경
		private   int prv; 		//  같은 클래스
				  int dft;		// 같은 패키지
		protected int prt;		// 같은 패키지 + 다른패키지 자손
		public    int pub;		// 접근제한 없음
		
		public void printMembers() {
			System.out.println(prv);
			System.out.println(dft);
			System.out.println(prt);
			System.out.println(pub);
		}
}
		// 하나의 파일에는 public 클래스는 1개만 있어야함

 class MyParentTest { // 접근제한자 default로 변경

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			MyParent p = new MyParent();
//			System.out.println(p.prv);	// 에러 private은 같은 클래스에서만 사용
			System.out.println(p.dft);	// default,같은 패키지
			System.out.println(p.prt);	// protected ,같은패키지+다른패키지 자손
			System.out.println(p.pub);	// public 상관없음
			
	}

}
//![접근제한자](https://user-images.githubusercontent.com/86302876/227128814-58140425-7918-4096-b615-a12e12e93e93.jpg)
//
//
//![접근제한자 2](https://user-images.githubusercontent.com/86302876/227128821-3d379ae2-df13-4752-8e20-202e8ed8e86f.jpg)
