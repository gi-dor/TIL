package access.ex;

public class MaxCounter {

    private int count = 0; // 내부에서 사용할 숫자 초기값 0
    private int max;        // 생성자를 통해 입력

    public MaxCounter(int max) {
        this.max = max;
    }

    public void increment() {
        if(count > max) {
            System.out.println("최대값 max 를 초과할수 없습니다");
        } else {
             count ++;
        }
    }

    public int getCount() {
        return count;
    }
}
