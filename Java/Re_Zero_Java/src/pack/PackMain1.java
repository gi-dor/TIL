package pack;

public class PackMain1 {
    public static void main(String[] args) {
        Data data = new Data();

        // 다른 패키지명.클래스
        pack.a.User user = new pack.a.User();
    }
}
