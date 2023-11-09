package oop1.overloding;


public class Overloading {
    public static void main(String[] args) {

        // 안되는 경우
        // 1. 메서드의 이름이 다를경우 -> 메서드 이름은 sum으로
        // 2. 매개변수의 개수 또는 타입이 같을경우 - > 매개변수 갯수가 다르거나 , 같다면 타입이 달라야함

        Math m = new Math();

        int result1 = m.sum(3,3);
        System.out.println("정수 + 정수 " + result1);
        System.out.println("--------------------------------");

        int result2 = m.sum( 2,7,10);
        System.out.println("정수 + 정수 + 정수 " + result2);
        System.out.println("--------------------------------");

        double result3 = m.sum(3.14, 2.17);
        System.out.println("실수 + 실수 " + result3);
        System.out.println("--------------------------------");

        double result4 = m.sum(7,72.7272);
        System.out.println("정수 + 실수 " + result4);
        System.out.println("--------------------------------");

        double result5 = m.sum(2.75 , 7);
        System.out.println("실수 + 정수 " + result5);



    }
}

    class Math{
        /**
         *
         * @param a 첫번째 매개변수 정수
         * @param b 두번쨰 매개변수 정수
         * @return a 와 b 두개의 정수 합을 리턴
         */
    int sum (int x , int y) {
        System.out.println("정수 + 정수 의 덧셈을 실행하는 코드");
        int result = x + y;
        return result;
        }

        /**
         *  메서드 중복정의
         * @param x 첫번째 매개변수 인 정수
         * @param y 두번째 매개변수 인 정수
         * @param z 세번쨰 매개변수 인 정수
         * @return 3개의 정수 덧셈 결과값
         */
    int sum (int x, int y , int z) {
        System.out.println("정수 + 정수 + 정수 의 덧셈을 실행 하는 코드");
        int result =  x + y + z;
        return result;
     }

     double sum (double x , double y) {
         System.out.println("실수 + 실수 의 덧셈");
            double result = x + y;
            return result;
     }

     double sum(int x, double y) {
         System.out.println("정수 + 실수 의 덧셈");
         System.out.println("형변환으로 인해 크기가 더큰 double로 자동 형변환");
        double result = x + y;
        return result;
     }

     double sum (double x , int y) {
         System.out.println("실수 + 정수의 합");
         double result = x +y;
         return result;
     }





    }
