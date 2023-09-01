package weekend;

public class day230409_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 기초편 예제 9-11
		StringBuffer sb = new StringBuffer("01");
		StringBuffer sb2 = sb.append(23);	//뒤에 추가, 0123
		sb.append('4').append(56);
		// 01234
		// 0123456
		
		StringBuffer sb3 = sb.append(78); // 012345678
		sb3.append(9.0); // 0123456789.0
		
		System.out.println("sb = "+sb);
		System.out.println("sb2 = "+sb2);
		System.out.println("sb3 = "+sb3);
		
		System.out.println("sb = "+sb.deleteCharAt(10));
		// 지정된 위치의 문장 제거
		// 예상 01234567890		. 삭제
		System.out.println("sb = "+sb.delete(3, 6));
		// 시작위치 ~ 끝사이 부분 제거
		// 3 <= x <6 제거 예상 01267890 
		System.out.println("sb = "+sb.insert(3, "abc"));
		// 두번째 매개변수를 문자열로 변환해서 지정위치에 추가
		// 예상 012abc34567890
		System.out.println("sb = "+sb.replace(6, sb.length(), "END"));
		//지정된 범위 (start ~ end)의 문자들을 지우고 주어진 문자열로 바꿈
		// 6 <= x < 11,   length() = 11
	    	// end 위치 문자는 범위에 포함안됨 
		
		// 012abcEND
		
		System.out.println("capacity = "+sb.capacity());
		System.out.println("length = "+ sb.length());
	}

}
