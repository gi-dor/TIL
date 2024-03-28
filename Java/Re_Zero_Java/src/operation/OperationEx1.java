package operation;

public class OperationEx1 {
    public static void main(String[] args) {

        // 1. num1 , num2  ,num3 int 변수 선언 , 각각 10 , 20 , 30 초기화
        // 2. 세변수의 합을 계산 , sum 이라는 int 변수에 저장
        // 3. 세변수의 평균을 계산 , average 라는 이름의 int 변수에 저장 , 소수점 이하의 결과는 버림
        // 4. sum 과 average 변수의 값을 출력

        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        int sum = num1 + num2 + num3;
        int average = sum / 3;

        System.out.println("sum = " + sum);
        System.out.println("average = " + average);

        //  정수 / 정수 = 정수 --> 소수점 자릿수는 버림당한다.
    }
}
