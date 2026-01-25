package Arr;

import java.util.Scanner;

public class ForLoop5 {
    static void main() {
        //입력한 숫자중 가장큰수 , 가장 작은수 구하기
        System.out.println("입력할 숫자의 갯수를 입력하세요");
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        int[] number = new int[count];

        System.out.println
                ("숫자를 입력해주세요 :: ");
        for(int i = 0; i < count; i++) {
            number[i] = sc.nextInt();
        }

        int min = number[0];
        int max = number[0];

        for(int i = 0; i < count; i++) {
            if(number[i] < min) {
                min = number[i];
                System.out.println("min ::: "+min);
            }
            if(number[i] > max) {
                max = number[i];
                System.out.println("max ::: "+max);
            }
        }
        System.out.println("가장 큰 수 :: "+max);
        System.out.println("가장 작은 수 :: "+min);

    }
}
