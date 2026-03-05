package pack;

import pack.a.User;

public class PackMain3 {

    static void main(String[] args) {
        // import 한개로 했다면 둘중 하나는 package 명 까지 입력
        User userA = new User();
        pack.b.User userB = new pack.b.User();
    }
}
