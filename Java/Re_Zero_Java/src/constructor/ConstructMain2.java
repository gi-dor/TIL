package constructor;

public class ConstructMain2 {
    public static void main(String[] args) {
        MemberConstructor memberConstructor1 = new MemberConstructor("user1",15,90);
        // 성적입력 안했지만 만들어둔 생성자에 성적 값 20 설정해뒀음
        MemberConstructor memberConstructor2 = new MemberConstructor("user2",25);

        MemberConstructor[] members = {memberConstructor1,memberConstructor2};
        for(MemberConstructor s : members) {
            System.out.println("이름 : " + s.name + " 나이 : " + s.age + " 성적 : " + s.grade);
        }
    }
}
