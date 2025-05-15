// SCOPE
// 범위 , 변수 혹은 함수가 갖게되는 유효 범위
// 전역스코프 , 지역스코프 , 함수 스코프 , 블럭 스코프 { }


// 전역스코프 - 어디서든 해당 변수에 접근

// 지역스코프 - 함수 지역을 벗어난 곳에서는 접근 불가


const num = 10;  // 전역 스코프

function print() {
    const num = 100; // 지역 스코프
    console.log(`지역 스코프 : ${num}`);
}
print();
console.log(`전역 스코프 : ${num}`);

console.log('---------------------------');

function print2() {
    for(let i = 0; i < 10; i++) {
        console.log(`블럭 스코프 : ${i}`);
    }
   // console.log(i);  ERROR  let 이 블럭 스코프 이기 때문에 ERROR 발생 , var를 사용
}
print2();

console.log('-----------------------------');

// let 과 var
let num1 = 10;
var num2 = 20;

num1 = 100;
num2 = 200;

// 서로 유사함
console.log(num1);
console.log(num2);

// var 를 사용해 같은 이름의 변수를 선언하면 기존 변수는 무시된다
// 코드가 길어지면 해당 변수가 어디에 선언되었는지 알기 어려우며  어디서 어떻게 사용되는지 파악 힘들어 진다.

// var 는 함수 스코프 , let는 블럭 스코프
var num3 = 30;
var num3 = 40;

console.log(num3); // 40

let num4 = 11;
let num4 = 111;

console.log(num4);
