package loop.ex;

public class WhileEx {

    public static void main(String[] args) {

        int num = 2;
        int cnt = 1;
        while (cnt <= 10) {
            System.out.println("짝수 출력 : " + num);
            num += 2;
            cnt++;
        }

        System.out.println();
        int num2 = 2;
        for (int cnt2 = 1; cnt2 <= 10; cnt2++) {
            System.out.println("for문 짝수 출력 : " + num2);
//            num2 += 2;
            num2 = num2 + 2;
        }
    }
}
