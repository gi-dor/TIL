/**
 * Java 와 마찬가지로 네이밍 컨벤션이 존재
 * 1 ) camelCase - 대부분의 언어에서 사용 , sampleTest , testLanguage
 * 2 ) snake_case - 단어끼리 _ 언더스코어로 묶음 sample_test , naming_convetion
 * 3 ) PascalCase - 첫번째 글자에 대문자를 이용, ClassName , C# 마이크로소프트 계열 언어에서 주로 사용
 */

const hanGiSeon = '한기선';
console.log(hanGiSeon);

const han_gi_seon = '한_기_선';
console.log(han_gi_seon);

/**
 * Data Type
 * 
 * 1 ) Number 
 * 2 ) String 문자열
 * 3 ) Boolean 
 * 4 ) undefined
 * 5 ) null 
 * 6 ) Symbol
 * 7 ) Object
 *      function
 *      array
 *      object
*/

const age = 31;
const temp = -19;
const pi = 3.14;

console.log(typeof(age))
console.log(typeof(temp))
console.log(typeof(pi))
console.log('================')

const infinity = Infinity;
const uInfinity = -Infinity;

console.log(typeof(infinity));
console.log(typeof(uInfinity));

/**
 * String 타입
 */
const cod = '팩토링';
console.log('타입 = ' + typeof(cod));

/**
 *  Template Literal
 * 1 ) new Line -> \n
 * 2 ) tab -> \t
 * 3 ) 백슬래시를 string으로 표현 
 * 4 ) 백틱 ` 을 사용 하고 내부에 ${}를 사용해 변수 또는 표현식을 쉽게 삽입
 *  const name = "기선";
    console.log(`안녕하세요, ${name}입니다!`);
 */
const samplevar = '한\n기선';
console.log(samplevar);

const samplevar2 = '한\t기선';
console.log(samplevar2);

const backSlash = '한\\기선';
console.log(backSlash);

const smallVar = '한기선\'rltjs';
console.log(smallVar);

const giseon = `한han
기선`;
console.log(giseon); 


const groupNameing = 'testName';
console.log(groupNameing + '테스트명');
 
console.log(`${groupNameing}`);

const isTrue = true;
const isFalse = false;
console.log(isTrue)
console.log(isFalse);

console.log('-------------------')
console.log(typeof(isTrue));
console.log(typeof(isFalse));
console.log(typeof isTrue);
console.log(typeof isFalse);
console.log('-------------------')

/**
 *  undefined
 * 사용자가 직접 값을 초기화 하지 않았다
 */

let nothing;
console.log(nothing);
console.log('nothing 타입 : '+typeof nothing);
console.log('---------------')
/**
 * Symbol
 * 
 * 유일무이한 값을 생성할 떄 사용
 * 다른 프리미티브 값들과 다르게 Symbol 함수르 호출해서 사용
 */

const test1 = '1';
const test2 = '1';

console.log(test1 === test2);

const symbol1 = Symbol('1');
const symbol2 = Symbol('1');

console.log(symbol1 === symbol2);
console.log('----------------------')
/**
 * Object 타입
 * Map key : value 쌍으로 이루어짐
 */

const dictionary = {
    red:'빨간색',  
    orange :'주황색',
    yellow : '노란색' 
}
console.log(dictionary);

console.log(dictionary['red']);
console.log(dictionary['orange']);
console.log(dictionary['yellow']);

console.log(typeof dictionary);
console.log('-------------------')


/**
 * Array 타입
 * 값을 리스트로 나열할 수 있는 타입
 * 
 */
const inMemberArray = [
    '가을',
    '겨울',
    '봄',
    '여름'
]

console.log(inMemberArray);

/**
 * Index
 */
console.log(inMemberArray[0]);
console.log(inMemberArray[3]);

inMemberArray[1] = '변경Array';
console.log(inMemberArray);
console.log(inMemberArray[1]);
console.log(typeof inMemberArray);

/**
 * satic typing -> 변수를 선언할 때 이떤타입의 변수를 선언할지  명시
 * dynamic typing -> 변수의 타입을 명시적으로 선언하지 않고 값에의해  타입을 '추론'한다
 * JS -> dynamic typing
 */
