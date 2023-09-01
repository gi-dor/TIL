package weekend;

import java.util.StringJoiner;

public class day230408_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 기초 예제 9 - 9 join() 과 StringJoiner
		String animals = "dog,cat,bear";
		String [] arr = animals.split(",");
		
		System.out.println(String.join("-", arr));
		StringJoiner sj = new StringJoiner("/","[","]");
		
		for ( String s : arr)
			sj.add(s);
		
		System.out.println(sj.toString());
	}

}
