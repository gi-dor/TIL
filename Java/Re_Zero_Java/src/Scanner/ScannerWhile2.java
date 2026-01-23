package Scanner;

import java.util.Scanner;

public class ScannerWhile2 {
    static void main(String[] args) {

        // 첫번째 숫자와 두번째 숫자를 더해 출력하는 프로그램
        // 첫번쨰 숫자와 두번째 숫자 모두 0을 입력하면 프로그램 종료
        // 프로그램은 반복해서 실행된다

        Scanner scanner = new Scanner(System.in);
        System.out.println("첫번째 숫자와 두번째 숫자의 합을 구한다 , 두 숫자 모두 0을 입력하면 종료된다");

        while(true) {

            System.out.print("첫번째 숫자 입력하세요 :: ");
            int num1 = scanner.nextInt();
            System.out.print("두번째 숫자를 입력하세요 :: ");
            int num2 = scanner.nextInt();


            if (num1 == 0 && num2 == 0 ){
                System.out.print("입력한 숫자 모두 0을 입력했습니다  프로그램 종료됩니다 ");
                break;
            }

            int sum = 0;
            sum =  num1 + num2;
            System.out.println("입력한 두 수의 합계 : " + sum);
        }
    }
}
