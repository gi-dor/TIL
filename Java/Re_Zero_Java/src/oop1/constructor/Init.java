package oop1.constructor;

public class Init {
    // 생성자
    Init() {
        System.out.println("생성자");
    }

    // 클래스 초기화 블럭
    // 클래스가 메모리에 저장될 때 한번만 실행
    static {
        System.out.println("클래스 초기화 블럭");
    }

    // 인스턴스 처기화 블럭
    // 생성자와 용도 차이 X , 자주 사용 X
    {
        System.out.println("인스턴스 초기화 블럭");
    }

    public static void main(String[] args) {

        System.out.println("main 메서드 시작");
        System.out.println("Init 객체 생성");
        Init it1 = new Init();
        Init it2 = new Init();

    }
}
