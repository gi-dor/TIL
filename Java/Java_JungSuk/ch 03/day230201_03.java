package ch03;

public class day230201_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int x = 2;
		int y = 5;
		char c = 'A'; // A의 문자코드는 65
		
		System.out.println(1+x<<33);   
		System.out.println(y >= 5 || x<0 && x>2); // true
		System.out.println(y +=10 -x++);  // 12?? ->  13
		// y = y+10 - (x++)
		//				x
		//				x++
		// y = 15 - (x++)
		// y = 15 - 2 
		// y = 13
		System.out.println(x+=2); // 4?? -> 5
		// x = x+2
		// x = 2가 아닌 3 , 위에서 x++이기 때문에 
		// x = 3+2
		// x = 5
		System.out.println(!('A' <= c && c <= 'Z')); // false
		System.out.println('C'-c); //2
		System.out.println('5'-'0'); //5
		System.out.println(c+1); // 66
		
		System.out.println(++c); // 66 
		// 1.println(++c) 65+1
		// 2.println(c) 66
		
		System.out.println(c++); //66
		// println(c) 66
		// println(c++)  66+1
		
		System.out.println(c); //67
		
		
	}

}
