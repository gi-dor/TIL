package Arr;

public class ForLoop {
    static void main(String[] args) {
        int[] num = {1,2,3,4,5};

        for(int i = 0; i < num.length; i++){
            int number = num[i];
            System.out.println(number);
        }
        System.out.println("-===============");
        // for-each
        // 배열의 끝을 설정하지 않고 처음부터 끝까지 탐색
        for(int number : num){
            System.out.println(number);
        }

        // 증가하는 index값이 필요할경우 for-each 사용불가
        for(int i = 0; i < num.length; i++){
            System.out.println("number " + i + "번의 결과는 " + num[i]);
        }

    }
}
