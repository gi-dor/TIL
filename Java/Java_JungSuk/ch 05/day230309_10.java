import java.util.Arrays;

public class day230309_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			// String 배열의 선언과 생성
			// String [] name = new String[3];  3개의 문자열을 담을수 있는 배열 생성
			// 	초기화
			// name[0] = "Kim";
			// name[1] = "Han";
			// name[2] = "Yi";
		
			// 배열 선언과 초기화 한번에
			// String [] name = { "Kim", "Han" , "Yi };
			// str[0] = 가위
			// str[1] = 바위
			// str[2] = 보
			String [] str = {"가위","바위","보"};
			System.out.println(Arrays.toString(str));
			
			for (int i = 0 ; i < 10; i++) {
				int tmp = (int)(Math.random()*3);
			System.out.println(str[tmp]);
			}
			
			System.out.println();
			System.out.println("예제 5 -12");
			String [] name = { "Kim","Han", "Park"};
			
			for ( int i = 0; i<name.length; i++) {
				System.out.println("name["+i+"] : "+name[i]);
			}
			
			String tmp = name [2];	// tmp = Park
			System.out.println("tmp : "+tmp);
			System.out.println();
			
			name[0] = "WW";
			for( String str1 : name) {
				System.out.println(str1);
			}
			System.out.println();
		
			System.out.println("매개변수의 개수 :"+args.length);
		for( int i =0; i< args.length; i++) {
			System.out.println("args [" +i+"] = \""+args[i]+"\"");
		}
			
	}

}
