package loop;

public class Ex_While {
    /*
        while(조건식) {
            //  코드
        }
     */
    public static void main(String[] args) {

        int cnt = 0;
        while (cnt < 5) {
            cnt = cnt + 1;
            System.out.println("현재 숫자 :" + cnt);
        }
        System.out.println("----------------------");
        System.out.println("최종 숫자 :" + cnt);
    }

}
