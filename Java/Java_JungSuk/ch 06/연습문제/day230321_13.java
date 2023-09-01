package day15.연습문제;

public class day230321_13 {
	// 메서드명 max
	// 반환타입 int
	// 매개변수 int[] arr
	// 주어진 int 배열의 값중에서 제인 큰값을 반환
	// 만약 주어진 배열이 null 이거나 크기가 0인경우 -999999 반환 
	//	int a[] = new int[0];
	//	int b[] = new int[]{};  
    //	int c[] = {};

	static int max (int[]arr) {  
		if(arr==null || arr.length == 0)
			return -999999;
		
		int max = arr[0];
		
		for (int i = 0; i<arr.length;i++) {
		if(arr[i]>max)
			max = arr[i];
		}
		return max;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("연습문제 6-23");
		
		int [] data = { 3,2,9,4,7 };
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("최대값 : " + max(data));
		System.out.println("최대값 : " + max(null));
		System.out.println("최대값 : " + max(new int[] {} ));
		

//		int a[] = new int[0];
//		int b[] = new int[]{};
//		int c[] = {};    크기가 0 인 배열
		
	}

}

	
