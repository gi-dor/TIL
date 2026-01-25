package Arr;

import java.util.Scanner;

public class ArrLoop1 {
    static void main() {
        // 사용자로부터 학생 4명의 국어 수학 영어 점수를 입력받아 각학생의 총점과 평균을 계산

        // 입력
        Scanner sc = new Scanner(System.in);
        // 학생 4명 과목3개
        int[][] score = new int[4][3];
        String[] subject = {"국어","영어","수학"};

        // n 번 학생 점수 입력
        for (int i = 0; i < 4; i++) {
            System.out.println((i+1) + "번 학생 성적을 입력하세요 : ");
            // 과목 3개
            for(int j = 0; j < 3; j++){
                System.out.print(subject[j] + " 점수 : ");
                // score[학생번호][과목점수]
                score[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < 4; i++) {
            int total = 0;
            // 총점구하기
            for(int j = 0; j < 3; j++){
                total += score[i][j];
            }
            double average = total / 3.0;
            System.out.println((i+1) + " 번 학생의 총점 : " + total + ", 평균 : " + average );
        }



    }
}
