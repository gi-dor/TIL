### 🔸 제네릭

----------

<br>

#### ❓ 제네릭 사용이유

1. 컴파일 시점에 타입을 검사할 수 있다.

```java
      // 제네릭 타입 사용 안 할 경우
public class FruitBox {
    Object[] t = new Object[10];

    public void add(Object e) {
        arr[position++] = e;
    }

    public Object[] getFruit() {
        return arr;
    }
}

    // Apple 객체가 여러개 저장되어있는 배열 생성
    Apple[] arr = {new Apple(), new Apple()};

    // 배열객체를 전달해 FruitBox객체를 생성
    FruitBox box = new FruitBox(arr);

    Apple fruit1 = (Apple) box.getFruit(0);

    // FruitBox의 배열객체에서  1번째 객체를 꺼내 Orange 객체로 형변환
    // 배열객체의 1번째에서 Apple 객체가 저장되어있다
    // 아래의 코드에서 getFruit(1)의 반환 타입이 Object이기 떄문에 Orange로 형변환 하는 코드를 작성해
    // 컴파일시 에러가 발생하지 않는다
    // 애플리케이션 실행시 실행시점에 클래스 형변환 Exception 이 발생한다

    Orange fruit2 = (Orange) box.getFruit(1);

// 형변환 까지는 에러 없이 잘되는디 
// 실행 시점에 문제가 생김.

```  

2. 불필요한 클래스 형변환이 필요 없어서 성능이 향상된다 .

```java
// 1. 제네릭을 사용하지 않는경우

class FruitBox {
    Object[] arr;

    // 생성자
    public FruitBox(Object[] arr) {
        this.arr = arr;
    }

    // getter
    public Object getFruit(int index) {
        return arr[index];
    }

}

    Apple[] arr = {new Apple(), new Apple(), new Apple()};

    // arr을 매개변수의 인자로 전달할 떄 Apple[]가 Object[] 로 형변환된다
    FruitBox box = new FruitBox(arr);

    // 0번째에 저장된 객체를 Object타입의 객체가 획득된다
    Object obj = box.getFruit(0);

    // 0번째에 저장된 객체를 꺼내 Apple 타입으로 매번 형변환 해야한다.
    Apple apple1 = (Apple) box.getFruit(0);
    Apple apple2 = (Apple) box.getFruit(1);
    Apple apple3 = (Apple) box.getFruit(2);
    Apple apple4 = (Apple) box.getFruit(3);


// 2. 제네릭을 사용하는 경우
class FruitBox<T> {
    T[] arr;

    public FruitBox(T[] arr) {
        this.arr = arr;
    }

    public T getFruit(int index) {
        return arr[index];
    }

}
    Apple[] arr = {new Apple(), new Apple(), new Apple()};
    // FruitBox 의 T가 전부 Apple 타입으로 결정한다
    // T[] arr은 Apple[] arr로 바뀜
    // arr을 생성자의 매개변수로 전달할 때 Apple[]가 그대로 전달된다.
    FruitBox<Apple> box = new FruitBox<>(arr);

    // FruitBox에서 객체를 꺼낼시 getFruit() 메서드의 반환 타입이 T에서 Apple로 변했기 때문임
    // 불필요한 형변환 없이 그대로 사용한다.
    Apple apple1 = box.getFruit(0);
    Apple apple2 = box.getFruit(1);
    Apple apple3 = box.getFruit(2);
    Apple apple4 = box.getFruit(3);

```

3. 타입의 안정성을 확보할 수 있다.

```java
// 제네릭이 적용되지 않은 ArrayList 객체
class ArrayList {
    Object[] values = new Object[10];

    public boolean add(Object o) {
        //...........
    }

    public Object get(int index) {
        //.............
    }
}

    // 모든게 에러가 안남 ;;
    ArrayList list = new ArrayList();
// 제네릭이 적용되지 않은 ArrayList 객체에는 모든 종류의 객체를 저장하는 것이 가능하다.
// ArrayList 객체에 특정한 타입의 객체만 저장되어 있다고 확신할 수 없다.
// 몇번째에 어떤 객체가 저장되어 있을지 알수 없다
                list.add("안녕");
                        list.add("이제는 안녕.");
                        list.add(101);
                        list.add(new Apple());
                        list.add(new Student());


// 제네릭이 적용된 ArrayList
class ArrayList<T> {
    T[] values;

    public boolean add(E e) {
        //...........
    }

    public Object get(int index) {
        //.............
    }
}

    ArrayList<student> list2 = new ArrayList<>();
        list.add("안녕2");                // 컴파일 오류
                list.add("이제는 진짜 안녕");      // 컴파일 오류
                list.add(101);                    // 컴파일 오류
                list.add(new Apple());            // 컴파일 오류
                list.add(new Student());          // 정상 
                list.add(new Student());          // 정상 



```

