package extends00.Phone;

public class SmartPhoneEx {

    public static void main(String[] args) {

        Phone p = new Phone();
        p.name = "폰";
         p.color = "검정";
         p.company = "삼성";

        System.out.println("Phone 객체 출력");
        System.out.println(p.name);
        System.out.println(p.color);
        System.out.println(p.company);
        p.call();
        p.receive();

        System.out.println();
        SmartPhone sp = new SmartPhone();
        sp.name = "아이폰";
        sp.color = "화이트";
        sp.company = "애플";

        System.out.println("SmartPhone 객체 출력");
        System.out.println(sp.name);
        System.out.println(sp.color);
        System.out.println(sp.company);
        sp.call();
        sp.receive();
        sp.installApp();

    }
}
