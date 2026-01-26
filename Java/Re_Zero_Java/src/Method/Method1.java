package Method;

public class Method1 {
    public static void main() {
        checkAge(19);
        checkAge(10);

        int num1 = 5;
        System.out.println("1. changeNum 호출전 num1 : " + num1);
        changeNumber(num1);
        System.out.println("4. changeNum 호출후 num1 : " + num1);
    }
    public static void checkAge(int age) {
        if(age < 18) {
            System.out.println(age + "살 , 미성년자는 출입 불가");
            return;
        }
            System.out.println(age + "살 , 입장하세요");

    }

    public static void changeNumber(int num2) {
        System.out.println("2. changeNum 변경전 num2 :" + num2);
        num2 = num2 * 2;
        System.out.println("3. changeNum 변경후 num2 :" + num2);
    }
}
