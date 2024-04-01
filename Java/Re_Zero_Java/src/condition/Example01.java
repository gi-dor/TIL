package condition;

public class Example01 {
    public static void main(String[] args) {
        /*
        학생의 점수를 기반으로 학점을 출력하는 자바 프로그램을 만들어보자
        90점 이상이라면 A
        80 점 이상 90점 미만 이라면 B
        70점 이상 80점 미만 C
        60점이상 70점 미만 D
        60점 미만 F

        점수는 변수 int score 로 지정하고 해당 변수를 기반으로 학점을 출력하자
         */

        int score = 81;
        if (score >= 90 && score <= 100) {
            System.out.println("A 학점입니다");
        } else if (score >= 80) {
            System.out.println("B 학점입니다");
        } else if (score >= 70) {
            System.out.println("C 학점입니다");
        } else if (score >= 60) {
            System.out.println("D 학점 입니다");
        } else {
            System.out.println("F 학점 입니다");
        }
        System.out.println("===========================================");

        /*
        거리에 따른 운송수단 선택하기
        거리가 1KM 이하 "도보"
        거리가 10KM 이하 "자전거"
        거리가 100KM 이하  "자동차"
        거리가 1000KM 초과 "비행기"
         */

        int distance = 5;

        if (distance <= 1) {
            System.out.println(distance + "KM 입니다");
            System.out.println("  1KM 이하 도보를 이용하세요");
        } else if (distance <= 10) {
            System.out.println(distance + "KM 입니다");
            System.out.println(" 10KM 이하 , 자전거 를 이용하세요");
        } else if (distance <= 100) {
            System.out.println(distance + "KM 입니다");
            System.out.println(" 100KM 이하 , 자동차 를 이용하세요");
        } else {
            System.out.println(distance + "KM 입니다");
            System.out.println(" 비행기 를 이용하세요");
        }

        System.out.println();
        System.out.println("=============================================");
        /*
        환율계산하기
        1달러당 1300원이라고 가정하자
        1. 0달러 미만 " 잘못된 금액입니다 "
        2. 달러가 0 일 때  " 환전할 금액이 없습니다 "
        3. 달러가 0 초과일 때 " 환전금액은 (계산완료) 원 입니다
         */
        int dollar = 4;

        if (dollar < 0) {
            System.out.println("달러가 0 달러 미만 입니다");
            System.out.println("잘못된 금액입니다");
        } else if (dollar == 0) {
            System.out.println(dollar + " 달러 입니다");
            System.out.println("환전할 금액이 없습니다");
        } else {
            int won = dollar * 1350;
            System.out.println(dollar + "달러 입니다");
            System.out.println("환전할 금액은 " + won + "원 입니다");
        }

    }
}
