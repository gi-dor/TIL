package constructor;

public class MemberInitMain1 {

    String nameField;

    // nameField 앞에 this가 없어도 멤버변수에 접근한다
    void initMember(String nameParameter) {
        nameField = nameParameter;
        // nameParameter는 매개변수에서 같은 이름이 있는지 찾음 ,매개변수가 있으므로 매개변수를 사용한다
        // nameField 먼저 지역변수(매개변수)에서 같은 이름이 있는지 찾는다 , 없으므로 멤버변수에서 찾음
    }

    // 멤버변수에 접근하는 경우 항상 this를 적는 경우도 있음
    // 멤버변수를 사용한다는 것을 쉽게 확인이 가능함
    void thisMemger(String nameParameter) {
        this.nameField = nameParameter;
    }
}
