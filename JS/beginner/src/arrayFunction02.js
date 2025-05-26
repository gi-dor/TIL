console.log('-----------------이어 붙이는 concat() --------------');
// 이어 붙이는 concat()
let array1 = ["초록", "파랑"];
let array2 = ["보라", "노랑"];
let array3 = ["초록", "파랑", "보라", "노랑"];

console.log(array1.concat(array2));

console.log('-----------------문자열로 이어 붙이는 join() --------------');
// 하나의 배열에서 배열 요소들의 값들을 문자열로 이어준다
console.log(array3.join());         // 초록,파랑,보라,노랑
console.log(array3.join(" "));    // 초록 파랑 보라 노랑


console.log("----------------- 정렬 sort () --------------------");
let colors = ["초록", "파랑", "보라"];
console.log('정렬 전 : ', colors);

console.log(colors.sort());             // [ '보라', '초록', '파랑' ]
console.log(colors.sort().join());      // 보라,초록,파랑
console.log(colors.sort().join(" "));   // 보라 초록 파랑


console.log("----------------- 내림차순 정렬 compare () --------------------");

const compare1 = (a, b) => {
    if (a > b) return -1;
    else if (a < b) return 1;
    else return 0;
}
let color1 = ["초록", "파랑", "노랑"]
color1.sort(compare1)
console.log(color1)


function compare2(a, b) {
    if (a > b) return -1;
    else if (a < b) return 1;
    else return 0;
}

let color2 = ["초록", "파랑", "노랑"];
color2.sort(compare2);
console.log(color2);

const compare3 = (a, b) => {
    return a - b;
}

let numbers1 = [1, 100, 25, 60, 120, 3];
numbers1.sort(compare3);
console.log(numbers1);

const compare4 = (a, b) => {
    return b - a;
}
numbers1.sort(compare4);
console.log(numbers1);

let numbers2 = [1, 100, 25, 50];
let sum = 0;
numbers2.forEach((element) => {
    sum += element;
})
console.log(sum);


console.log("------------ isArray ------------");
let a = Array.isArray([1, 1090, 22, 432]);
let b = Array.isArray({id: 1, color: "green"});
let c = Array.isArray("string");
let d = Array.isArray(undefined);
console.log(a);
console.log(b);
console.log(c);
console.log(d);
