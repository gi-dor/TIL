package oopEx.Procedural;

public class MusicPlayerMain3 {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        // 플레이어 키기
        onPlayer(data);

        // 볼륨증가
        increaseVolume(data);
        increaseVolume(data);
        increaseVolume(data);

        // 볼륨 감소
        decreaseVolume(data);

        // 상태확인
        System.out.println("==== 상태확인 ===");

        if(data.isOn) {
            onPlayer(data);
            increaseVolume(data);
        } else {
            offPlayer(data);
        }
        // 플레이어 종료
        data.isOn = false;
        System.out.println("음악 플레이어 OFF");
    }

    public static void increaseVolume(MusicPlayerData data){
        data.volume++;
        System.out.println("음악플레이어 볼륨 증가 : "+data.volume);
    }

    public  static void decreaseVolume(MusicPlayerData data){
        data.volume--;
        System.out.println("음악플레이어 볼륨 감소 : "+data.volume);
    }

    public static void onPlayer(MusicPlayerData data) {
        data.isOn = true;
        System.out.println("음악플레이어 실행 메서드");
    }

    public static void offPlayer(MusicPlayerData data) {
        data.isOn = false;
        System.out.println("음악플레이어 종료 메서드");
    }
}
