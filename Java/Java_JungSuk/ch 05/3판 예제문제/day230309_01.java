import java.util.Arrays;

public class day230309_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		// 배열의 선언과 생성을 한번에
		//		int[] arr1 = new int[3];	// 길이가 3인 배열
		//		int[] arr2 = new int[3];	// 길이가 3인 배열
		
		// 배열의 초기화 
		int [] arr1 = {1,2,3};
		int [] arr2 = {1,2,3};
		
		
		
		// 배열의 길이 알아보기 배열이름.length
		System.out.println("배열길이 알아보기");
		System.out.println("arr1.length = "+arr1.length);
		System.out.println("arr2.length = "+arr2.length);
		
		
		
		// 배열요소 출력하기
		// 1. for문 사용
		System.out.println();
		System.out.println("배열요소 출력하기");
		for (int i = 0; i<arr1.length;i++) {
			System.out.println("arr1["+i+"] = "+arr1[i]);
		}
		
		for (int i = 0; i<3;i++) {
			System.out.println("arr2["+i+"] = "+arr2[i]);
		}
		System.out.println();
		
		// 2. Arrays.toString() 메서드 사용 - import문 추가해야함 ctrl shift o  단축키
		System.out.println("Arrays.toString 사용해서 배열요소 출력하기");
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println();
		
		// 배열의 초기화
		// 배열의 각 요소에 값을 저장하는것
		// 배열은 기본적으로 자동초기화 됨 int값인 0 으로 초기화됨 
		
		// 1. 초기화 방법
		// int[] score = new int [5];
		//		score[0] =50;
		//		score[1] =60;
		//		score[2] =70;
		//		score[3] =80;
		//		score[4] =90;
		
		// 2. 초기화방법 - 규칙이있으면 쓰기 좋음
		// int[] score = new int[5];
		// for(int i = 0; i < score.length; i++) {
		//	score[i] = i*10 +50;
		// }
		
		// 3. 초기화방법
		//  int [] score = {50,60,70,80,90}; 
		//	선언생성 초기화 한번에  가장많이쓰임
		
	
		
		
		// Q1 
		//	arr1 = {1,2,3}
		//	arr2 = {1,2,3}  두 배열 비교해서 같으면"같습니다" 다르다면 "다릅니다" 출력하시오
		

		System.out.println("Q-1");
		int [] arr3 = {1,2,3};
		int [] arr4 = {1,2,3};
		
		if( arr3.length == arr4.length) {
			
			for(int i = 0; i<arr3.length;i++) {
				for(int j = 0; j<arr4.length; j++) {
						if( arr3[i] == arr4[j]) {
								System.out.println("배열의 길이와 요소가 같습니다");
								}else {
									System.out.println("배열의 길이는 같지만 요소가 다릅니다");
											}
										}
								}
							}else {
									System.out.println("배열의 길이가 다릅니다");
								}
							System.out.println();
	
		
	
		System.out.println("Q-2");
		if (arr3.length == arr4.length) {		// arr3 arr4 길이가 같을때 
			for(int i =0; i< arr3.length; i++) {	
				for( int j = 0; j<arr4.length; j++) {
				if(arr3[i] == arr4 [j]) {		// arr3[1] == arr4[1] 라면
					System.out.printf("배열의 길이와 요소가 같음 arr3[%d] == arr4[%d]%n",i,j);		
					}else {
					System.out.printf("배열의 길이는 같음 요소가 다르다  arr3[%d] != arr4[%d]%n",i,j);		
									}
								} 
							}
						}  else {
					System.out.println("배열의 길이가 다릅니다");
				}
		
		
			System.out.println();
			System.out.println("Q-3");
			int DD = 0;	// 배열위치와 요소가 같음
			int CC = 0;	// 배열위치는 같음 요소는 다름
			
			
			if (arr3.length == arr4.length) {
				for(int i =0; i< arr3.length; i++) {
					for( int j = 0; j< arr4.length; j++) {
					if(arr3[i] == arr4 [j]) {
						DD++; 
					}else {
						CC++;
								}
							}	
						} 
					} else { 
						System.out.println("두 배열의 길이가 다름");
				       }
				System.out.println(DD+"DD"+CC+"CC");
				System.out.println();

		// Q2. 
		// int[] ar1 ={ 1,2,3};
		// int[] ar2 = { 3,2,1};
		// 두 배열을 비교해서 
		// 같은숫자 같은 위치 S
		// 같은숫자 다른위치 B
		// 1S2B이 나오게 
				int[] ar1 = {1,2,3};
				int[] ar2 = {3,2,1};
				int S = 0;
				int B = 0;
				
				System.out.println("Q2-1");
//				if( ar1.length == ar2.length ) {
//					for ( int i =0; i< ar1.length; i++) {
//						for ( int j = 0; j< ar2.length; j++) {
//							if(ar1[i] == ar2[j]) { 
//								if(i==j) {
//									S++;
//								}else {
//									B++;
//									}	
//								}
//									}
//								}
//						}
//
//					System.out.println(S+"S"+B+"B");
//					System.out.println();
				
				
				
		System.out.println("Q2-2");
//		for ( int i =0; i< ar1.length; i++) {
//			for ( int j = 0; j< ar2.length; j++) {
//				if(ar1[i] == ar2[j]) { // ar1[0] == ar2[0] 일때 요소 값i,j가 같다면 S++
//					if(i==j) {		   // 그러면 ar1[0] ar2[1]은 어떻게 비교 해야함? 
//						
//						S++;
//					}else {
//							B++;
//							}	
//						}
//				}
//			}
//		System.out.println(S+"S"+B+"B");
		

						int s = 0;
						int b =0;
						int [] Ar1 = {1,2,3};
						int [] Ar2 = {3,2,1};
						for(int i = 0; i< Ar1.length; i++) {
							System.out.print(Ar1[i]);
						}
						System.out.println();
							for( int j = 0; j < Ar2.length; j++) {
							System.out.println(Ar2[j]);
						}
					   
						System.out.println(Arrays.toString(Ar1));
					    System.out.println(Arrays.toString(Ar2));
					    
					    for( int i = 0; i < Ar1.length; i++) {
					    	for( int j = 0; j < Ar2.length; j++) {
					    		if(Ar1[i] == Ar2[j]) {
					    			if(i == j) {
					    				S++;
					    			}else {
					    				B++;
					    			}
					    		}
					    	}
					    }	System.out.println(S+"S"+B+"B");
						
						
						
		
		
	}

}
