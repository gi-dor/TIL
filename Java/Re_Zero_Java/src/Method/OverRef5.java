package Method;

import java.util.Scanner;

public class OverRef5 {
    public static void main(String[] args) {

        // 1.사용자로부터 계속 입력을 받는다
        // 2.입금 , 출금 , 잔고확인을  반복 수행하는 프로그램을 작성
        // 3.메뉴를 표시하여 어떤 동작을 수행할지 선택
        // 4.출금시 잔액이 부족하다면 x원을 출금하려 했으나 잔액이 부족합니다 라고 출력

        // 사용자 입력 scanner 객체
        Scanner scanner = new Scanner(System.in);

        // 초기 잔고 0원이라고 가정
        int balance = 0;


        // 종료 전까지 무한반복 해야하니 while - true
        while (true) {
            System.out.println("---------------------------------------------");
            System.out.println("1. 입금  |  2. 출금  |  3. 잔액확인  |  4. 종료");
            System.out.println("---------------------------------------------");
            System.out.print("선택 : ");

            // 1. 사용자로부터 입력받기
            int choice = scanner.nextInt();

            if(choice == 1 ){
                // 2. 입금
                // 입금 메서드
                System.out.print("입금액 입력 : ");
                int amount = scanner.nextInt();
                balance = depositCalculate(balance, amount);

            } else if(choice == 2) {
                // 2. 출금
                // 출금 메서드
                System.out.print("출금 금액 입력 : ");
                int amount = scanner.nextInt();
                balance = withdrawCalculate(balance,amount);
            } else if(choice == 3) {
                // 2. 잔고 확인
                System.out.println("현재 잔액 : " + balance);
            } else if (choice == 4 ) {
                //종료
                System.out.println("프로그램 종료 하겠습니다");
                break;
            } else {
                System.out.println("잘못 입력 하셨습니다");
            }

        }

    }


    /**
     * 입금 하는 메서드
     * @param balance 현재 잔액
     * @param amount  입금할 금액
     * @return  입금 이후 최종 잔고
     */
    public static int depositCalculate(int balance , int amount) {
        balance += amount;
        System.out.println(amount + "원 입금 되었습니다");
        return balance;
    }

    /**
     * 출금 기능 메서드
     * @param balance 현재 잔액
     * @param amount  출금하려는 금액
     * @return 출금 이후 최종 잔액 , 잔액부족시 잔고 그대로
     */
    public static int withdrawCalculate(int balance , int amount) {
        if(balance >= amount) {
            balance -= amount;
            System.out.println(amount +"원 출금 되었습니다");
        } else {
            System.out.println("잔액 부족");
        }
        return balance;
    }
}
