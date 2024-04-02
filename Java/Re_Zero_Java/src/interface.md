### 🔹 인터페이스

- 일종의 추상 클래스
- 추상클래스 처럼 추상메서드를 갖지만 일반메서드 , 멤버변수 구성 불가
- 멤버로 오직 추상 메서드와 상수(final 변수)만 가질수 있다
- java8 이후로는 default 메서드와 static 메서드도 포함이된다고 한다
- 클래스가 특정 인터페이스를 구현한다는 것은 해당 인터페이스의 메서드들을 모두 구현해야 한다
- 지금까지 배운 상속의 개념인 단일 상속과는 다르게 다중 상속이 가능하다
- 클래스가 여러 인터페이스를 구현 할 수 있다

제약조건
<br>

* 모든 멤버변수는 public static final 이어야 한다 생략가능 !
    * 모든 메서드는 public abstract 이어야 한다 생략가능!

          interface blade {

            public static final int HEIGHT = 100;
            final int WEIGHT = 10;    // public static final int WEIGHT = 10;
            static int RUBY = 1;  // public static final int RUBY = 1 ;
            int CLOVER = 2;   // public static final int CLOVER = 2;

            String getAttack(); // public abstract String getAttack();
              }

<br><br>

### 🔹 추상클래스

- 추상 클래스는 일반적인 멤버변수와 메서드 그리고 추상 메서드를 가지고 있다.
- 추상 클래스는 일반적으로 멤버변수와 메서드를 제공하는 클래스
- 단일 상속만 가능하며 다른 클래스를 상속 받으면서 동시에 다른 클래스를 상속 받을수 없다

<br>

-----
<br>
📌 추상클래스는 부분적으로 완성된 '미완성 설계도'
<br><br>
📌 인터페이스는 구현된것은 아무것도 없는 '기본 설계도'
<br><br>

----



