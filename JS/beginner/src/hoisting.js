// 아직 선언하지 않은 변수 , 함수들을 해당 스코프의 맨위로 끌어올려 사용하는 방식
// 스코프 : 범위 , 변수 혹은 함수가 갖게되는 유효 범위

// 실행되는 함수가 위에있고 , 정의한 함수가 밑에있는데도 작동됨 굿
print();

function print(){
    console.log("호이스팅 테스트");
}


console.log(num); // error 없이 undefined 출력된다
var num = 10;

console.log(num1);
let num1 = 11; // error - Cannot access 'num1' before initialization

console.log(num2);
const num2 = 15; // error

// let 과 const 로 선언된 변수는 선언전에 접근하면 에러가 발생되는거지 ?
// TDG Temporal Dead Zone _ var와 다르게 변수 Scope 의 맨위에서 변수의 초기화가 완료될 때 까지 TDG 에 존재하기에 호이스팅이 발생하지 않는 것 처럼 보인다