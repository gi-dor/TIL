package operation;

public class OperationEx3 {
    public static void main(String[] args) {

        // 1. int형 변수 score 선언
        // 2. score 가 80점 이상이고 , 100점 이하점수는 true 출력 아니면 false 출력

        int score;
        score = 100;

        if (score <= 80) {
            System.out.println("false");
        } else if (score <= 100) {
            System.out.println("true");
        }

        boolean result = score >= 80 && score <= 100;
        System.out.println("result = " + result);
    }
}
