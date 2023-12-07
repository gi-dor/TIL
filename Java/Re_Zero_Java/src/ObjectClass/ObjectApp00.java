package ObjectClass;

public class ObjectApp00 {

    public static void main(String[] args) {

        Object o1 = new Object();
        Object o2 = o1;

        // 같은 객체인지 비교 하는 메서드 equals()
        // equals는 주소값이 아닌 데이터 값을 비교한다
        System.out.println(o1.equals(o2)); // 참조 자료형이기 때문에 두개의 객체는 같다
        // == 는 주소값을 비교한다
        System.out.println(o1 == o2);

        Object o3 = new Object();
        System.out.println(o1.equals(o3));

        System.out.println(o1.hashCode());
        System.out.println(o2.hashCode());
        System.out.println(o3.hashCode());

        System.out.println(o1.toString()); // java.lang.Object@4eec7777
        System.out.println(o2.toString()); // java.lang 패키지에있는 Object 클래스 @ 코드값

    }


}
