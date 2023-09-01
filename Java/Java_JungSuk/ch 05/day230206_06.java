import java.util.Arrays;
public class day230206_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String[] str1 = { "가위","바위","보"};
		System.out.println(Arrays.toString(str1));
		
		
		for ( int i =0; i<10; i++) {
			int tmp =(int)(Math.random()*3);
		System.out.println(str1[tmp]);
		}
		
		
		
		
		String[] name = {"Han","Kim","Park"};
		
		for ( int i =0; i <name.length; i++) {
			System.out.println("name["+i+"]:"+name[i]);
		}
		
		String tmp = name[2]; // 배열name의 세번째 요소를 tmp에 저장
		System.out.println("tmp: "+tmp); // tmp값 null에서 park로 저장
		
		name[0] = "noe"; // 배열 name의 첫번째 요소를 noe로 변경
						// 기존 Han 사라짐
		for ( int i = 0 ; i< name.length; i++) {
			System.out.println(name[i]);
		}
		
	}

}
