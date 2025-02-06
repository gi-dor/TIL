console.log('선택')
const myButton = document.querySelector('#myButton');
myButton;

console.log(' addEventListener ');

// 첫번째 인자로 주어진 이벤트에 , 두번째 인자로 주어진 메서드의 동작을 부여 한다
// 콜백함수

// click , function()  사용자가 클릭했을 때 해야할 동작을 function을 넣었음

// mybutton을 클릭했으면 function을 실행해 console.log()를 실행 한다
myButton.addEventListener('click', function () {
    console.log('클릭');
})


console.log('마우스 클릭 이벤트')

console.log();
console.log('----  function() 이 아닌 =>  화살표로 표현할 수 있다 -----------');
const logMouseEnter = () => {
    console.log('진입');
};
const logMouseLeave = () => {
    console.log('이탈');
};

// jquery 이미 명시되어있는 mouseenter , mouseleave
myButton.addEventListener('mouseenter', logMouseEnter);
myButton.addEventListener('mouseleave', logMouseLeave);


console.log();
console.log('---------  이벤트  객체  ---------------');
// addEventListener 의 콜백함수의 인자에 매개변수로 포함된다
const clickPosition = document.querySelector('#clickPosition');
clickPosition.addEventListener('click', function (e) {
    console.log(e);
})