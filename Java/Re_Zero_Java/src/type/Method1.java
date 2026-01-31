package type;

public class Method1 {
    public static void main(String[] args) {
        Student student1 = new Student();
        initStudent(student1, "학생123", 15, 90);
//        student1.name = "학생1";
//        student1.age = 15;
//        student1.grade = 90;

        Student student2 = new Student();
        initStudent(student2, "학생234", 16, 80);

        printStudent(student1);
        printStudent(student2);
    }

//    static void initStudent(Student 0x100 , String name , int age , int grade) {
//        0x100.name = 학생123;
//        0x100.age = 15;
//        0x100.grade = 90;
//    }
    static void initStudent(Student student , String name , int age , int grade) {
        student.name = name;
        student.age = age;
        student.grade = grade;
    }
    static void printStudent(Student student) {
        System.out.println("이름 : " + student.name + " 나이 : " + student.age + " 점수 : " + student.grade);
    }
}
