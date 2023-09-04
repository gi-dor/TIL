package weekend;

public class day230408_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 기초 예제 9 - 10 문자열과 기본형간의 변환
		int iVal = 100;
		String strVal = String.valueOf(iVal);
		
		double dVal = 200.0;
		String strVal2 = dVal + "";
		
		double sum = Integer.parseInt("+"+strVal)+Double.parseDouble(strVal2);
		double sum2 = Integer.valueOf(strVal)+Double.valueOf(strVal2);
		System.out.println(String.join("",strVal,"+",strVal2,"=")+ sum);
		System.out.println(strVal+"+"+strVal2+"="+sum2);
		
		
	}

}
