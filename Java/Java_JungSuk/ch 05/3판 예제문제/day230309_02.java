import java.util.*;

public class day230309_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			System.out.println("예제 5-1");
			int [] score = new int [5];
			int k = 1; 
			
					score [0] = 50;
					score [1] = 60;
					score [k+1] = 70; 		// 1+1 =2 score[2]라는 뜻임
					score [3] = 80;
					score [4] = 90;
		
					int tmp = score [k+2] + score[4];
					// score [3] + score [4] 라는 뜻임
					
					for( int i  = 0; i < score.length; i++) {
						System.out.printf("score[%d] : %d%n",i,score[i]);
					}
					System.out.printf("tmp : %d%n",tmp);
					
					System.out.printf("score [%d] : %d%n",2,score[2] );
					System.out.println();
					//System.out.printf("score [%d] : %d%n",7,score[7] );
					// index의 범위를 넘어감 intdex의 범위 : 0 ~ 4
					
					System.out.println("예제 5-2");
					int[] iArr= { 100, 95,80,70,60};
					for( int i = 0; i < iArr.length;i++) {
						System.out.println(iArr[i]);
					}
					for( int i = 0; i < iArr.length;i++) {
						System.out.print(iArr[i]+",");
					}
					System.out.println();
					System.out.println(Arrays.toString(iArr));
					
					int[] iArr1 = new int[10];
					int[] iArr2 = new int[10];
				//	int[] iArr3 = new int[] {100,95,80,70,60};
					int[] iArr3 = {100,95,80,70,60};
					char[] chArr = {'a','b','c','d'};
					
					for (int i = 0; i < iArr1.length; i++) {
						iArr1[i] = i+1;  
						// i는 0 이기 때문에 0~9 +1  , 1 ~ 10의값이 나옴 
					}
					for( int i = 0; i < iArr2.length; i++) {
						iArr2[i]= (int)(Math.random()*15)+1;
						// 1 ~ 15의 임의의 수 
					}
					for( int i = 0 ; i< iArr1.length; i++) {
						System.out.print(iArr1[i]+",");
					}System.out.println();
					
					System.out.println(Arrays.toString(iArr1));
					System.out.println(Arrays.toString(iArr2));
					System.out.println(Arrays.toString(iArr3));
					System.out.println(chArr);
					System.out.println(iArr3);
					
					
				
					
	}

}
