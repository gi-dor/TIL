package oop1.constructor;

public class Member2 {

    String name;
    int age;

    // 생성자
    Member2(String n , int a){
        name = n;
        age = a;
    }

    // 기본 생성자
    Member2 () {}

    // 생성자의 오버로딩

    // 이름만
    Member2 (String n ) {
        name = n;
    }
    // 나이만
    Member2 (int a) {
        age = a;
    }

}
