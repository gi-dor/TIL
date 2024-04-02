#### 기본 API

JRE System Library

+ 설치 하지 않아도 자바 설치시 자동으로 설치됨

+ 자주 사용하는 프로그램들을 모아둠
    - 이것을 API 혹은 라이브러리 라고 칭함
+ 대표적인것 java.util , java.lang , java.text

java.lang 패키지는 import 하지 않아도 사용 가능한 패키지

Ex - String , System , Object 클래스

- 모든 클래스의 최상위 클래스가 Object
- 모든 클래스는 Object의 자손클래스
    - 필드는 존재하지 않고 11개의 메서드만 존재한다

            equals(Object obj)  // 같은 객체인지 비교
            hashCode()          // 해시코드 리턴
            toString()          // 문자열 정보 리턴
            clone()             // 복제한 객체 리턴
            finalize()          // 객체 소멸시 실행
            getClass()          // 클래스 정보 리턴
                        ........
