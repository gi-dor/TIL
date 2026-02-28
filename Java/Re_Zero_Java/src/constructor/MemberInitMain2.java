package constructor;

public class MemberInitMain2 {

    String nameField;

    // nameField 앞에 this가 없어도 멤버변수에 접근한다
    void initMember2(String nameParameter) {
        nameField = nameParameter;
        // nameParameter는 매개변수에서 같은 이름이 있는지 찾음 ,매개변수가 있으므로 매개변수를 사용한다
        // nameField 먼저 지역변수(매개변수)에서 같은 이름이 있는지 찾는다 , 없으므로 멤버변수에서 찾음
    }

    // 멤버변수에 접근하는 경우 항상 this를 적는 경우도 있음
    // 멤버변수를 사용한다는 것을 쉽게 확인이 가능함
    void thisMemger(String nameParameter) {
        this.nameField = nameParameter;
    }

    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        initMember(member1 , "user3" , 14 , 90);
        //        member1.name = "user1";
    //        member1.age = 15;
    //        member1.grade = 90;

        MemberInit member2 = new MemberInit();
        member2.name = "user2";
        member2.age = 20;
        member2.grade = 80;

        MemberInit[] members = {member1,member2};
        for(MemberInit member : members) {
            System.out.println("이름 : " + member.name + " 나이 : " + member.age + " 성적 : " + member.grade);
        }
    }

    static void initMember(MemberInit member , String name , int age , int grade) {
        member.name = name;
        member.age = age;
        member.grade = grade;
    }


}
