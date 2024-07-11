package casting;

public class Casting2 {
    public static void main(String[] args) {
        /*
        명시적 형변환 큰 범위 -> 작은범위
         */
        double doubleVal = 1.5;
        int intVal = 0;
//      intVal = doubleVal; // 컴파일 오류 발생 , java: incompatible types: possible lossy conversion from double to int
        intVal = (int) doubleVal; // 명시적 형변환
        System.out.println("intVal = " + intVal);
        /*
        int형은 double형보다 숫자의 표현범위가 작다 , 실수를 표현할수 없다
        따라서 이런 경우 숫자가 손실되는 문제가 발생한다. 
         */
    }
}