<br>

------------------------------------------------------------
<br>

#### 🔹 클래스 혹은 객체 내부에서 사용할 데이터 타입을 외부에서 지정하는 기법

- 소스코드 레벨에서 데이터 타입을 결정하는 것이 아니라 , 객체 생성 시점에 데이터 타입을 결정하게 하는 기법

````java
// 소스코드에서 데이터 타입을 결정하지 않았음.
class ArrayList<E> {
    public boolean add(E e) {
        //  .........
    }
}
    ArrayList<Student> student = new ArrayList<Student>();

````

<br>

- 인터페이스 레벨에서 데이터 타입을 결정하지 않고 , 구현하는 시점에 데이터 타입을 결정한다
- 인터페이스 구현시점에 타입을 결정

```java
import collection.Student;
import java.util.Comparator;

interface Comparator<T> {
    int compare(T o1, T o2);
}

class StudentComparator extends Comparator<Student> {
    public int compare(Student o1, Student o2) {
        return o1.getTotal() - o2.getTotal();
    }
}
```

<br>

- 제네릭 메서드는 메서드에 반환타입 앞에 타입파라미터가 정의되어 있다
- 제네릭 메서드 실행 시점에 전달받는 객체의 타입에 따라 제네릭 타입이 결정된다.

````java
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcTemplate {

    // selectOne() 메서드의 반환 타입의 매개변수로 전달받는 RowMapper 인터페이스의 제네릭 타입과 동일 
    public static <T> T selectOne(String sql, RowMapper<T> rowMapper) {
        // ......
    }

    // selectList
    // selectList() 메서드의 반환 타입의 매개변수로 전달받는 RowMapper 인터페이스의 제네릭 타입과 동일 
    public static <T> List<T> selectList(String sql, RowMapper<T> rowMapper) {
        // ......
    }
}


    public List<Job> getAllJobs() {

        // 인터페이스를 익명객체로 구현하기
        // ResultSet 객체에서 커서가 위치한 행의 데이터를 추출해 Job객체를 생성
        // 생성된 Job객체에 직업정보를 담아 반환하는 익명객체 구현했다.
        RowMapper<Job> jobRowMapper = new RowMApper<>() {
            public Job mapRow(ResultSet rs) throws SQLException {
                Job job = new Job();
                job.setId(rs.getString("job_id"));
                job.setTitle(rs.getString("job_title"));
                job.setMinSalary(rs.getInt("min_salary"));
                job.setMaxSalary(rs.getInt("max_salary"));

                return job;
            }
        }

        String sql = "select * from jobs";
        return JdbcTemplate.selectList(sql, jobRowMapper);
    }
````

<br>

-------------------------------
<br>

#### 🔹 제네릭 인터페이스 , 제네릭 클래스 정의하기

```java
interface Collection<E> {

}

class BOX<T> {

}

class Fruit {

}

class Apple extends Fruit {

}

class Orange extends Fruit {

}

    // 자식 객체를 조상타입 참조변수로 다루기 
    Fruit fruit1 = new Fruit();
    Fruit fruit2 = new Apple();
    Fruit fruit3 = new Orange();

    Fruit[] arr1 = new Fruit[3];
    Fruit[] arr2 = new Apple[3];
    Fruit[] arr3 = new Orange[4];

    BOX<Fruit> box = new BOX<Fruit>();
    BOX<Fruit> box1 = new BOX<Apple>();     // error
    BOX<Fruit> box2 = new BOX<Orange>();   // error
// 타입 파라미터에 지정된 타입간의 클래스 형변환은 지원하지 않는다


    BOX<?> box = new BOX<Fruit>();
    BOX<?> box = new BOX<Apple>();
    BOX<?> box = new BOX<Student>();

    BOX<? extends Fruit> box1 = new BOX<Fruit>();
    BOX<? extends Fruit> box2 = new BOX<Apple>();
    BOX<? extends Fruit> box3 = new BOX<Orange>();
    BOX<? extends Fruit> box3 = new BOX<Student>();    // error Fruit으로 상속 X


    BOX<? super Orange> box3 = new BOX<Orange>();
    BOX<? super Orange> box3 = new BOX<Apple>();   // error Apple , Student 모두  
    BOX<? super Orange> box3 = new BOX<Student>();   // error  Orange에 상위가 아님



```