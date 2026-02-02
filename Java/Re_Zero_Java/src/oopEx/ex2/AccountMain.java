package oopEx.ex2;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account();
        // 계좌에 10000원 입금
        account.deposit(10000);
        // 계좌에서 9000원 출금
        account.widthdraw(9000);
        // 계좌에서 2000원 출금 시도 - > 잔고부족 메시지
        account.widthdraw(2000);
    }
}
