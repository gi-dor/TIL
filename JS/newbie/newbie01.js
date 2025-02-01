let darkMode = true;
const PI = 3.14159265;

console.log(darkMode);
console.log(PI);
console.log("-------------------------------------------")

// 데이터의 묶음 key : value의 값 조합
// - 이 둘의 조합을 property 라고 부른다
const npc = {
    name: "npcName01",
    age: 32,
    married: false,
    job: "dev"
}

console.log("npc _ type = ?", typeof npc);

console.log("npc _ key : value ? ", npc);

console.log(
    npc.name,
    npc['name']
)

console.log()

console.log(
    npc.name,
    npc['name'],
    npc.age,
    npc.married,
    npc.job
)

// 만들어진 객체에 새로운 프로퍼티 추가하기

npc.subJob = 'programmer';

console.log(npc);


npc.age++;
console.log("기존 age는 32 -> ", npc.age)

// npc = {};
// TypeError: Assignment to constant variable.

// 배열
// key 없이 값만
// 다수의 데이터를 저장할수 있다
const myArray = [true, 3.14, '안녕', npc, 'sample'];
console.log(myArray, myArray.length)

console.log("myArray[2] = ", myArray[2])
console.log("----------------------")
console.log(
    myArray[0],
    myArray[1],
    myArray[2],
    myArray[3],
    myArray[4]
)

console.log("요소 추가 , 삭제하기 ------------------")
// 요소 추가하기 , 삭제하기

myArray.push(12345);
console.log(myArray)

const poped = myArray.pop();
console.log(poped, myArray);

// 그냥 제거만 할 경우
console.log("그냥 제거만 -00000000000000000000000000")
myArray.pop()
console.log(myArray)


console.log()
console.log("객체와 배열의 중첩 -00000000000000000000000000000")

const person2 = {
    name: "기선",
    age: 32,
    language: ['korean', 'eng', 'french'],
    education: {
        school: '대학교',
        major: ['양식', '중식', '일식'],
        graduated: true
    }
};

console.log(person2)
console.log("person.language = ", person2.language)
console.log("person.language[1] = ", person2.language[1])
console.log("person.education.major = ", person2.education.major)
console.log("person.education.major[1] = ", person2.education.major[1])

console.log("person2['education.major[2]'] = ", person2['education'].major[2])