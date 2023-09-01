import java.util.Arrays;

public class day230206_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		// String클래스 
		// String클래스는 char배열에 기능을 추가한것
		// String 클래스 = char[] + 메서드 (기능);
		
		
		// String 클래스의 주요 메서드
		
		// char charAt()  문자열에서 해당위치(int index)에 있는 문자를 반환
		// int length () 문자열의 길이를 반환
		// String substring(from ~ to) 문자열에서 해당범위 from ~ 60 문자열 반환 to는 포함안됨
		// boolean equals() 문자열의 내용이 같은지 확인 true , false
		// char[] to CharArray() 문자열을 문자배열(char[])로 변환해서 반환한다
		
					//012345
		String str = "ABCDEF";
		// str.length() 6
		char ch = str.charAt(5);
		String str2 = str.substring(0,4); //0~3
		String str3 = str.substring(1); // 1 ~ 
		
		System.out.println(str2);
		System.out.println(str3); 
		System.out.println(ch);
		
		// Arrays로 배열 다루기
		// 문자열의 비교와 출력 - equals () , toString()
		
		int[] arr = {0,1,2,3,4};
		int[][] arr2D = { {11,12} , {21,22} };
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.deepToString(arr2D));
		
		//비교하기
		String[][] str2D = new String [][] { {"aaa","bbb"} , {"AAA","BBB"} };
		String[][] str2D2 = new String[][] { {"aaa","bbb"} ,{"AAA","BBB"}  };
		
		System.out.println(Arrays.equals(str2D,str2D2)); // equals() 일차원 배열에서만 사용가능
		System.out.println(Arrays.deepEquals(str2D,str2D2)); // deepEquals() 다차원 배열에 사용
		
		// 배열의 복사 
		int[] arr1 = {0,1,2,3,4};  
		int[] arr2 = Arrays.copyOf(arr, arr.length); // arr2 = [0,1,2,3,4,]
		int[] arr3 = Arrays.copyOf(arr, 3); // arr3 = [0,1,2]
		int[] arr4 = Arrays.copyOf(arr, 7); // arr4 = [0,1,2,3,4,0,0]
		int[] arr5 = Arrays.copyOfRange(arr, 2,4); // arr5 = [2,3]  4는 미포함
		int[] arr6 = Arrays.copyOfRange(arr, 0 , 7); // arr6 = [0,1,2,3,4,0,0]
		
		// 배열의 정렬 낮은순서 ~ 높은순서
		int[] arr0 = { 3,2,0,1,4};
		Arrays.sort(arr0);
		System.out.println(Arrays.toString(arr0));
		
		
		
	}

}
