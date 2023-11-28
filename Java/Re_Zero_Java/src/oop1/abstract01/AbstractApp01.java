package oop1.abstract01;


public class AbstractApp01 {

    public static void main(String[] args) {

        Marine m = new Marine();
        Tank t = new Tank();

        System.out.println("Marine 시작합니다");
        m.move(10, 30);
        m.stop();
        m.steampack();

        System.out.println();
        System.out.println("Tank 시작합니다");
        t.move(30, 700);
        t.stop();
        t.changeMode();

    }

}



class Marine extends Unit{


    void move(int x , int y){
      System.out.println(x+"좌표 "+y +"좌표 이동");
  }

    void steampack(){
        System.out.println("Marine , 스팀팩 시전");
    }

}


 class Tank extends Unit {
     void move(int x, int y) {
         System.out.println(x + "좌표 " + y + "좌표 이동");
     }

     void changeMode() {
         System.out.println("Tank, 변신 합니다");
     }
 }

    abstract class Unit {
        int x;
        int y;
        abstract void move(int x, int y);
        void stop(){
            System.out.println("Marine , 정지 합니다");
        }
    }
