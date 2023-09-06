package day0410;
import java.util.*;
import java.io.*;	// 입출력 패키지

public class day230410_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 기초편 예제 15-1 
		// InputStream , OutputStream
		
		byte[] inSrc = { 0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc = null;
		
		ByteArrayInputStream input = null;
		ByteArrayOutputStream output = null;
		// 바이트 기반 입출력 스트림 - 메모리 (byte배열)

		input = new ByteArrayInputStream(inSrc);
		output = new ByteArrayOutputStream();
		
		int data = 0;
		
		while( (data = input.read() )!=-1 )
			output.write(data);	 // void write(int b)
		
		outSrc = output.toByteArray();
		// 스트림의 내용을 byte 배열로 반환
		System.out.println("Input Source = "+ Arrays.toString(inSrc));
		System.out.println("Output Source = "+ Arrays.toString(outSrc));
		
	}
	

}
