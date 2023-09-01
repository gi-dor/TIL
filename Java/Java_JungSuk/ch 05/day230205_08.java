
public class day230205_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 // 배열
		 // 같은 타입의 여러 변수를 하나로 묶음으로 다루는것
		

		int [] score = new int [5];
		// int 값 5개를 저장할수 있는 배열
		
		
		
		// 배열의 선언과 생성
		// 배열의 선언 - 배열을 다루기 위한 '참조변수' 의 선언
		
		// 1. 타입 [ ] 변수이름;
		int[] score1;
		String [] name;
		
		// 2. 타입 변수이름 [ ];
		int score2 [];
		String name1 [];
	
		int[] score3; // int타입의 배여를 다루기위한 참조변수 score3선언
		score3 = new int[5];// int 타입의 값 5개를 저장 할수있는 배열생성
		// score[0] , score[1] ,score[2], score[3] ,score[4]
		// index의 범위 0 ~ 4  , 5개
		
		
		
		// 배열의 인덱스
		// 배열의 인덱스 - 각 요소에(저장공간) 자동으로 붙는 번호
		// " index의 범위는 0 부터 '배열길이-1'까지
		// int [] score = new int[5];
		//  길이가 5인 int배열
		// 0 ~ 5-1 
		// 저장공간 하나를 배열의 요소라고 한다
		
		// score [3] = 100;
		// score[0] ,score[1],score[2],score[3],score[4]
		// 배열의 4번째 요소에 100을 저장한다
		
		// int value = score[3];
		// 배열 score의 4번째 요소의 값을 읽어서 'value'에 저장
		// int value = 100
		
//		int[] score ;		// 1. 배열 score 선언 (참조변수)
//		score = new int[5]; // 2. 배열의 생성 (int저장공간x5)
		
		int[] score4 = new int[5];
		score4 [3] =100;
		// score[0] score[1] score[2] score[3] score[4]
		System.out.println(score4[3]);

		System.out.println("score4 [0] "+ score4[0]);
		System.out.println("score4 [1] "+ score4[1]);
		System.out.println("score4 [2] "+ score4[2]);
		System.out.println("score4 [3] "+ score4[3]);
		System.out.println("score4 [4] "+ score4[4]);
		
		int value = score4 [3];
		System.out.println("value = "+value);
		
	}

}
