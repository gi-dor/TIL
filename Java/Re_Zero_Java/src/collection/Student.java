package collection;

public class Student {

    private int no;
    private String name;
    private int kor;
    private int eng;
    private int math;


    public Student() {
    }

    public Student(int no, String name, int kor, int eng, int math) {
        this.no = no;
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public int getNo() {
        return no;
    }

    public String getName() {
        return name;
    }

    public int getKor() {
        return kor;
    }

    public int getEng() {
        return eng;
    }

    public int getMath() {
        return math;
    }


    public int getTotal() {
        return kor + eng + math;
    }

    public int getAverage() {
        return getTotal() / 3;
    }


}

