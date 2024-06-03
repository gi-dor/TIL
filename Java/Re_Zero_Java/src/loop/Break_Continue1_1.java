package loop;

public class Break_Continue1_1 {
    public static void main(String[] args) {

        /*
        while (조건식) {
            코드1;
            break;  // 즉시종료
            코드2;
        }

        while(조건식) {
        코드1;
        continue;   // 다시 while 문에 조건식으로 돌아간다  코드2를 실행 할 수가 없다
        코드2;
         */

        // 숫자 1부터 시작해서 누적으로 더하다가 합계가 10보다 처음으로 큰 값은 ?
        //  1 + 2 + 3 +....

        int sum = 0;
        int i = 1;

        while (true) {
            sum = sum + i;
            if (sum > 10) {
                System.out.println("합이 10보다 크다면 종료 : " + "i = " + i + " sum = " + sum);
                break;
            }
            i++;
        }
    }
}
