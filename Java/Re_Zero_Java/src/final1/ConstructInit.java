package final1;

public class ConstructInit {


    //  Field 'value' might not have been initialized
    // final 선언하고 값을 할당 해야하늗네 하지 않아서 컴파일러가 값이 없네 ? 생각하고
    // 컴팡일러는 값을 할당하지 않은채 객체로 만들수도 있다고 판단해 에러 발생하는것
    final int value;


    // 생성자의 역할은 객체가 생성되면서 초기상태를 설정한다
    // final 변수에 값을 할당할수 있는 순간은 객체가 생성되는 시점 뿐이라서
    public ConstructInit(int value) {
        this.value = value;
    }
}
