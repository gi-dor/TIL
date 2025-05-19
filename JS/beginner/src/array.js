// 객체 - 한번에 여러개의 데이터 값들을 저장하는 자료형

// 배열 - 순서가 있는 요소들 집합 , 여러개 항목이 모여있는 리스트
let arrSample = [];
console.log(arrSample);

let arrSample2 = [1,2,3];
let arrSample4 = [3];
console.log(arrSample2);
console.log(arrSample4);

let arrSample3 = new Array();
console.log(arrSample3);

let array1 = new Array(1,2,3,4);
let array2 = new Array(3);

console.log(array1); // [1,2,3,4]
console.log(array2); // [undefined,undefined ,undefined]
console.log();

let arrTest = [
    {
        name : "기선",
        birth : 1994
    },
        "array",
        function(){
            console.log("hello world");
        },
        null,
        undefined
]

console.log(arrTest);
console.log('-----------------');
console.log(arrTest[0]);
console.log(arrTest[1]);
console.log(arrTest[2]);
console.log(arrTest[3]);
console.log(arrTest[4]);

console.log('--------------');

arrTest.push(11);
console.log(arrTest);
arrTest.unshift(10101);
console.log(arrTest);

console.log('--------------');
arrTest[0] = 19;
arrTest[2] = undefined;
console.log(arrTest);

console.log('--------------');
const testArr = [
    {
        name : "기선",
        birth : 1994
    },
    "array",
    null,
    undefined
]

console.log(testArr);  // [ { name: '기선', birth: 1994 }, 'array', null, undefined ]

testArr[1] = null;
testArr[2] = 19;
console.log(testArr); // [ { name: '기선', birth: 1994 }, null, 19, undefined ]

testArr.pop();
console.log(testArr);
console.log(testArr.length);

testArr.shift();
console.log(testArr);

console.log(testArr.length);
