package extends00;

public class CastingEx {

    public static void main(String[] args) {

        // 부모클래스
        Phone p = new Phone();

        // 자식 클래스
        SmartPhone sp = new SmartPhone();

        Phone p2 = sp;  // 자동 형변환

//        SmartPhone sp2 =  p; // type mismatch 호환되지 않는 타입입니다. 발견: 'extends00.Phone.Phone', 필요: 'extends00.Phone.SmartPhone'
        SmartPhone sp2 = (SmartPhone) p;

        sp2.installApp();
//        p2.installApp(); 'installApp'의 메서드 'installApp'을(를) 해결할 수 없습니다
        // 부모 클래스는 자식만 가지고 있는 메서드나 필드를 사용할수 없다
        // 단지 상속으로 물려준 멤버들만 쓸수 있다.
    }
}
