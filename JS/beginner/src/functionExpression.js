// 함수 선언식
// 호이스팅
print();
function print() {
    console.log("기존 function");
}

// 함수 표현식
// 호이스팅 X

// printf(); //  printf is not a function
 let printf = function() {
    console.log("함수표현식 방법");
}

// 화살표형 함수
// 호이스팅 대상 아님
const println = () => {
     console.log("화살표 함수 입니다");
}
println();

// 콜백함수 - 다른 함수에 매개변수로 넘겨준 함수
// 함수를 값처럼 전달
function start(name , callback) {
    console.log(`안녕 반갑다 나는 ${name} 이다`);
    callback();
}

function finish() {
    console.log("그래 고맙고 수고해 ");
}

// 매개변수로 finish() 가 아닌 매개변수로 넘기기에 finish로 써야한다
start("giseon", finish);