const x = 10;

// %는 나눈고 남은 나머지를 구하는 연산 식이다 나머지 값이 있다면 true , 나머지 값이 0 이라면 false
if (x % 4) {
    // 나눈 나머지가 0이 아니기에 진입
    if (x % 2) {
        // x를 2로 나눈 나머지가 0이 아니라면
        console.log(' 홀수 ')
    } else {
        // x 를 2로 나눈 나머지 값이 0 이라면 false 이기에
        console.log(' 짝수 ')
    }
} else {
    // x를 4로 나눈 나머지 값이 0
    console.log(' 4의 배수 ')
}


console.log()
console.log("---------------------")

const a = 1;
const b = 2;

if (a < b) {
    console.log('a가 b보다 작음')
} else if (a > b) {
    console.log('a가 b보다 크다')
} else {
    console.log('a 와 b는 같다')
}

console.log()
console.log('----------------------------------')

const test = '솔'

if (test === '도') {
    console.log('1칸전진')
} else if (test === '레') {
    console.log('2칸 전진')
} else if (test === '미') {
    console.log('3칸 전진')
} else if (test === '파') {
    console.log('4칸 전진')
} else {
    console.log('알아서 전진 하십쇼')
}

console.log()

console.log('switch 문으로 변경')
const test2 = '미';

switch (test2) {
    case '도':
        console.log('1칸 전진');
        break;
    case '레':
        console.log('2칸 전진');
        break;
    case '미':
        console.log('3칸 전진');
        break;
    case '파':
        console.log('4칸 전진');
        break;
    default:
        console.log('알아서 전진 하십쇼');
        break;
}

console.log(test2);
console.log()
console.log('---------------------------')

const power = 4;
switch (power) {
    case 1:
        console.log('1번');
        break;
    case 2:
        console.log('2번')
        break;
    case 3:
        console.log('3번')
        break;
    default:
        console.log('그외 값')
}

console.log();
const sample = '걸'

// break 문이 없기에 해당하는 문장을 실행 하고 그 이후 문장까지 실행하게된다.
switch (sample) {
    case '모':
        console.log('모 , 1칸')
    case '윷':
        console.log('윷 , 2칸')
    case '걸':
        console.log('걸 , 3칸')
    case '개' :
        console.log('개 , 4칸')
    default:
        console.log('무효')
}

console.log()
console.log('------------------------')

for (let i = 10; i > 0; i--) {
    console.log(i)
}

console.log()

for (let i = 10; i > 0; i -= 2) {
    console.log(i)
}

let sum = 0;

for (let j = 1; j <= 100; j++) {
    sum += j;
}

console.log(sum)

for (let j = 1; j <= 100; j++) {
    sum += j;
    if (sum >= 100) {
        break;
    }
}

console.log(sum)
console.log('-------------------')

for (let i = 0; i < 100; i++) {
    // continue를 사용해 해당하는 문장만 건너띄게 한다
    if (i % 3 === 0) continue;
    if (i > 10) break;
    console.log(i);
}
console.log('-------------------')
console.log('배열에있는 요소를 하나씩 출력해보자')
// 배열에있는 요소를 하나씩 출력해보자
const myArray = ['1번', '2번', '3번', '4번'];
for (let i = 0; i < myArray.length; i++) {
    console.log(myArray[i]);
}
console.log()

// for...of 문
console.log('배열의 요소를 순서대로 반환한다 for...of 문--------------------')
for (const item of myArray) {
    console.log(item);
}

console.log()
console.log('객체의 key 들을 순서대로 반환하는 for...in문----------------')
// value 아님 , 주의

// for...in문
const person = {
    name: 'rltjs',
    age: 32,
    married: false
}

// key는 객체의 속성 이름이므로, 객체 속성의 이름이 항상 문자열로 반환
console.log('값들이 아닌 key들의 자료 형이고 ,  객체의 속성 이름이므로, 객체 속성의 이름이 항상 문자열로 반환')

for (const key in person) {
    console.log(key, typeof key)
}
console.log()


// 객체의 value값이 궁금해
console.log('객채의 value값이 궁금해 , 객체의 값에 접근하기')
for (const key in person) {
    console.log(person[key])
}

console.log()

console.log('속성의 값이 궁금해 ----------------------------- ')
for (const key in person) {
    console.log(key, person[key], typeof person[key]);
}


console.log('---------------------------------------')

for (const key in person) {
    console.log(person.key);
}

for (const key in person) {
    940
    console.log(person.name);
}


console.log()
console.log('-------------  while ------------------')
// 괄호 안의 조건이 참인동안 반복한다
// 선 확인 , 후 조취

let y = 0;
while (y < 10) {
    console.log(y++);
}
console.log()
console.log('z 를 3으로 나눈 나머지 값이 0 이므로 continue가 발생해서 z++가 실행되지 않고  다음 반복으로 넘어가기에 무한반복이 실행된다')

// z 를 3으로 나눈 나머지 값이 0 이므로 continue가 발생해서 z++가 실행되지 않고  다음 반복으로 넘어가기에 무한반복이 실행된다
/*
let z = 0;
while (z < 10) {
    if (z % 3 === 0) continue;
    console.log(z++);
}
*/


console.log()
console.log('------------  do - while ----------------')
// 선조취 , 후 확인

let xx = 12;
do {
    console.log(++xx);
} while (xx < 10)

// 일단 ++xx 로 인해 +1의 값이 더해진 13이 출력되고 나서 while 문에서 조건식을 살펴서 진행 여부를 결정
console.log()

let xxx = 5;
do {
    console.log(xxx++);
} while (x < 10);