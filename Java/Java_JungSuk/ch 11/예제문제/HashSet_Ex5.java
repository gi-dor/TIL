package day18.예제문제;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet_Ex5 {
    public static void main(String[] args) {
        Object[] obj = {2,"2","2",new Integer(2),"3","3","1",1,new Integer(1),"4",4,new Integer(4)};
        Set set = new HashSet();
        
        for(int i = 0; i<obj.length; i++){
            System.out.println(obj[i] +"="+  set.add(obj[i]));
        }
        System.out.println("set = " + set);

        Iterator it = set.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
