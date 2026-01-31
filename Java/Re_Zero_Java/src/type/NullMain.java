package type;

public class NullMain {
    public static void main(String[] args) {
        Data data = null;
        System.out.println("1. data : " + data);
        data = new Data();
        System.out.println("2. data : " + data); // 참조값 주소가 보인다
        data = null;
        System.out.println("3. data : " + data);
    }
}
