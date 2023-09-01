package day18.예제문제;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class day230405_03_HashSet {

	public static void main(String[] args) {
		
		// 기초편 p425 예제 11-9 HashSet 예제 1
					Object[] obj = { "1" , new Integer(1) , "2","2","3","3","3","4","4"};
					Set s = new HashSet();
					// "1" String , new Integer(1) 은 Int 이기 때문에 중복으로 치지 않음
					
					for ( int i = 0; i < obj.length; i++) {
						System.out.println(obj[i] +"="+ s.add(obj[i]));  // 0 1 2 3 4 5 6 7 8 9 
					}
					// obj 배열은 중복 값이있는 객체가 포함되어있음
					// 그래서 HashSet 사용해서 obj 객체의 중복을 제거한 객체 Set을 만들기 위해 사용하는거임 
					System.out.println(s);
					
					Iterator it = s.iterator();
					
					while(it.hasNext()) {
						System.out.println(it.next());
					}
				}

	}


