package Method;

public class OverRef3 {
    public static void main(String[] args) {
        // 입금 deposit
        // 출금 withdraw
        // 잔액 balance
        int balance = 10000;

        // 입금 1000
        int depositAmount = 1000;
        balance = depositCalculate(balance,depositAmount);

//        balance += depositAmount;
//        System.out.println(depositAmount + "원을 입금했습니다 , 현재 잔액 : "+balance + "원");

        // 출금 2000
        int withdrawAmount = 2000;
        if(balance >= withdrawAmount) {

            balance = withdrawCalculate(balance,withdrawAmount);

            // 잔액이 출금 금액보다 크다면 작동
//            balance -= withdrawAmount;
//            System.out.println(withdrawAmount + "원을 출금했습니다 , 현재 잔액 : "+balance + "원");

        } else {
            System.out.println( withdrawAmount+" 원 출금 시도 , 잔액부족");
        }
        System.out.println("최종 잔액 : "+ balance + " 원");
    }


    /**
     *
     * @param balance 잔고
     * @param amount  입금액
     * @return  잔고 + 입금액 depositAmount
     */
    public static int depositCalculate(int balance , int amount) {
        balance += amount;
        System.out.println(amount + "원을 입금했습니다 , 현재 잔액 : "+balance + "원");
        return balance;
    }

    /**
     *
     * @param balance 잔고
     * @param amount  출금액 withdrawAmount
     * @return
     */
    public static int withdrawCalculate(int balance , int amount) {
        if(balance >= amount) {
            balance -= amount;
            System.out.println(amount + "원을 출금했습니다 , 현재 잔액 : "+balance + "원");
        }
        return balance;
    }
}
