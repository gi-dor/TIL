package casting;

public class Casting3 {
    public static void main(String[] args) {

        long maxIngVal = 2147483647;    // int 의 최고값
        long maxIngOver = 2147483648L;  // int 최고값 +1 (초과되었음)
        int intVal = 0;

        intVal = (int) maxIngVal; // 형변환
        System.out.println(intVal);

        intVal = (int) 2147483648L; // 형변환
        System.out.println("maxIntOver catsing = " + intVal);

        // int로 표현가능한 숫자인 2147483647 보다 1 큰 숫자를 입력해 int 범위를 넘어가기에 L 을 사용한 long형을 사용했다
        /*
        maxIntOver = 2147483647L; int 의 최고값 + 1
        intVal = (int)maxIntOver // 변수 값 읽기
        intVal = (int)2147483647L // 형변환 시도
        intVal = -2147483648;

        int 형으로 2147483648L 을 표현할 수 있는 방법이 없다 , 이 현상을 오버플로우 라고한다
         */
    }
}
