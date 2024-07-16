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
    