package Arr;

public class ArrIndex {
    static void main() {

        int[] students = new int[4];
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;

        System.out.println("students[0] : "+students[0]);
        System.out.println("students[1] : "+students[1]);
        System.out.println("students[2] : "+students[2]);
        System.out.println("students[3] : "+students[3]);
//        System.out.println("students[4] : "+students[4]); // java.lang.ArrayIndexOutOfBoundsException Index 4 out of bounds for length 4
    }
}
