package weekend;
import java.util.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class day230409_02_Math_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 기초편 예제 9 - 13 Math메서드
		
		double v = 90.7552;
		System.out.println("round("+v+") = "+round(v));  // 반올림 , Math생략했음 
		
		v *= 100;
		out.println("round("+v+") = "+round(v));	// 반올림 , System 생략함
		
		System.out.println("round ("+v+") / 100 = "+ round(v)/100);
		System.out.println("round ("+v+") / 100.0 = "+ round(v)/100.0);
		
		System.out.println();
		System.out.printf("ceil(%3.1f) = %3.1f%n", 1.1 , ceil(1.1));
		System.out.printf("fllo(%3.1f) = %3.1f%n", 1.5 , floor(1.5));
		System.out.printf("round(%3.1f) = %d%n", 1.1 , round(1.1));
		System.out.printf("round(%3.1f) = %d%n", 1.5 , round(1.5));
		
		System.out.printf("rint(%3.1f) = %f%n", 1.5 , rint(1.5));
		System.out.printf("rint(%3.1f) = %f%n", -1.5 , rint(-1.5));
		
		System.out.printf("ceil(%3.1f) = %f%n", -1.5 , ceil(-1.5));
		System.out.printf("floor(%3.1f) = %f%n", -1.5 ,floor(-1.5));
		
	}

}
