package Method;

public class OverLoading1 {
    public static void main(String[] args) {
        System.out.println("1 : "+ add(2,3));
        System.out.println("2 : " + add(3,4,5));
    }
    public static int add(int a, int b){
        System.out.println("1번 호출 ====");
        int sum = a + b;
        return sum;
    }
    public static int add(int a, int b , int c){
        System.out.println("2번 호출 ====");
        int sum = a + b + c;
        return sum;
    }

}
