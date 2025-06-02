// 동기
/**
 *  하나의 작업이 실행되는 동안에는 다른 작업을 한번에,같이,동시에 진행하지 않는 방식
 *  앞의 작업이 종료된 이후 다음 작업을 진행 하는 순차적방식
 */

/**
 * A작업---------->끝
 * B작업           --------------->끝
 * C작업                           --------------------->끝
 */



// 비동기
/**
 *
 */

/**
 * A작업---------->끝
 * B작업         --------------->끝
 * C작업     ------------>끝
 */

// 매개변수 전달받은 시간만큼 기다렸다가 매개변수로 전달받은 callback 함수를 실행
setTimeout(() => {
    console.log('1초대기')
},1000);


console.log('종료'); // setTimeout 함수에 3초대기 문장이 아닌 종료 문장이 먼저 실행되었다
/**
 *  setTimeout 함수가 비동기 함수이기 떄문에 함수안에있는 콜백 함수가 실행이 종료될때 까지 3초를 기다리지 않고
 *  바로 아래에있는   console.log(종료) 가 실행되기 때문이다
 */

console.log( ' ------------------------------- ');

const workA = () => {
    setTimeout(()=> {
        console.log('workA');
    }, 5000)
};

const workB = () => {
    setTimeout(()=> {
        console.log('workB');
    }, 3000)
};

const workC = () => {
    setTimeout(()=> {
        console.log('workC');
    }, 7000)
};

const workD = () =>{
    console.log('workD');
}

workA();
workB();
workC()
workD();

/**
 * 종료
 *  -------------------------------
 * workD
 * 1초대기
 * workB
 * workA
 * workC
 */