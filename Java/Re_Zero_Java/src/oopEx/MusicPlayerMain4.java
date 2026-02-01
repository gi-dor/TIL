package oopEx;

public class MusicPlayerMain4 {

    public static void main(String[] args) {
        MusicPlayer mp = new MusicPlayer();

        // 플레이어 키기
        mp.onPlayer();

        // 볼륨증가
        mp.increaseVolume();
        mp.increaseVolume();
        mp.increaseVolume();
        mp.increaseVolume();

        // 볼륨 감소
        mp.decreaseVolume();

        // 상태확인
        mp.showStatus();

        // 플레이어 종료
        mp.offPlayer();
    }
}
