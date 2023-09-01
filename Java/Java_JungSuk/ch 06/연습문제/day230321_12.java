package day15.연습문제;

public class day230321_12 {
	static int[] shuffle (int[]arr) {
		// i cannot be resolved to a variable
		// type mismatch: cannot convert from Class<Integer> to boolean
		// Syntax error, insert "VariableDeclarators" to complete LocalVariableDeclaration
		for(int i=0; i<arr.length; i++) { 
			int j = (int)(Math.random()*arr.length);
			int tmp;
			tmp = arr[i];
			arr[i]= arr[j];
			arr[j] = tmp;
		} 
		return arr;  
		//This method must return a result of type int[]
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("연습문제 6-20");
		int [] original = { 1,2,3,4,5,6,7,8,9 };
		System.out.println(java.util.Arrays.toString(original));
		
		int [] result = shuffle (original);
		System.out.println(java.util.Arrays.toString(result));
		
		
		
	}

}

