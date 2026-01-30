package type;

public class VarChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA;

        System.out.println("dataA 참조값 : "+dataA);
        System.out.println("dataB 참조값 : "+dataB);


        System.out.println("dataA.value : "+dataA.value);
        System.out.println("dataB.value : "+dataB.value);

        System.out.println();
        dataA.value = 20;
        System.out.println("dataA.value = 20 으로변경");
        System.out.println("dataA.value : "+dataA.value);
        System.out.println("dataB.value : "+dataB.value);
        System.out.println();

        dataB.value = 30;
        System.out.println("dataB.value = 30 으로변경");
        System.out.println("dataA.value : "+dataA.value);
        System.out.println("dataB.value : "+dataB.value);

        System.out.println("dataA.value 주소값 , dataB.value 주소값이 일치해 둘중 하나만 바꿔도 다 적용됨");

    }
}
