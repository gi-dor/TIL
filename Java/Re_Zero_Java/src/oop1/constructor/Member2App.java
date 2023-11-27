package oop1.constructor;

public class Member2App {

    public static void main(String[] args) {

//        Member2 m2 = new Member2();  매개변수가 없기 때문에 에러
        Member2 m2 = new Member2("나타" ,  30);

        System.out.println("이름 : "+ m2.name);
        System.out.println("나이 : "+m2.age);

        Member2 m3 = new Member2();
        Member2 m4 = new Member2("기선");
        Member2 m5 = new Member2(30);


    }
}
