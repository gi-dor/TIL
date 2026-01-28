package classSt;

public class ClassStudent1 {
    public static void main(String[] args) {
        Student student1 = new Student();;
        student1.name = "학생1";
        student1.age = 20;
        student1.grade = 80;

        Student student2 = new Student();


        System.out.println(student1);
        System.out.println(student2);
        System.out.println("이름 : "+student1.name + " 나이 : "+student1.age + " 점수 : " + student1.grade);

    }
}
