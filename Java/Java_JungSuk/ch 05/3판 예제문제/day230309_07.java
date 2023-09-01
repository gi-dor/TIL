import java.util.Arrays;

public class day230309_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("예제 5 - 9 임의의 값으로 배열 채우기");
		int [] code = {-4,-1,3,6,11};
		int [] arr = new int[10];
		
		for ( int i = 0; i <arr.length;i++) {
			int tmp1 = (int)(Math.random()*code.length);
			arr[i] = code[tmp1];
		}
		System.out.println(Arrays.toString(arr));
		System.out.println();
	}

}
