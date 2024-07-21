1. [JavaSE , JavaEE 애플리케이션 차이](#java-se-와-java-ee-애플레키이션-차이)<br>
2. [Java 와 C, C++](#java-와-c--c-의-차이점)<br>
3. [Java 장단점](#java-의-장단점)<br>
4. [Java 컴파일 과정](#자바-컴파일과정)<br>
5. [접근 제어자](#접근-제어자)<br>
6. [데이터 타입](#데이터-타입)<br>
7. [Wrapper-calss](#wrapper-class)<br>
8. [객체지향 5원칙 SOLID](#객체지향-설계-5원칙)_<br>
9. [객체지향 프로그래밍 , 절차지향 프로그래밍](#객체지향-프로그래밍--절차지향-프로그래밍)<br>
10. [객체지향](#객제지향)<br>
11. [객체지향 특징](#객체지향-특징)<br>
12. [인터페이스](#인터페이스-interface)<br>
13. [인터페이스와 추상클래스의 차이점](#인터페이스와-추상-클래스의-차이점)<br>
14. [인스턴스변수 , static변수 ](#non-static-변수--static-변수)<br>
15. [final](#final-키워드)

### Java SE 와 Java EE 애플레키이션 차이

- Java SE (Standard Edition)
    - Java의 기본 플랫폼으로 , 데스크탑 애플리케이션 개발하는데 주로 사용
    - 기본 클래스 라이브러리 : java.lang , java.util , java.io 등의 기본 패키지

- Java EE (Enterprise Edition)
    - Java SE를 기반으로 확장된 플랫폼
    - 이식 가능 , 확장 가능
    - 웹 애플리케이션 , 분산 시스템 등을 구축하는데 필요한 API와 서비스를 제공
        - Servlet , JSP : 웹 애플리케이션 개발을 위한 기술
        - JPA (Java Persistance API): 객체 - 관계 매핑을 위한 API
        - JMS (Java Message Service): 메세지 기반의 통신
        - Web Service : RESTful 웹 서비스 구현

    - Java SE는 기본적인 애플리케이션 개발 , Java EE는 대규모 엔터프라이즈 애플리케이션 개발을 위한 플랫폼

<br>

### Java 와 C , C++ 의 차이점

- Java 와 C , C++ 차이점은 실행환경이다
- Java 에서 개발 : 컴파일 또는 컴파일 + jar파일 압축
    - Java는 링크 과정이 없이 컴파일러가 바로 바이트 코드를 생성
- C , C++ : 컴파일 + 링크

<br>

### 자바 컴파일과정

1. 자바 소스 코드 작성 , 해당 코드는 `.java` 파일로 저장
2. `javac` 컴파일러가 `.java` 파일을 읽고 컴파일 과정을 통해 `.class` 파일을 생성
3. 코드의 해당 명령어를 실행하면 JVM이 `.class` 파일을 로드하고 바이트 코드를 실행해 콘솔에 표시

<br>

### Java 의 장단점

- 장점
    - 운영체제에 독립적이다
        - JVM 에서 동작하기 때문에 특정 운영체제에 종속되지 않는다
    - 객체지향 언어
        - 객체지향적으로 프로그래밍 하기위해 여러 언어적 지원을 하고있다
          (캡슐 , 상속 , 추상화 , 다형성)
    - 자동으로 메모리 관리를 해준다
        - JVM에서 Garbage Collector이라고 불리는 데몬 쓰레드에 의해 GC(Gabage Collection)가 일어난다. GC로 인해 별도의 메모리 관리가 필요 없어
          비즈니스 로직에 집중 할 수 있다
    - 오픈소스
        - 정확하게 표현한다면 OpenJDK가 오픈소스이다.
        - 많은 오픈소스 라이브러리가 풍부하며 ,짧은 개발시간내에 안정적인 애플리케이션을 쉽게 구현할 수 있다
    - 멀티쓰레드 쉽게 구현
        - Java는 스레드 생성 , 제어와 관련된 라이브러리 API를 제공하고 있기 때문에 , 실행되는
          운영체제에 상관없이 멀티 스레드를 쉽게 구현할 수 있다

- 단점
    - 비교적 속도가 느리다
        - Java는 한번의 컴파일링으로 실행 가능한 기계어가 만들어지지 않고 JVM에 의해 기계어로 번역되고 실행되는 과정을 거치기 때문에 C , C++ 의 컴파일 단계에서
          만들어지는 완전한 기계어 보다는 속도가 느리다
    - 예외처리의 불편함
        - 프로그래머가 검사가 필요한 예외가 등장한다면 프로그래머가 선언 해줘야 한다

<br> 

### 접근 제어자

    클래스 , 메서드 , 변수 등에 대한 접근권한을 설정하는 키워드

| 접근 제어자      | 같은 클래스 | 같은 패키지 | 자식 클래스 | 전체 접근 |
|-------------|--------|--------|--------|-------|
| `public`    | O      | O      | O      | O     |
| `protected` | O      | O      | O      | X     |
| `default`   | O      | O      | X      | X     |
| `private`   | O      | X      | X      | X     |

1. public : 어디서나 접근이 가능하도록 허용
2. protected : 같은 패키지 내의 클래스 , 다른 패키지에있는 자식 클래스에서 접근이 가능
3. (default) : 같은 패키지 내의 클래스에서만 접근
4. private : 같은 클래스 내에서만 접근이 가능하도록 허용

<br>

### 데이터 타입

1. 기본 데이터 타입
    - 정수형 : byte , short , int , long
    - 실수형 : float , double
    - 논리형 : boolean
    - 문자형 : char

2. 참조 타입
    - 기본형을 제외하고는 모두 참조형
    - new 키워드를 이용해 객체를 생성해 데이터가 생성된 주소를 참조하는 타입
    - String , StringBuffer , StringBuilder , List 개인이 만든 클래스
    - String 과 배열은 참조 타입과 달리 new 없이 생성이 가능하지만 참조 타입이다

<br>

### Wrapper class

프로그램에 따라 기본타입의 데이터를 객체로 취급해야하는 경우가 있다.
기본 타입의 데이터를 그대로 사용할수 없다면 , 이떄 기본 타입의 데이터를 객체로 변환 후 작업을 수행한다

| 기본 타입     | 래퍼 클래스      |
|-----------|-------------|
| `byte`    | `Byte`      |
| `short`   | `Short`     |
| `int`     | `Integer`   |
| `long`    | `Long`      |
| `float`   | `Float`     |
| `double`  | `Double`    |
| `char`    | `Character` |
| `boolean` | `Boolean`   |

기본타입에 해당하는 데이터를 객체로 포장해 주는 클래스를 래퍼클래스 Wrapper class 라고 한다.

🔸 래퍼 클래스는 산술연산을 위해 정의된 클래스가 아니므로 , 인스턴스에 저장된 값을 변경할 수 없다 .
단지 값을 참조하기 위해 새로운 인스턴스를 생성하고 , 생성된 인스턴스의 값만을 참조한다.

<br>

### 객체지향 설계 5원칙

SOLID 원칙

1. SRP : 단일 책임원칙
    - 하나의 클래스는 하나의 책임만 가져야한다
2. OCP : 개방폐쇄 원칙
    - 확장에는 열려있고 , 변경에는 닫혀 있는다
3. LSP : 리스코프 치환
    - 자식 클래스는 언제든지 부모클래스를 대체할 수 있어야 한다
4. ISP : 인터페이스 분리
    - 자신이 사용하지 않는 인터페이스는 구현하지 않는다 , 영향을 받아서도 안된다
5. DIP : 의존 역전
    - 자주 변화하는 것보다 변화가 거의 없는 것에 의존해야한다

<br>

### 객체지향 프로그래밍 , 절차지향 프로그래밍

- 객체지향 프로그래밍
    - 실제의 물체를 객체로 표현하고 , 이들 사이의 관계 , 상호 작용을 프로그램으로 나타낸다
    - 객체를 추출하고 관계를 결정하고 , 상호작용에 필요한 메서드와 , 변수를 설계 및 구현
- 절차지향 프로그래밍
    - 실행하고자 하는 절차를 정하고 , 절차대로 프로그래밍 하는 방법
    - 목적을 달성하기 위한 일의 흐름에 중점을 둔다

<br>

### 객제지향

- 객체
    - 현실세계의 실체 및 개념을 상태 (변수) 와 행위 (메서드)로 정의한 데이터의 집합


- 객체지향 장점
    - 사람의 관점에서 프로그램을 이해하고 파악하기 쉽다
    - 강한 응집력 , 약한 결합력
    - 재사용성 , 확장성 , 융통성이 높다
- 객체지향 단점
    - 처리속도가 상대적으로 느리다
    - 객체가 상태를 갖기에 부작용이 발생할수 있다
        - 변수가 존재하고 , 변수를 통해 객체가 예측할 수 없는 상태를 갖게되어 애플리케이션 내부에서 버그를 발생

### 객체지향 특징

- 캡슐화
    - 객체의 데이터(속성)과 데이터를 조작하는 메서드를 하나로 묶은 것
    - 객체의 내부상태를 외부에서 직접 접근하지 못하도록 하고 , 객체의 상태는 객체의 메서드를 통해서만 변경될 수 있다
    - 데이터 접근제한 , 필요한 경우 메서드를 통해 접근허용
    - 정보 은닉
        - 내부의 데이터나 함수를 감추고 외부에서 필요한 정보나 기능만을 노출 하는것을 의미
            - 내부상태 , 구현 세부사항 숨김
            - private 으로 선언한 변수에 직접 접근을 제한하고 `getter` 와 `setter` 메서드를 통해서만 접근
    - 캡슐화는 변수와 메서드를 하나의 단위로 묶는 개념
    - 정보은닉은 객체의 내부구현 , 세부사항을 감추고 , 외부에는 필요한 인터페이스만 노출 `gettet`,`setter` 로만 접근

- 상속
    - 기존의 클래스로 새로운 클래스를 작성( 코드 재사용 )
    - 자손은 조상의 모든 멤버를 `상속` 받는다
    - Java에서는 클래스의 `단일 상속`만 가능하다 , `다중상속 불가능`
    - 자손의 변경은 조상에 영향을 끼치지 않는다
    - 키워드 `extends`
    ```java
        class 자식클래스 extends 조상클래스 {
  
        }
    ```

- 추상화
    - 객체에서 공통된 속성과 기능을 추출 하는 것
    - 공통속성은 변수, 상수로 , 기능은 추상메서드로 표현한다
    - `abstract` 키워드는 주로 클래스와 메서드에 붙는다 , `미완성`이 라는 뜻을 가지고 있다
    - 추상 클래스
        - 1개 이상의 추상 메서드를 포함하고 있는 클래스를 의미한다
        - 객체를 생성할수 없으며 , 상속을 통해 자식클래스에서 추상메서드를 오버라이딩을 통해 구현한다
        - <b>멤버변수 , 메서드 , static 변수 , 생성자 , 추상메서드 모두 보유할 수 있다</b>
       ```java
      public abstract class Chart{
         abstract void draw();
         String color = green;
         String color2 = red;
       }
       ```
    - 추상 메서드
        - 구현부가 없이 선언부만 있는 메서드
        - 추상메서드는 구현부가 없기에 { } 대신 끝을`;`를 적어준다
        - 메서드의 구현은 상속받은 자식클래스에서 `오버라이딩`해 메서드를 완성시킨다
      ```java
      abstract void attack();
      abstract void shield();
      ```
    - 추상 클래스 구현
    ```java
        public class LineChart extends Chart {
            
            // 부모에게 상속받은 추상클래스 재정의
            @Override
            public void draw() {
                System.out.println("그래프를 그립니다");
            } 
        } 
    ```

- 다형성
    - 하나의 객체가 여러타입을 가질수 있는것을 의미
    - 조상타입의 참조변수로 자손타입의 객체를 참조할 수 있다
      ```java
          class Tv{}
      
          class SmartTv extends Tv{}
          // 기존
          Tv t = new Tv();
          SmartTv stv = new SmartTv();
          
          Tv t = new SmartTv();
          /*
          조상타입의 참조변수로 자손타입 인스턴스 참조
          Tv 타입의 참조변수 t로 SmartTv 인스턴스의 모든 멤버를 사용할 순 없다
          Tv 클래스로부터 상속받은 멤버만 사용할 수 있다
          */
          // 자손타입 참조변수로 조상 타입 객체를 참조할 수 없다.
          SmartTv stv = new Tv();
          
       ```
    - 오버로딩 : 같은 클래스 내의 같은 이름의 메서드를 여러개 정의
        - 조건
            - 메서드 명이 같아야한다
            - 매개변수 갯수 또는 타입이 달라야한다
            - 리턴타입이 다른경우 성립되지 않는다
    - 오버라이딩 : 상속 받은 부모클래스에서 정의된 메서드를 자식 클래스에서 재정의
        - 부모 클래스의 메서드를 재정의하면 자식 클래스의 메서드가 된다
        - @Override 어노테이션을 사용 , 오버라이딩을 검증하는 기능을한다
        - 조건
            - 부모클래스의 메서드와 메서드명이 동일
            - 매개변수의 타입 , 갯수 , 순서가 일치
            - 리턴 타입이 동일
            - 접근제한자는 부모클래스의 메서드와 같거나 더 넓은 범위어야 한다

### 인터페이스 interface

- 자바에서는 클래스를 통한 다중상속은 불가능하다
- 인터페이스를 통해 `다중상속을 지원한다`
- 인터페이스는 다른 클래스를 작성시 기본이되는 틀을 제공하며 일종의 추상클래스를 의미한다
- 인터페이스는 오로지 추상메서드와 , 상수만 가능하다 ( 추상클래스는 생성자 , 변수 , 메서드 추상메서드 모두가능)
- `interface` 키워드를 사용
- 모든변수는 상수를 사용하며 , 모든 메서드는 public abstract 이어야한다
    - 모든 인터페이스의 공통으로 적용되므로 final , abstract는 `생략`할 수 있다
- 자바에서는 상속과 구현을 동시에 사용 할 수 있다

```java
class 클래스이름 extends 조상클래스이름 implements 인터페이스이름 { ......
}
```

다중상속

```java
 interface Animal {
    public abstract void cry();
}

interface Pet {
    public abstract void play();
}

class Cat implements Animal, Pet {
    public void cry() {
        System.out.println("냐옹");
    }

    public void play() {
        System.out.println("놀자");
    }
}

public class Sample {
    public void main(String[] args) {
        Cat c = new Cat();
        c.cry();
        c.play();
    }
}

```

```java
interface UserRepository {

    public static final int 상수이름 = 값;

    void insertUser(User user);

    void updateUser(User user);
}

public class UserDatabase implements UserRepository {

    @Override
    public void insertUser(User user) {

    }

    @Override
    public void updateUser(User user) {

    }
}
```

### 인터페이스와 추상 클래스의 차이점

| 특성        | 인터페이스 (Interface)                    | 추상 클래스 (Abstract Class)      |
|-----------|--------------------------------------|------------------------------|
| **다중 상속** | 여러 인터페이스를 구현할 수 있음                   | 하나의 클래스만 상속받을 수 있음           |
| **메서드**   | 추상 메서드만 가질 수 있음 (디폴트 메서드, 정적 메서드 가능) | 추상 메서드와 일반 메서드 모두 가질 수 있음    |
| **필드**    | `public static final` 필드만 가질 수 있음    | 모든 유형의 필드를 가질 수 있음           |
| **키워드**   | `interface`                          | `abstract class`             |
| **인스턴스화** | 불가능                                  | 불가능                          |
| **목적**    | 행동의 계약을 정의하고 다중 상속을 지원               | 공통된 기본 동작을 제공하고 확장을 통해 기능 추가 |

### non-static 변수 , static 변수

```java
class Card {
    // iv
    String kind; // 무늬
    int number;  // 숫자

    // cv
    static int width = 100;
    static int height = 250;
}
```

- non-static 변수 iv
    - 인스턴스 변수라고 불린다
    - 객체 생성시 인스턴스 변수가 생성된다
    - 객체마다 각각의 상태를 유지해야하는 속성의 경우 인스턴스 변수로 선언
    - 객체가 사라지면 인스턴스 변수도 사라진다
    - 객체 내에 각각의 공간을 유지하므로 공유 되지 않는다

```java
    public class Car {
    // 인스턴스 변수
    private String color;
    private String model;

    public void print() {
        System.out.println("color : " + color" , model : " + model);
    }

    public static void main(String[] args) {
        // 객체 생성
        Car car1 = new Car("Red", "Honda");
        Car car2 = new Car("Black", "BMW");
        // 인스턴스 변수 출력
        car1.print();
        car2.print();

        // 객체를 null로 설정해 객체를 소멸시킨다
        car1 = null;

        // NullPointerException 발생
        car1.print();
    }
}
```

- static 변수 cv
    - 클래스 변수라고 부른다
    - 객체 내부가 아닌 별도의 공간에 생성된다
    - 객체가 생기기 전에 이미 생성 되어있다, 객체 생성 없이 사용할 수 있다
    - 객체가 사라져도 멤버는 사라지지 않는다
    - 프로그램이 종료될 때 사라진다
    - 클래스의 인스턴스들이 공통적인 값을 유지하는 속성의 경우 클래스 변수로 선언
    - 클래스이름.클래스변수

```java
    public class Car {

    // static 변수선언 cv
    private static int carNumber = 0;

    // 인스턴스 변수 iv
    private String color;
    private String model;

    public Car(String color, String model) {
        this.color = color;
        this.model = model;
        carNumber++; // 객체 생성시 carNumber 1씩 증가
    }

    public static int getCarNumber() {
        return carNumber;
    }

    // 인스턴스 변수 값을 출력
    public void print() {
        System.out.println("Color: " + color + ", Model: " + model);
    }

    public static void main(String[] args) {

        System.out.println("Car Number : " + Car.getCarNumber()); // 0

        // 객체생성시 carNumber++;
        Car car1 = new Car("red", "HONDA");

        // iv 인스턴스 변수 출력
        car1.print(); // Colr : red , Model : HONDA 출력

        System.out.println("car1 carNumber" + Car.getCarNumber()); // 1

        Car car2 = new Car("green", "SAMSUNG");
        car2.print();
        // carNumber는 여전히 공유된다
        System.out.println("car2 carNumbr" + Car.getCarNumber()); // 2

    }
}

```

### final 키워드

- final 키워드
    - 변수나 메서드 또는 클래스가 변경이 불가능하도록 만든다
    - final 변수 = 상수
        - 변수와 마찬가지로 데이터를 저장할 수 있는 메모리 공간
        - 프로그램이 실행되는 동안 저장된 데이터를 변경할 수 없다
        - 선언과 동시에 반드시 초기화 해야한다
    - final 메서드
        - 해당 메서드를 오바라이딩 할수 없다
            - 자식클래스에서 해당 메서드를 재정의 할수 없다.
            - 상속받은 그대로 메서드를 사용해야한다

```java
class Parent {
    // final 메서드
    public final void show() {
        System.out.println("parent class");
    }
}

class Child extends Parent {
    // 부모의 final 메서드 오버라이딩
    public final void show() {
        // 컴파일 오류가 발생한다
        System.out.println("child class");
    }
}

```

### 클래스 , 인스턴스

- 클래스 class
    - 객체를 만들어 내기 위한 설계도
    - 연관되어있는 변수와 메서드의 집합
    - 객체를 정의

- 객체 Object
    - 클래스에 `인스턴스` 라고 부른다
    - 객체는 모든 인스턴스를 대표하는 포괄적인 의미
    - 실제로 존재하는것 , 사물 또는 개념
    - oop 관점에서 클래스의 타입으로 선언되었을 때 `객체`라고 부른다

- 인스턴스 Instance
    - 설계도를 바탕으로 구현된 실체

`클래스 (설계도) → ( 인스턴스화 ) → 객체 (인스턴스)`

📌 Tv 클래스를 선언 → Tv 설계도를 작성
📌 Tv 인스턴스 , 객체를 생성해야 Tv 제품을 사용할 수 있다

```java
class Tv {
    String color = "Black";

    public void On() {
        System.out.println("전원 ON");
    }

    public void Off() {
        System.out.println("전원 OFF");
    }
}

class Sample {
    public static void main(String[] args) {
        Tv t = new TV();
        t.On();
        t.Off();
    }
}
```