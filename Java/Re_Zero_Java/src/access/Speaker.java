package access;

public class Speaker {

    private int volume;     // 일반 int volume 에서 private int volume 으로 변경


    Speaker(int volume) {
        this.volume = volume;
    }

    void volumeUp() {
        if(volume >= 100 ) {
            System.out.println("음량을 증가 할수 없습니다 , 최대 음량입니다");
        } else {
            volume += 10;
            System.out.println("음량을 10 증가합니다");
        }
    }

    void volumeDown() {
        if (volume <= 0) {
            System.out.println("음량을 감소 할수 없습니다 , 최소 음량입니다");
        } else {
            volume -= 10;
            System.out.println("음량을 10 감소합니다");
        }
    }

    void showVolume() {
        System.out.println("현재 음량 : " + volume);
    }
}
