/**
 *  1) var - 더이상 쓰지 않음
 *  2) let
 *  3) const
 */

var name = '기선';
console.log('기선');
console.log(name);

var age = 31;
console.log(age);

/**
 * let 과 var로 선언하게되면
 * 값을 추후에 변경할 수 있다
 */

const newMember = '새멤버';
console.log(newMember);

// newMember = '2번째멤버';
/**
 * 변수 명을 지을때는
 * 1 ) 일반적으로 영어를 사용하며 , 문자와 숫자 모두 사용할 수 있다
 * 2 ) 특수 기호는 언더스코어_ 와 달러$ 를 사용할 수 있다
 * 3 ) 숫자로 이름을 시작할 수는 없다
 *    1Name , 17age
 * 4 ) 키워드는 변수명으로 사용할 수 없다
 *     var var = 'abc';
 *     let const = '12345';
 */

let codeRefactor = '리팩토링';
let $variable = '변수선언';

console.log(codeRefactor);
console.log($variable);

