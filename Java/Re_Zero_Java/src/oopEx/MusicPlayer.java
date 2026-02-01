package oopEx;

import oopEx.Procedural.MusicPlayerData;

public class MusicPlayer {
    int volume = 0;
    boolean isOn = false;

    void increaseVolume(){
        volume++;
        System.out.println("음악플레이어 볼륨 증가 : "+volume);
    }

    void decreaseVolume( ){
        volume--;
        System.out.println("음악플레이어 볼륨 감소 : "+volume);
    }

    void onPlayer() {
        isOn = true;
        System.out.println("음악플레이어 실행 메서드");
    }

    void offPlayer() {
        isOn = false;
        System.out.println("음악플레이어 종료 메서드");
    }

    void showStatus() {
        System.out.println("=== 음악 플레이어 상태 확인 ===");
        if(isOn) {
            System.out.println("음악 플레이어 ON");
        } else {
            System.out.println("음악 플레이어 OFF");
        }

    }
}
