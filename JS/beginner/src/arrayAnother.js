// let colors = ["green" , "blue" , "purple"];


// let c1 = colors[0];
// let c2 = colors[1];
// let c3 = colors[2];

// let [c1,c2,c3] = colors

// 선언 분리 할당
// let c1, c2 , c3;
// [c1,c2,c3] = ["green" , "blue" , "purple"];

let c11, c22 , c33 ,c44;
// yellow 직접 기본값 할당 -> undefined => yellow
[c11,c22,c33,c44 = "yellow"] = ["green" , "blue" , "purple"];

console.log(c11);
console.log(c22);
console.log(c33);
console.log(c44); // undefined

let a = 10;
let b = 20;
let tmp;

// tmp = a;
// a = b;
// b = tmp;

[a,b] = [b,a];

console.log(a);
console.log(b);

console.log('-------------------------');

let color = {
    c1 : "green",
    c2 : "blue",
    c3 : "purple"
};

// let c1 = color.c1;
// let c2 = color.c2;
// let c3 = color.c3;

// let c1 =color.c1;
// let c2 = color.c2;
// let c3 = color.c3;

// let { c1 : cc1 , c2: cc2 , c3: cc3} = color;

let { c1, c2 , c3 , c4 = "yellow"} = color;

console.log(c1);
console.log(c2);
console.log(c3);
console.log(c4); // undefined