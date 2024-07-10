package loop.ex;

public class Gugu {
    public static void main(String[] args) {
        
        // 중첩for문 구구단 찍기
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.println(i + " * " + j + " = " + i * j);
                if (j == 9) {
                    System.out.println();
                }
            }
        }
    }
}
