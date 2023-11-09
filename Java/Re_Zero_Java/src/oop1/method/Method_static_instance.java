package oop1.method;

class Method{
    long a;
    long b;

    /*
    인스턴스 메서드
    인스턴스 변수 a , 만을 이용해서 작업하므로 매개변수가 필요 없다.
     */
    long add(){
        return a+b;
    }
    long sub(){
        return a - b;
    }

    long multi(){
        return a * b;
    }

    double divide(){
        return a / b;
    }

    /*
    static 메서드
    인스턴스 변수와 관계없이 매개변수만으로 작업이 ㄱㅏ능
     */

    static long add (long a , long b){
        return a + b;
    }
    static  long sub(long a, long b){
        return a - b;
    }
    static  long multi(long a, long b){
        return a * b;
    }
    static double divide(double a ,double b) {
        return a / b;
    }

}

        // 인스턴스메서드 호출 : 참조변수.인스텬스변수
        // 클래스메서드 호출 : 클래스명.메서드이름(매개변수,매개변수)
public class Method_static_instance {
    public static void main(String[] args) {
        
        // static 메서드 호출 , 객체 생성없이 호출이 가능하다
        // 클래스명.메서드이름(매개변수 , 매개변수) 로 호출
        System.out.println(Method.add(200L,100L));
        System.out.println(Method.sub(300L,100L));
        System.out.println(Method.multi(400L,1000L));
        System.out.println(Method.divide(300,3));
        System.out.println();

        // 객체생성
        Method m = new Method();



        // 인스턴스 변수 초기화
        // m.a와 m.b는 m이 참조하는 Method 객체의 인스턴스변수에 접근한다
        m.a = 1000;
        m.b = 500;

        // 이제 인스턴스 메서드 사용가능
        System.out.println(m.add());
        System.out.println(m.sub());
        System.out.println(m.multi());
        System.out.println(m.divide());
    }
}
