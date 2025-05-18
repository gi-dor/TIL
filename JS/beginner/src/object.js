let person = {}

console.log(person);

let person2 = {
    name: "sampleName",
    age: 30,
    birth: 1994,
    pet: "cat"
};

console.log(person2);
console.log(person2.name);
console.log(person.name) //undefined
console.log(person2["name"])
console.log(person2["pet"]);

// 객체의 key 값이 고정적이지 않을 때 특정함수의 매개변수로 결정하거나 , 동적일 경우
const getValue = (key) => {
    console.log(person2[key]);
}
getValue("name");

person2.phone = "010-9999-8888";
person2.height = 183;

console.log(person2);
/*
{
  name: 'sampleName',
  age: 30,
  birth: 1994,
  pet: 'cat',
  phone: '010-9999-8888',
  height: 183
}
 */

// age -> 20 , pet -> dog
person2.age = 20;
person2["pet"] = "dog";
// 객체의 property 값은 const로 선언한 객체여도 값을 변경할 수 있다
console.log(person2);

const person3 = {
    name: "sampleName",
    age: 30,
    birth: 1994,
    pet: "cat"
}
console.log(person3);
// { name: 'sampleName', age: 30, birth: 1994, pet: 'cat' }

person3.age = 20;
person3["pet"] = "dog";

console.log(person3);
// { name: 'sampleName', age: 20, birth: 1994, pet: 'dog' }

// person3 객체의 새로운 property 를 저장한다면 객체의 고유한 ID를 변경하게 되므로 Error : read-only 메세지
/*
person3 = {
    pet = "ABC";
}
*/

delete person3.pet;
delete person3["age"];

console.log(person3);
// { name: 'sampleName', birth: 1994 }

// 객체 property 함수
const person4 = {
    name: "HanGiSeon",
    age: 30,
    birth: 1994,
    pet: "cat",
    print: function () {
        console.log(`안녕 나의 이름은 ${person4.name} 입니다`);
    },
    print2: function () {
        console.log(`나의 이름은 ${this.name} 입니다`);
    },
    print3: function () {
        console.log("Hello JS");
    }
    ,
    print4: () => {
        console.log(`나의 이름은 ${this.name} 입니다`);
    }
}

console.log(person4);
person4.print3(); // Hello JS
person4["print3"](); // Hello JS

person4.print()
person4.print2()
person4.print4() // 나의 이름은 undefined 입니다
// cannot read properties of undefined

// function 으로 사용한 메서드는 this를 제대로 가리키지만 화살표 함수는 자신이 속한 객체를 가리키지 못한다