package final1;

public class FinalFieldMain {
    static void main(String[] args) {
        System.out.println("생성자 초기화");

        ConstructInit constructInit1 = new ConstructInit(12);
        ConstructInit constructInit2 = new ConstructInit(33);

        System.out.println(constructInit1.value);
        System.out.println(constructInit2.value);


        // fianl 필드 - 필드 초기화
        System.out.println("필드 초기화");
        FieldInit  fieldInit1 = new FieldInit();
        FieldInit  fieldInit2 = new FieldInit();
        FieldInit  fieldInit3 = new FieldInit();

        System.out.println("fieldInit1.value = " + fieldInit1.value);
        System.out.println("fieldInit1.value = " + fieldInit2.value);
        System.out.println("fieldInit3.value = " + fieldInit3.value);


        // 클래스 상수
        System.out.println("클래스 상수");
        System.out.println(FieldInit.CONST_VALUE);


    }
}
