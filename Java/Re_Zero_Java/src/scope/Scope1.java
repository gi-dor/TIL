package scope;

public class Scope1 {
    public static void main(String[] args) {
        int m = 10;
        // 임시로 사용하는 변수 tmp 는 if 문 안에서 사용 해야한다
        // if 문 밖에 생성된다면 main 메서드 블럭이 종료될 때 까지 메모리에 유지되어 비효율적인 메모리가 소모된다.
        int tmp = 0;
        if (m > 0) {
            tmp = m * 2;
            System.out.println("tmp = " + tmp);
        }
        System.out.println("m = " + m);
    }
}
