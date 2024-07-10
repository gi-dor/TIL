package loop.ex;

public class SumEx {
    public static void main(String[] args) {

        // 반복문을 사용해 1부터 max 까지의 합을 계산하고 출력
        // sum 이라는 변수를 사용해 누적 합을 표현 , i 라는 변수를 사용해 카운트

        int max = 100;

        int sum = 0;
        for (int i = 1; i <= max; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
