public class day230309_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("예제 5-6 최대값과 최소값");
		int[] score1 = { 79,88,91,33,100,55,95};
		int Max = score1[0];
		int Min = score1[0];

		for( int i = 0 ; i< score1.length; i++) {
			if(score1[i]>Max) {
				Max = score1[i];
			}else if ( score1 [i] < Min) {
				Min = score1[i];
			}
		}
			System.out.println("최대값 Max = "+Max);
			System.out.println("최소값 Min = "+Min);
			
			System.out.println();
		
	}

}
