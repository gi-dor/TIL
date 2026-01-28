package classSt;

public class ClassStudent3 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "학생1";
        student1.age = 17;
        student1.grade = 80;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 19;
        student2.grade = 60;

        Student[] students = new Student[]{student1,student2};
//        Student[] students = {student1,student2};

        for(Student s : students) {
            System.out.println("이름 : "+s.name + " 나이 : "+s.age + " 점수 : "+s.grade );
        }

        /*
        for(int i = 0; i < students.length; i++) {
            Student s = students[i];
            System.out.println("이름 : "+s.name + " 나이 : "+s.age + " 점수 : "+s.grade );
        }
        */

        /*
        for(int i = 0; i < students.length; i++) {
            System.out.println("이름 : "+students[i].name + " 나이 : "+students[i].age + " 점수 : "+students[i].grade );
        }
        */

        /*
        students[0] = student1;
        students[1] = student2;
        System.out.println("이름 : "+student1.name + " 나이 : "+student1.age + " 점수 : " + student1.grade);
        System.out.println("이름 : "+students[0].name + " 나이 : "+students[0].age + " 점수 : "+students[0].grade );
        System.out.println("이름 : "+student2.name + " 나이 : "+student2.age + " 점수 :" + student2.grade);
        System.out.println("이름 : "+students[1].name + " 나이 : "+students[1].age + " 점수 : "+students[1].grade );
        */



    }
}
