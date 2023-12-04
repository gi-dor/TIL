package String01;

public class StringBuilderApp01 {

    public static void main(String[] args) {

        /**
         * StringBuffer는 동기화 되어있다 , 멀티쓰레드에 안전함 // 데이터 보호
         * StringBuilder는 동기화 되어있지 않다 , 멀티쓰레드이 취약
         *
         * 싱글쓰레드 : 한번에 1개작업
         * 멀티쓰레드 : 한번에 여러개 작업  // 카톡하면서 파일 다운로드 + 채팅 + 음악듣기
         *
         * 멀티쓰레드 프로그램이 아닌경우 , 동기화는 불필요한 성능저하
         * 싱글스레드에서는 StringBuilder를 사용하자
         * 솔직히 대부분 StringBuffer씀 ㅎㅎ;
         */

        StringBuffer sb;
        sb = new StringBuffer();
        sb.append("zxcv");

        StringBuilder sb1;
        sb1 = new StringBuilder();
        sb1.append("zxcv");

        /**
         * 다른거 변경없이 StringBuffer -> StringBuilder
         * 클래스 이름만 변경하면된다.
         */

    }
}
