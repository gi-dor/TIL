package condition;

public class If01 {
    public static void main(String[] args) {

        int age1 = 20;
        int age2 = 19;
        if (age1 >= 19) {
            System.out.println("성인 입니다 , 나이 : " + age1);
        }

        if (age1 < 19) {
            System.out.println("성인이 아닙니다 , 나이 : " + age1);
        }
        System.out.println("=============================================");
        System.out.println("주어진 나이 :" + age2);

        if (age2 < 19) {
            System.out.println("현재나이 : " + age2 + " 미성년자 입니다");
        } else {
            System.out.println("현재나이 : " + age2 + " 성인 입니다.");
        }
    }
}
