package Arr;

import java.util.Scanner;

public class FopLoop4 {
    static void main() {
        // 5개의 정수를 입력받아 정수의 합계와 평균 구하기
        Scanner scanner = new Scanner(System.in);
        int[] number = new int[5];
        int sum = 0;
        double average = 0;

        System.out.println("5개의 정수를 입력 :: ");
        for(int i = 0; i < 5; i++) {
            number[i] = scanner.nextInt();
            sum += number[i];
        }

        average = (double)sum / 5;
        System.out.println("합계 : " + sum +" , 평균 : " + average);


    }
}
