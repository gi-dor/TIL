// 같은 동작을 하는 코드를 하나로 묶어서 호출해서 사용하기 위함

let num1  = 10;
let num2 = 20;
let sum = num1 + num2;

console.log(sum);

function add(num1, num2){
    console.log(num1 + num2 );
}

add(10,15);

function add2(num1 , num2){
    return num1 + num2;
    // return 문으로 인해 함수를 벗어나므로 밑에 console.log()는 실행 되지 않는다
    // early return pattern
    console.log("함수호출");
}

console.log(`두 수를 더한 결과는 ${add2(17 , 20)} 입니다`);


console.log("-------------------------");

// early return 적용 전 코드가 길고 지저분하고 한번에 알아보기 힘들다
function func(num){
    if(num > 0) {
        if( num >= 10 ) {
            console.log("num 의 값이 10보다 크거나 같다")
        } else {
            console.log("num 의 값이 0보다 크고 10보다는 작다")
        }
    } else if ( num === 0) {
        console.log("num 의 값이 0 이다");
    } else {
        console.log("num 의 값이 0 보다 작다");
    }
}

func(11)
console.log("--------------------------------");

function func2(num) {
    if(num === 0 ) return "num 의 값이 0 이다";
    if(num < 0 ) return  "num 의 값이 0보다 작다"
    if(num >= 10 ) return "num 의 값이 10보다 크거나 같다";
    return "num 의 값이 0 보다 크고 , 10보다는 작다"
}

console.log(func2(1));

console.log("-------------- 즉시 실행 함수 -------------");



function print() {
    console.log("JS CH1");
}

print();

(function() {
    console.log("JS CH02");
})();


function func3() {
    console.log("3");
    console.log("4");
}

console.log("1");
console.log("2");
func3();
console.log("4");