console.log('-----------------이어 붙이는 concat() --------------');
// 이어 붙이는 concat()
let array1 = ["초록" , "파랑"];
let array2 = ["보라" , "노랑"];
let array3 = ["초록" , "파랑" , "보라" , "노랑"];

console.log(array1.concat(array2));

console.log('-----------------문자열로 이어 붙이는 join() --------------');
// 하나의 배열에서 배열 요소들의 값들을 문자열로 이어준다
console.log(array3.join());         // 초록,파랑,보라,노랑
console.log(array3.join( " " ));    // 초록 파랑 보라 노랑


console.log("----------------- 정렬 sort () --------------------");
let colors = ["초록" , "파랑" , "보라" ];
console.log('정렬 전 : ' , colors);

console.log(colors.sort());             // [ '보라', '초록', '파랑' ]
console.log(colors.sort().join());      // 보라,초록,파랑
console.log(colors.sort().join(" "));   // 보라 초록 파랑


console.log("----------------- 내림차순 정렬 sort () --------------------");