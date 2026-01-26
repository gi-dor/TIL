package Method;

public class Method2 {
    static void main(String[] args) {
        double num = 1.5;
        // double -> int 명시적형변환
        printNum((int)num);
        // double이 범위가 더 크기에 int 때려 넣어도 자동형변환 적용
        int number = 100;
        printNum2(number);
    }

    public static void printNum(int n){
        System.out.println("숫자  : "+ n);
    }

    public static void printNum2(double n){
        System.out.println("숫자  : "+ n);
    }
}
