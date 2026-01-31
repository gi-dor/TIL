package type;

public class NullMain3 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        System.out.println("bigData.count : " + bigData.count ); // 숫자 멤버변수는 0 으로 초기화
        System.out.println("bigData.data : " + bigData.data); // 참조형이니 null로 초기화

        // nullException                            0x100 + data.value
        System.out.println("bigData.data.value : " +bigData.data.value);
    }
}
