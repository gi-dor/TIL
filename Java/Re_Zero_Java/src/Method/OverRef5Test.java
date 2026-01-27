package Method;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OverRef5Test {

    @Test
    void depositTest() {
        // given (주어진 상황)
        int balance = 1000;
        int amount = 500;

        // when (메서드를 실행했을 때)
        int result = OverRef5.depositCalculate(balance, amount);

        // then (결과가 ~이어야 한다)
        Assertions.assertEquals(1500, result); // 결과가 1500일 것이라고 단언(assert)
    }

    @Test
    void withdraw_SuccessTest() {
        // given
        int balance = 1000;
        int amount = 500;

        // when
        int result = OverRef5.withdrawCalculate(balance, amount);

        // then
        Assertions.assertEquals(500, result); // 성공적으로 출금 후 잔액이 500원이어야 함
    }

    @Test
    void withdraw_FailTest() {
        // given
        int balance = 1000;
        int amount = 1500; // 잔액보다 큰 금액 출금 시도

        // when
        int result = OverRef5.withdrawCalculate(balance, amount);

        // then
        Assertions.assertEquals(1000, result); // 출금에 실패했으므로 기존 잔액 1000원이 그대로여야 함
    }
}
