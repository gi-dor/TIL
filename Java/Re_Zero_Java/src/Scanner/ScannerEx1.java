package Scanner;

import java.util.Scanner;

public class ScannerEx1 {
    static void main(String[] args) {

        // scanner 변수 선언
        // System.in을 사용해 사용자의 입력을 받게한다
        Scanner scanner = new Scanner(System.in);
        System.out.print("문자열 입력 :: ");

        // 입력을 String으로 가져옴
        String str = scanner.nextLine();

        System.out.println("사용자가 입력한 문자열 ::: " + str);

        System.out.print("정수 입력 :: ");
        int intValue = scanner.nextInt();
        System.out.println("입력한정수 :: " + intValue);

        System.out.print("실수 입력 ::: ");
        double doubleValue = scanner.nextDouble();
        System.out.println("입력한 실수 :: "+ doubleValue);

        /*
        InputMismatchException
        정수 입력 :: d
        Exception in thread "main" java.util.InputMismatchException
            at java.base/java.util.Scanner.throwFor(Scanner.java:977)
            at java.base/java.util.Scanner.next(Scanner.java:1632)
            at java.base/java.util.Scanner.nextInt(Scanner.java:2297)
            at java.base/java.util.Scanner.nextInt(Scanner.java:2251)
            at Scanner.ScannerEx1.main(ScannerEx1.java:18)
         */
    }
}