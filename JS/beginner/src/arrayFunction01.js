let arr = [1, 2, 3, 4, 5];
for (let i = 0; i < arr.length; i++) {
    console.log(arr[i]);
}

console.log('--------- 인덱스 번째 요소 element , 배열요소의 인덱스를 출력할 수 있는 idx ---------------------')

// 선택적 매개변수 idx
arr.forEach((element, idx) => {
    console.log(`${idx}번째 요소는${element} 입니다`)
});

console.log('------------------------------')

// Array 매개변수는 콜백 함수의 3번째 매개변수로 , arr 배열 자체가 출력된다.
arr.forEach((element, idx , array) => {
    console.log(`${idx}번째 요소는${element} 입니다`)
    console.log(array);
});

console.log('------------------------------')
// map 내장함수
let newArr = [];
for(let i = 0; i<arr.length; i++){
    newArr.push(arr[i] * 10);
}

console.log(newArr);


console.log('----------------   map()   --------------')
// map을 사용
let newArray = arr.map((element)=> {
    return element * 10;
});

console.log(newArray);

// map은 currentValue , idx , array 순서로 3가지 매개변수를 전단할 수 있다
console.log('------------------------------')
let colors = ["초록" , "파랑" , "보라"];

// 배열에서 특정 인덱스에 해당하는 요소 찾기
console.log(colors[2]);

console.log('-------------   at()    -----------------')
// 배열내에 많은 양이 들어있다면 ? at 내장함수를 작성해 매개변수로 배열의 인덱스를 넘겨주면
// 그 매개변수에 해당하는 인덱스에 배열 요소가 출력된다
console.log(colors.at(1));

// -1을 매개변수로 사용하면 항상 배열의 마지막 값을 반환 하게된다
console.log(colors.at(-1));

console.log('---------------  includes()  ---------------')
// includes 메서드는 매개변수로 받은 요소를 배열이 포함하고 있는지 판별하며 boolean 값으로 반환한다
console.log(colors.includes("노랑")); // false
console.log(colors.includes("파랑")); // true

// 찾을 배열요소의 값이 적힌 매개변수의 오른쪽에 배열의 인덱스를 작성
// 2번째 값부터 파랑이 있는지 검사
console.log(colors.includes("파랑",2)); // false
// 첫번째 값부터 파랑이 있는지 검사
console.log(colors.includes("파랑",1)); // true


console.log('------------  indexOf   -------------');
// 특정값을 지닌 요소가 몇번째 위치해 있는지 찾아줌
console.log(colors.indexOf("보라")); // 2 : 2번째 인덱스에 있다
console.log(colors.indexOf("노랑")); // -1 : 존재 하지 않기에 -1 값이 출력된다.



console.log('------------  findIndex   -------------');
let color = [
    {id:1, color:"초록"},
    {id:2, color:"파랑"},
    {id:3, color:"보라"},
    {id:4, color:"노랑"}
];

let idx = color.findIndex((element)=> element.color === "보라");
console.log(idx);

color.findIndex((element,idx,array) =>
    console.log(`${idx} 번째 값은 id : ${element.id} , color : ${element.color}`));
color.findIndex((element,idx,array) => console.log(array));

console.log('------------  find()   -------------');
// 찾아낸 값 그 자체를 반환한다 , INDEX 반환 XXXXXX

let sample = color.find((element)=> element.color === "파랑");
console.log(sample);

console.log('------------ filter --------------');
// filter 함수는 조건에 맞는 모든 값들을 새로운 배열에 담아서 반환
let filterArray = color.filter((element , idx , array) => element.id > 1);
console.log(filterArray);

console.log('-------------  slice () ---------');
// 특정 배열을 원하는 부분만 잘라서 가져온다
// id 값이 4 , color가 YELLOW 값을 추가
let sliceArray = colors.slice(1,3);   //  slice(start?: number, end?: number): T[];

console.log(sliceArray); // [ '파랑', '보라' ]

