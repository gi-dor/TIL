public class day230309_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("예제 5 - 11 빈도수 구하기");
		int[] numArr1 = new int[10];
		int[] counter = new int[10];
		
		for ( int i = 0; i < numArr1.length; i++) {
			numArr1[i] = (int)(Math.random()*10);
			System.out.print(numArr1[i]);
		}
		System.out.println();
		
		for ( int i = 0; i< numArr1.length; i++) {
			counter[numArr1[i]]++;
		}
		for ( int i = 0; i < numArr1.length; i++) {
			System.out.println(i+"의 갯수 : "+counter[i]);
		}
	 }

}
