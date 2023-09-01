public class day230309_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("예제 5-7 섞기"); // 배열
		int [] numArr = new int[10];
		for( int i = 0; i< numArr.length; i++) {
			numArr[i] = i; // 배열을 0 ~ 9 로 초기화
			System.out.print(numArr[i]);
		}System.out.println();
		
		for( int i = 0; i <50; i++) {
			int n = (int)(Math.random()*10); 
			
			int tmp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = tmp ;
		}
		for ( int i = 0; i< numArr.length; i++) {
			System.out.print(numArr[i]);
		}
		System.out.println();

	}

}
