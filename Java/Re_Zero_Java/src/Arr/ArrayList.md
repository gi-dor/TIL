### ArrayList와 배열의 차이

<Br>

#### Array
- 하나의 변수에 여러값 저장
- 각 값들은 인덱스를 사용해 접근
- 모든 값은 동일한 자료형 
- 선언시 지정된 길이 변경불가

---

#### ArrayList
- 하나의 변수에 여러값 저장 
- 각 값들은 인덱스를 사용해 저장 
- 다양한 자료형의 값 저장가능 
- 자유롭게 값 추가 가능

<br>

개발자들에게 편리한 사용제공을 위해 Java에서 기본 생성
 
    import java.util.ArrayList;

<Br>

#### 객체 생성
    ArrayList al = new ArrayList();
<br>
    
#### 값 추가
    // add() 메서드
    al.add("기선");
    al.add(30);
    al.add(1994);

#### 값 접근

    al.get(0);  // 기선
    al.get(1);  // 30
    al.get(2);  // 1994