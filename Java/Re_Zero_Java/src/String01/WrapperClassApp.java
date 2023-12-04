package String01;

public class WrapperClassApp {
    public static void main(String[] args) {

        /**
         * 래퍼 (wrapper) 클래스
         * 8개의 기본형을 객체로 다뤄야 할 때 사용하는 클래스
         */

        Integer i = new Integer(100);
        Integer i2 = new Integer(100);
        Double d = new Double(3.14);
        Double d2 = new Double(3.14);

        System.out.println("i == i2 ? " + (i == i2)); // false 주소 비교
        System.out.println("i.equals(i2) ? " + (i.equals(i2))); // true 값 비교
        System.out.println("i.compareTo(i2) ? " + (i.compareTo(i2))); // 0  같으면 0 , 오른쪽값이 작으면 양수 , 오른쪽 값이 크면 음수
        System.out.println("i.toString() ? " + (i.toString())); // 100
        System.out.println("i2.toString() ? " + (i2.toString())); // 100
        System.out.println("-------------------------------------------------------");
        System.out.println("d == d2 ? " + (d == d2));
        System.out.println("d.equals(d2) ? " + (d.equals(d2)));
        System.out.println(d.toString());
        System.out.println(d2.toString());

        System.out.println("-----------------------------------------------------");

        System.out.println(Integer.MAX_VALUE); // 2147483647 Integer 최대값
        System.out.println(Integer.MIN_VALUE); // -2147483648 Integer 최소값


    }
}
