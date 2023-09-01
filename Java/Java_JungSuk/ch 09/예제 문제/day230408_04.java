package weekend;

public class day230408_04 {

	public static void main(String[] args) {

		
		// TODO Auto-generated method stub
		
		// 예제 9- 3 hashCode()
		String str1 = new String("abc");
		String str2 = new String("abc");

		System.out.println(str1.equals(str2));	// true
		System.out.println(str1.hashCode() );	// 96354
		System.out.println(str2.hashCode() );	//96354
		System.out.println(System.identityHashCode(str1));	// 3526198
		System.out.println(System.identityHashCode(str2));	// 7699183
	}

}
