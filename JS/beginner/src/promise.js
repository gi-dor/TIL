// Promise
/**
promise는 자바스크립트 비동기 처리에 사용되는 객체다 , 특정 코드의실행이 완료될 때까지 기다리지 않고 다음 코드를 먼저 수행하는
자바스트립트의 특성을 의미
주로 서버에서 받아온 데이터를 화면에 표시할 때 사용한다고 한다
 */


/**
 * Pending(대기) : 비동기 처리 로직이 아직 완료되지 않은 상태
 * Fulfilled(이행) : 비동기 처리가 완료되어 프로미스가 결과 값을 반환해준 상태
 * Rejected(실패) : 비동기 처리가 실패하거나 오류가 발생한 상태
 */

const workA = (value,callback) => {
    setTimeout( () => {
    callback(value+5);
    },5000);
};


const workB = (value,callback) => {
    setTimeout( () => {
        callback(value-3);
    },3000);
};

const workC = (value,callback) => {
    setTimeout( () => {
        callback(value+10);
    },10000);
};

const workD = (value,callback) => {
    callback(value);
};

// callback 지옥 , 꼴도 보기싫네 읽기도 힘들고
/*
workA(10,(resA)=> {
    console.log(`1. ${resA}`);
    workB(resA,(resB)=> {
        console.log(`2. ${resB}`)
        workC(resB,(resC)=> {
            console.log(`3. ${resC}`);
        });
    });
});



workD('workD',(res)=> {
    console.log(res)
});

*/

console.log('----------------------------------------------------');

// pomise 라는 이름의 변수 생성 , new 키워드를 사용해 Promise 객체 사용
const promise = new Promise();