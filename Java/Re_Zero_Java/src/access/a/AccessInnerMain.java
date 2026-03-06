package access.a;

public class AccessInnerMain {
    static void main(String[] args) {
        AccessData data = new AccessData();

        // public 호출
        data.publicField = 10;
        data.publicMethod();


        // 같은 패키지 default
        data.defaultField = 2;
        data.defaultMethod();

        // private 호출불가
//        data.privateField = 33;
//        data.privateMethod();

        data.innerAccess();
    }
}
