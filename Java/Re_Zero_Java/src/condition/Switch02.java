package condition;

public class Switch02 {

    public static void main(String[] args) {

        int grade = 2;
        int coupon;

        switch (grade) {
            case 1:
                coupon = 1000;
//                System.out.println("case1 ,  coupon 1000");
                break;
            case 2:
            case 3:
                coupon = 3000;
                break;
            default:
                coupon = 500;
                break;
        }
        System.out.println("발급 받은 쿠폰 = " + coupon);
    }
}
