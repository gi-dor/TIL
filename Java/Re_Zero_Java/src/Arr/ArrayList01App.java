package Arr;

import java.util.ArrayList;
import oop1.constructor.Member2;

public class ArrayList01App {

    public static void main(String[] args) {


        ArrayList al = new ArrayList();

        al.add("기선");
        al.add(30);
        al.add(1994);
        al.add(183);

        // 객체 길이 출력
        System.out.println("객체 길이 출력 : "+al.size());

        for(int i = 0; i<al.size();i++){
            System.out.println(al.get(i));
        }




    }

}
