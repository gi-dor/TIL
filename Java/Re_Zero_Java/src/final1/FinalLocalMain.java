package final1;

public class FinalLocalMain {
    // final 지역변수
    static void main(String[] args) {
        final int data1;
        data1 = 10; // 최초 단 한번만 할당이 가능하다
//        data1 = 20; // 컴파일 오류

        final int data2 = 10;   // 선언과 동시에 초기값 설정
//        data2 = 20;     // 컴파일 오류

//        method(19);

    }


//    static void method(final int param) {
//        param = 20; // 컴파일 오류 , 메서드 호출하면서 지정한 값으로 할당됨
//    }
}
