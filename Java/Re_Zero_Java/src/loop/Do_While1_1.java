package loop;

public class Do_While1_1 {
    public static void main(String[] args) {
        // 조건에 만족하지 않더라도 단 1번은 진행된다 do-while
        int i = 10;
        while (i < 3) {
            System.out.println("현재숫자 : " + i);
            i++;
        }

        do {
            System.out.println("현재 숫자는 : " + i);
            i++;
        } while (i < 3);

    }
}
