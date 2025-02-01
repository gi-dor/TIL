// function , 함수 ?
/*
반복될 수 있는 작업을 정의한다
input을 받아서 output을 반환하기
 */

console.log('html사용')
console.log('css로 꾸미기')
console.log('JS로 움직이기')

console.log('-------------------')

function htmlCssJs() {
    console.log('html사용')
    console.log('css로 꾸미기')
    console.log('JS로 움직이기')
}

htmlCssJs();
console.log('-------------------')
console.log('매개변수와 , 인자 ')

// 특정 input 값을 받아서 작업을하는 함수들에 사용

// to : 매개변수
function countTo(to) {
    for (let i = 1; i <= to; i++) {
        console.log(i);
    }
}

// countTo : 인자
countTo(5);
console.log()
countTo(7);

console.log('--------------------')
console.log('값을 반환하는 함수')
// return : 함수가 해당하는 값을 반환함 , 뱉어냄
// 마지막에 작성하기

function add(x, y) {
    return x + y;
}

console.log(add(2, 4));
console.log(
    // add13,add17
    // add(13,17)
    add(add(6, 7), add(8, 9))
)

console.log()
console.log('--------------------------')
console.log('함수 또한 값이다')
// 변수 , 상수에 객체의 값이나 , 배열의 요소로 다른 함수의 인자로 넣을수 있음

const subt = function (x, y) {
    return x - y;
}

console.log(subt(7, 2));

console.log()
console.log('화살표 함수')
// function으로 정의한 함수와는 세부적으로 기능이 다르다고함

// function이 없고 매개변수를 담고 화살표가 있다 , 그 뒤에 반환하는 값이 있다
const arrowFunc = (x, y) => x * y;

console.log(arrowFunc(2, 7))
console.log()

// return 문에 { } 확인
const arrowFunction = (x, y) => {
    console.log(`${x} 와 ${y}를 곱한다`);
    console.log(`그 결과 값은 ${x * y} `);
    return x * y;
}

console.log(arrowFunction(2, 7))

