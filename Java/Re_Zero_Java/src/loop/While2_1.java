package loop;

public class While2_1 {
    public static void main(String[] args) {

        int sum = 0;

        sum = sum + 1;
        System.out.println("sum : " + sum);
        sum = sum + 2;
        System.out.println("sum : " + sum);
        sum = sum + 3;
        System.out.println("sum : " + sum);

        int resultSum = 0;
        int i = 1;
        while (i <= 3) {
            resultSum = resultSum + i;
            System.out.println("resultSum : " + resultSum);
            i++;
        }

    }
}
