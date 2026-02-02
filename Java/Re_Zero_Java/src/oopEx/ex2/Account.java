package oopEx.ex2;

public class Account {
    int balance; // 잔액

    // 입금 메서드
    void deposit(int amount) {
         balance += amount;
    }

    // 출금 메서드
    void widthdraw(int amount) {
        if(balance >= amount) {
             balance -= amount;
        } else {
            System.out.println("잔액이 부족합니다.");
            System.out.println("잔고 : " + balance);
        }
    }
}
