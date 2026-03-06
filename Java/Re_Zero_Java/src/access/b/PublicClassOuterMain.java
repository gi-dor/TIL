package access.b;

import access.a.PublicClass;

public class PublicClassOuterMain {
    static void main(String[] args) {

        PublicClass publicClass = new PublicClass();

        // 다른 패키지 - 접근불가 Cannot resolve symbol 'DefaultClass1'
//        DefaultClass1 defaultClass1 = new DefaultClass1();
//        DefaultClass2 defaultClass2 = new DefaultClass2();
    }
}
