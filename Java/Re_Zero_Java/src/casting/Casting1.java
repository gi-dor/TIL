package casting;

public class Casting1 {
    public static void main(String[] args) {

        // int -> long -> float -> double

        int val = 10;
        long longVal;
        double doubleVal;

        longVal = val;
        System.out.println(longVal);

        doubleVal = val;
        System.out.println("doubleVal1 = " + doubleVal);

        doubleVal = 20L;
        System.out.println("doubleVal2 = " + doubleVal);

        // 자동형변환
        /*
         1. 묵시적 형변환
         대입하는 형(타입)을 맞춰야하기 때문, (double)을 적어주면 int 형이 double 형으로 변환
         작은범위 숫자 타입에서 큰범위 숫자 타입으로 대입은 개발자가 직접 형변환을 하지 않아도된다 (묵시적 형변환 )
       */
       /*
        intValue = 10
        doubleValue = intValue
        doubleValue = (double)intValue 형 맞추기
        doubleValue = (double)10 변수 값읽기
        doubleValue = 10.0 형변환
        */

    }
}
