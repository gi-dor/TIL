package static1;

public class DataCountMain1 {

    static void main(String[] args) {

        // 객체 생성 시마다 인스턴스가 새로만들어짐
        // 인스턴스 만듬 -> count 값은 0 으로 초기화 생성자에서 count++ 이므로 count값은 계쏙 1
        //ㅇ 인스턴스에 포함된 변수 count도 새로 만들어지므로 1 1 1 출력
        Data1 data1 = new Data1("A");
        System.out.println("A count = " + data1.count);


        Data1 data2 = new Data1("B");
        System.out.println("B count = " + data2.count);


        Data1 data3 = new Data1("C");
        System.out.println("C count = " + data3.count);
    }
}
