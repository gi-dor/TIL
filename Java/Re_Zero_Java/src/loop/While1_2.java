package loop;

public class While1_2 {
    public static void main(String[] args) {
        int count = 0;

        while (count < 99) {
            count = count + 1;
            System.out.println("현재 숫자 : " + count);
        }
        System.out.println("while 문 종료");
    }
}
