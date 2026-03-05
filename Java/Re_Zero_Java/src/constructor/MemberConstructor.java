package constructor;

public class MemberConstructor {
    String name;
    int age;
    int grade;


    MemberConstructor(String name , int age) {
//        this.name = name;
//        this.age = age;
//        this.grade = 20;
        this(name , age , 20); // 변경가능
//        MemberConstructor(String name , int age) -> MemberConstructor(String name , int age , int grade) 호출함
//        this()를 사용하면 생성자 내부에서 다른 생성자를 호출할수 있다
        // 생성자의 첫 줄에서만 가능하다 this()
        /**
         * System.out.println("123");
         * this(name , age , 20); 불가능
         */
    }

    public MemberConstructor(String name, int age, int grade) {
        System.out.println("생성자 호출 : name = " + name + " age = " + age + " grade = " + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
