package access.a;

public class PublicClassInnerMain {
    static void main(String[] args) {

        // 같은 패키지인 a 안에 클래스들이 존재하기에 가능하다
        PublicClass publicClass = new PublicClass();
        DefaultClass1 defaultClass1 = new DefaultClass1();
        DefaultClass2 defaultClass2 = new DefaultClass2();
    }
}
