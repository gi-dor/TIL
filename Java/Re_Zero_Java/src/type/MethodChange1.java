package type;

public class MethodChange1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("메서드 호출전 : a : " + a);
        changePromitive(a);
        System.out.println("메서드 호출후 : a : " + a);
    }

    public static void changePromitive(int x) {
        x = 20;
    }

}
