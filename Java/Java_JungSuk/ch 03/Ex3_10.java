package day02;


public class Ex3_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		
	
		   // ���ڿ� �� 
		
				String str1 = "abc";
				String str2 = "abc";
				System.out.println(str1 == str2);   // true
				System.out.println(str1.equals(str2));   // true

				String str3 = new String("abc");
				String str4 = new String("abc");
				System.out.println(str3==str4);  //false
				System.out.println(str3.equals(str4));   //true
		
		
		
		
	}

}
