package String01;

import java.util.Arrays;

public class StringJoinerApp {

    public static void main(String[] args) {

        // join() 은 여러 문자열 사이에 구분자를 넣어서 결합한다

        // 구분자로 ,
        String animals = "dog,cat,bear";

        String[] arr = animals.split(",");

        String str = String.join("/", arr);
        System.out.println(str);

        String[] arr2 = str.split("/");
        // 배열에 제대로 저장되었는지 확인하려고
        //arr2.toString() 하게되면 해시주소 ? 해시코드만뜸 주의하도록
        System.out.println("배열에 제대로 들어왔는지 확인" + Arrays.toString(arr2));

        // StringBuffer로 문자열 위에거 출력해보기
        StringBuffer stb = new StringBuffer("stringBuffer로 문자열 출력해보기");
        stb.append(Arrays.toString(arr2));
        System.out.println(stb);
        /**
         * 솔직히 StringBuffer가 뭐 메모리 낭비가 안하네 뭐네 좋다지만
         * StringBuffer 객체를 만들고  .append() 메서드를 써서 다시 참조변수에 담고
         * 그걸 다시 참조변수로 출력하고 여간귀찮네
         */

        String str2 = String.join("-", arr2);
        System.out.println(str2);

    }
}
