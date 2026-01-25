package Arr;

import java.util.Scanner;

public class ForLoop2 {
    static void main() {

        Scanner scanner = new Scanner(System.in);
        int[] num = new int[5];

        System.out.println("5개의 정수를 입력 :");
        for(int i=0;i<5;i++) {
            num[i] = scanner.nextInt();
            System.out.println("num[i] : "+num[i]);
        }
        System.out.println(num.toString());

        System.out.print("출력 : ");
        for(int i = 0; i < num.length; i++) {
            System.out.print(num[i]);
            if(i < num.length - 1) {
               System.out.print(",");
            }
        }
    }
}
