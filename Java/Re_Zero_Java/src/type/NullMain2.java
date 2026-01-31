package type;

public class NullMain2 {
    public static void main(String[] args) {
        Data data = null;
        data.value = 10;    // NullPointerException 발생
        System.out.println("data : " + data.value);
        // null 값은 참조할 주소가 존재하지 않는다는 뜻
    }
}
