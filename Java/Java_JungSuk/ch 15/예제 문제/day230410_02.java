package day0410;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class day230410_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 기초편 예제 15-2
		
		byte[] inSrc =  { 0,1,2,3,4,5,6,7,8,9};
		byte [] outSrc = null;
		byte[] temp = new byte[10];
		
		ByteArrayInputStream input = null;
		ByteArrayOutputStream output = null;
		
		input = new ByteArrayInputStream(inSrc);
		output = new ByteArrayOutputStream();
		
		input.read(temp,0,temp.length);	// 읽어온 데이터를 배열 temp에 담는다
		// 최대 temp.length 개의 byte를 읽어서 배열temp에 지정된위치 0 부터 저장
		// 10개byte 데이터를 배열 temp에 temp[0] 부터 저장
		
		output.write(temp,5,5);	// temp[5]부터 5개의 데이터를 write 한다
		// 배열temp에 저장된 내용중 5 번째 부터 5개 만큼 읽어서 출력소스에 씀
		
		outSrc = output.toByteArray();
		
		System.out.println("Input Source : "+Arrays.toString(inSrc));
		System.out.println("temp		: "+Arrays.toString(temp));
		System.out.println("Output Source : "+ Arrays.toString(outSrc));
	}

}
