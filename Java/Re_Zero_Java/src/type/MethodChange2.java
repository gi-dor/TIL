package type;

public class MethodChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("메서드 호출전 : dataA.value = "+dataA.value);
        changeReference(dataA);
        System.out.println("메서드 호출후 : dataA.value = "+dataA.value);

    }

    // dataX 변수에 dataA값을 전달
    // int dataX = dataA
    // 자바에서 변수에 값을 대입하는것은 항상 값을 복사해서 대입한다
    public static void changeReference(Data dataX) {
        dataX.value = 20;
    }
}
