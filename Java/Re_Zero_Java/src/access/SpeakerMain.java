package access;

public class SpeakerMain {
    static void main(String[] args) {
        Speaker speaker = new Speaker(90);

        speaker.showVolume();
        speaker.volumeUp();
        speaker.volumeUp();


        speaker.showVolume();
        speaker.volumeDown();
        speaker.volumeDown();
        speaker.volumeDown();

        speaker.showVolume();

        //필드 직접 접근 가능한 상태다
        System.out.println("volume 필드 직접 접근 수정");
//        speaker.volume = 200;   'volume' has private access in 'access.Speaker'
        speaker.showVolume();
    }
}
