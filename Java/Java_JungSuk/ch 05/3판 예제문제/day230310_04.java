public class day230310_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			// String 클래스의 주요 메서드 
		
			// charAt(int index); 문자열에서 해당위치에 있는 문자를 반환한다
			
			// int length(); 문자열의 길이를 반환한다
		
			// String subString(int from , int to )
			//  해당범위 from ~ to 까지에 있는 문자열을 반환함
			// to 는 반환안함 
			// String substring(1,4);  1,2,3 까지만 반환
			
			// boolean equals(); 문자열의 내용이  같은지 확인 true , false
			
			// char[] toCharArray(); 문자열을 문자배열 (char[])로 변환해서 반환
			// char[] chArr = str.toCharArray();
		
			System.out.println(" 예제 5 - 14");
		
			// 			 0123456
			String str ="ABCDEFG";
			char ch = str.charAt(5);
			System.out.println("str.charAt(5) = "+ch);
			
			String str2 = str.substring(0,5); // from 0 to 
			String str3 = str.substring(2); // 2 ~ 끝까지
			System.out.println("str2 = "+str2);
			System.out.println("str3 = "+str3);
			
			System.out.println("str.equals(str3) = "+str2.equals(str3));
			
			for( int i = 0; i< str.length();i++) {
				 char c = str.charAt(i);  // str의 i번째 문자를 c에 저장
				  System.out.println("str.charAt("+i+"):"+c);
			}
			
			// String을 char[]로 반환하기
			char[] chArr = str.toCharArray();
			
			System.out.println(chArr);
			System.out.println();
			
			System.out.println(" 예제 5 - 15 ");
			
			String st = "SOSHELP";
			String[] name = {".-", "-...", "-.-.", "-..", ".",
							"..-.", "--.", "....", "..", ".---" ,
							"-.-" , ".-.." , "--" , "-.", "---" ,
							".--.", "--.-" , ".-." , "...", "-",
							"..-", "...-", ".--", "-..-", "-.--",
							"--.." };
			String result = "";
			
			for ( int i = 0; i < st.length();i++) {	// length()를 통해 String문재의 갯수 알수있음
			result = result + name[st.charAt(i)-'A'];	// charAt(int i )로 String의 i번째 문자를 반환
			}
			
			
			System.out.println("st : "+st);
			System.out.println("name : "+result);
			
	}	

}
