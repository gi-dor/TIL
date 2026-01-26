package Method;

public class OverRef4 {
    public static void main(String[] args) {
        // 잔고
        int balance = 100;
        // 1000 입금
        balance = depositCalculate(balance,1000);
        // 2000 출금
        balance = withdrawCalculate(balance,2000);
    }

    public static int depositCalculate(int balance , int amount) {

        balance += amount;
        System.out.println(amount + "원을 입금했습니다 , 현재 잔액 : "+balance + "원");
        return balance;
    }

    public static int withdrawCalculate(int balance , int amount) {
        // 잔고 >= 출금액
        if(balance >= amount) {
            balance -= amount;
            System.out.println(amount + "원을 출금했습니다 , 현재 잔액 : "+balance + "원");
        } else {
            System.out.println( amount+" 원 출금 시도중 , .. 잔액부족");
        }
        return balance;
    }

}
