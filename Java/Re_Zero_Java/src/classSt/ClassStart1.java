package classSt;

public class ClassStart1 {
    public static void main(String[] args) {
        String[] studentNames = {"학생1","학생2","학생3"};
        int[] studentAges = {10,11,12};
        int[] studentGrades = {90,80,70};

        for(int i = 0; i < studentNames.length; i++) {
            System.out.println("이름 : "+studentNames[i] + " 나이 : " + studentAges[i] + " 점수 : " + studentGrades[i]);

        }

        /*
        String student1 = "학생1";
        int student1Age = 10;
        int student1Grade = 90;

        String student2 = "학생2";
        int student2Age = 11;
        int student2Grade = 70;

        String student3 = "학생3";
        int student3Age = 12;
        int student3Grade = 80;
        */

    }
}
