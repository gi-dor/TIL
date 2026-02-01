package oopEx;

public class ValueDataMain {
    public static void main(String[] args) {
        ValueData valueData = new ValueData();
//        valueData.value++;
//        System.out.println("숫자 증가 value = " + valueData.value);
//        valueData.value++;
//        System.out.println("숫자 증가 value = " + valueData.value);
//        valueData.value++;
//        System.out.println("숫자 증가 value = " + valueData.value);

        add(valueData);
        add(valueData);
        add(valueData);
        System.out.println("주소값 : "+ valueData);
        System.out.println("최종 숫자  : "+ valueData.value);

        valueData.add();
    }
    static void add(ValueData valueData) {
        valueData.value++;
        System.out.println("숫자 증가 value = " + valueData.value);
    }
}
