package Method;

public class OverLoading2 {
    public static void main(String[] args) {
        myMethod(1,3.5);
        myMethod(3.5,1);
        System.out.println("1 : " + add(1,2));
        System.out.println("2 : " + add(1.2,2.2));



    }

    static void myMethod(int a, double b) {
        System.out.println("int a , double b");
    }

    static void myMethod(double a , int b) {
        System.out.println("double a , double b");
    }

    public static int add(int a , int b) {
        System.out.println("1번호출 ");
        return a + b;
    }

    public static double add(double a , double b) {
        System.out.println("2번호출 ");
        return a + b;
    }
}
