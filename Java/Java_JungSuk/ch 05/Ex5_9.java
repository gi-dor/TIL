import java.util.Arrays;

public class Ex5_9 {

	public static void main(String[] args) {
	
		// index ���� : 0 ~ 2 
	String [] strArr = { "����", "����","��"};
	System.out.println(Arrays.toString(strArr));

		for (int i = 0 ; i < 10; i++) {
			
		int tmp = (int)(Math.random()*3);
		System.out.println(strArr[tmp]);
		}
	// strArr[0] ����  , strArr[1]  ���� , strArr[3] �� 
	
	}
	
}
