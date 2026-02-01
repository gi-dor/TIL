package oopEx.Procedural;

public class MusicPlayerMain2 {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        // 플레이어 키기
        data.isOn = true;
        System.out.println("플레이어를 켭니다");

        // 볼륨증가
        data.volume++;
        System.out.println("음악플레이어 볼륨 증가 : "+data.volume);

        // 볼륨 감소
        data.volume--;
        System.out.println("음악플레이어 볼륨 감소 : " + data.volume);

        // 상태확인
        System.out.println("상태확인 ===");

        if(data.isOn) {
            System.out.println("음악 플레이어 ON , 볼륨 : " + data.volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
        // 플레이어 종료
        data.isOn = false;
        System.out.println("음악 플레이어 OFF");
    }
}
