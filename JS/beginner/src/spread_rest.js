// spread
const toy = {
    type: "bear",
    price : 150000
};

// color 라는 key 값을 갖는 property
const blueToy0 = {
    type: "bear",
    price : 150000,
    color : "blue"
};

const yellowToy0 = {
    type: "bear",
    price : 150000,
    color : "yellow"
};

// type 과 price 가 반복되어 ...spread 를 사용
const blueToy = {
    ...toy,
    color : "blue"
};
const yellowToy = {
    ...toy,
    color : "yellow"
};

console.log(blueToy);
console.log(yellowToy);

const color1 = ["red","orange","yellow"];
const color2 = ["blue","navy","purple"];

const rainbow = [...color1, "green", ...color2];
console.log(rainbow);
// 배열이나 객체에서 반복적인 부분을 점... 3개를 사용해 퍼트릴수 있고 여러번 사용할 수 있다


//rest - 나머지 매개변수
console.log('rest --------------');
const blueToy2 = {
    type: "bear",
    price: 11111,
    color: "blue"
};

const {type, ...rest} = blueToy2;

console.log(type);
console.log(rest);

console.log('-------------------     2');

const color3 = ["red","orange","yellow","green"];
const [c1,c2,...rest1] = color3;
console.log(c1,c2);
console.log(rest1);

console.log('--------------------------- 3');

const print = (a,b,...rest) => {
    console.log([a,b,rest]);
};
print(1,2,3,4,5,6); // [ 1, 2, [ 3, 4, 5, 6 ] ]


const print2 = (a,b,c,d,e,f,g,h) => {
    console.log(a,b,d);
}
print2(2,3,4,5,6,7,8,9); // 2 3 5

console.log('--------------------------- 4');
const numbers = [1,2,3,4,5,6];
const print3 = (a,b,c,d,e,f) => {
    console.log(a,b,c,d,e,f);
}
print3(numbers[0],numbers[1],numbers[2],numbers[3],numbers[4],numbers[5]);


const numbers1 = [1,2,3,4,5,6];
const print4 = (a,b,c,d,e,f) => {
    console.log(a,b,c,d,e,f);
}
// numbers1 배열 요소를 spread 문법으로
// 인수로 많은 값을 넘겨줄 때 사용
print4(...numbers1);

// 요소가 늘어나거나 적어질때
const numbers2 = [1,2,3,4,5,6];

const print5 = (...rest) => {
    console.log(rest);
}
print5(...numbers2);



