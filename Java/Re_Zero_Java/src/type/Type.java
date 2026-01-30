package type;

import classSt.Student;

public class Type {
    // 변수 데이터 타입
    // 1. 기본형 Primitive Type
    // int , long , double , boolean  데이터 타입을 기본형
    // 10 , 20 같은 실제 사용하는 값을 변수에 담는다
    int a = 10;
    double d = 3.14;

    // 2. 참조형 Reference Type
    // Student student , Child child , Parent p , in[] students 같은 데이터에 접근하기위한 참조(주소)를 저장하는 타입
    // 실제 사용하는 값을 변수에 담는게 아니라 , 실제 객체의 위치(참조 , 주소) 를 저장한다
    // 참조형에는 격체와 배열이 있다

    Student st = new Student();
    Student st2 = new Student();
    // ****  st + st2 오류

    // 객체는 . (dot) 을 통해 메모리 상에 생성된 객체를 찾아가야 사용할 수 있다
    // 배열은 [] 를 통해 메모리 상에서 생성된 배열을 찾아가야 사용할 수 있다

    // *** String **** 자바에서 String은 특별하다 , 사실 String은 클래스 이고 따라서 참조형이다
    // 기본형 처럼 문자값을 바로 대입할수 있다
    // 문자는 자주 다루기에 자바에서 특별하게 편의기능을 제공한다
}
