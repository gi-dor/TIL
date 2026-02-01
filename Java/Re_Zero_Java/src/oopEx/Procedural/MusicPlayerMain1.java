package oopEx.Procedural;

public class MusicPlayerMain1 {
    // 음악플레이어를 켜고 끌수 있다
    // 볼륨을 증가 , 감소할수 있다
    // 상태를 확인할수 있다

    public static void main(String[] args) {
        int volume = 0;
        boolean isOn = false;

        // 플레이어 키기
        isOn = true;
        System.out.println("플레이어를 켭니다");

        // 볼륨증가
        volume++;
        volume++;
        System.out.println("음악플레이어 볼륨 증가 : "+volume);

        // 볼륨 감소
        volume--;
        System.out.println("음악플레이어 볼륨 감소 : " + volume);

        // 상태확인
        System.out.println("상태확인 ===");

        if(isOn) {
            System.out.println("음악 플레이어 ON , 볼륨 : " + volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
        // 플레이어 종료
        isOn = false;
        System.out.println("음악 플레이어 OFF");
    }
}
