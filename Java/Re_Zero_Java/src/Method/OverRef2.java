package Method;

public class OverRef2 {
    public static void main(String[] args) {
        String message = "HI";

//        for(int i =0; i <3; i++) {
//            System.out.println(message);
//        }

        printMessage(message,3);

//        for(int i =0; i <5; i++) {
//            System.out.println(message);
//        }

        printMessage(message,5);

//        for(int i =0; i <6; i++) {
//            System.out.println(message);
//        }

        printMessage(message,6);
    }
    public static void printMessage(String message,int times) {
        for(int i =0; i < times; i++) {
            System.out.println(message);
        }
    }
}
