package Scanner;

import java.util.Scanner;

public class ScannerWhile1 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // break 전까지 무한 반복함
        while(true) {
            System.out.print("첫번째 문자열  입력 (exit : 종료) :: ");
            String str = scanner.nextLine();
            if(str.equals("exit")) {
                break;
            }
            System.out.println("입력한 문자열  :: " +str);
        }
        System.out.println("프로그램을 종료 합니다");
    }
}
