package condition;

public class If02 {
    public static void main(String[] args) {
        int age = 14;

        // 불필요한 검사가 너무많다
        // 코드가 반복되며 길기만 함
        if (age <= 7) {
            System.out.println("미취학 아동입니다");
        }
        if (age >= 8 && age <= 13) {
            System.out.println("초등학생 입니다");
        }
        if (age >= 14 && age <= 16) {
            System.out.println("중학생 입니다");
        }
        if (age >= 17 && age <= 19) {
            System.out.println("고등학생 입니다");
        }
        if (age >= 20) {
            System.out.println("초등학생입니다");
        }

        if (age <= 7) {
            System.out.println("미취학 아동입니다");
        } else if (age <= 13) {
            System.out.println("초딩");
        } else if (age <= 16) {
            System.out.println("중딩");
        } else if (age <= 19) {
            System.out.println("고딩");
        } else {
            System.out.println("성인");
        }

    }
}
