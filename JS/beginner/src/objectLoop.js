let person = {
    name : "rltjs",
    height : 183,
    birth : 1994
};
console.log(person);

// 객체를 배열로 매개변수로 받은 person 객체의 key 들을 모두 찾아서 배열 형태로 반환 한다
let newArray = Object.keys(person);


for (let i = 0 ; i < newArray.length; i++) {
    let nowKey = newArray[i];
    console.log(`nowKey : ${nowKey} , value : ${person[nowKey]}`);
}

console.log('Object.keys = ',Object.keys(person));
console.log('Object.values = ',Object.values(person));

let newArr = Object.values(person);

// value 값 출력
console.log('------------ value 값 출력 ---------')
for(let i = 0; i  < newArr.length; i++) {
    console.log(`value : ${newArr[i]}`);
}

console.log('----------------');

console.log('객체를 배열로 변경');
let person2 = {
    name : "rltjs1234",
    height : 183,
    birth : 19940120
};

// 객체를 배열로 변경
console.log('객체를 key와value 쌍으로 반환 = ',Object.entries(person2)); // [ [ 'name', 'rltjs1234' ], [ 'height', 183 ], [ 'birth', 19940120 ] ]

//   객체를 key와value 쌍으로 배열에 담아 반환
console.log('------------ 객체를 key와value 쌍으로 배열에 담아 반환 ---------------------');
let newArray0 = Object.entries(person2);
for(let i = 0; i < newArray0.length; i++) {
    console.log(`key : ${newArray0[i][0]}, value : ${newArray0[i][1]}`);
}

console.log('------   for  of   ------------');
let sampleArr = [1,2,3,4,5];
for(let i of sampleArr) {
    console.log(i);
}

console.log('------   for  in   ------------');
let testArr = {
    name : "testName",
    age : 22,
    height : 183
}
for ( let key in testArr ) {
    console.log(`key : ${key} , value : ${testArr[key]}`);
}