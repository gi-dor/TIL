package type;

public class Method2 {
    public static void main(String[] args) {
        Student student1 = new Student();
        System.out.println("student1 = " + student1);
//        student1.name = "학생1";
//        student1.age = 15;
//        student1.grade = 90;
        initStudent(student1, "학생123", 15, 90);
        printStudent(student1);

        Student student2 =  createStudent("학생2341111", 167, 80);
        System.out.println("student2 = " + student2);
        printStudent(student2);

    }

    static  Student createStudent(String name , int age , int grade){
        Student student = new Student();
        System.out.println("create Student = " + student);
        student.name = name;
        student.age = age;
        student.grade = grade;
        return student;
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
