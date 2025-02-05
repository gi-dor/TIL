console.log('textContent')
// 요소의 텍스트확인 , 수정하기

const $carrot1 = document.querySelector('section > ul > li');
const carrot2 = document.querySelector('section > ul > li');

// $carrot1 === carrot2
$carrot1;
carrot2;

$carrot1.textContent;
$carrot1.textContent = '제주당근';

carrot2.textContent;
carrot2.textContent = '미국당근';


console.log('clasList');
// 리스트 형태의 클래스 확인과 수정
// 배열과 유사한 기능

// <section> 내부의 <ul> 요소에서 마지막 자식 요소를 가져옴
const onion = document.querySelector('section ul').lastElementChild;
const $onion = document.querySelector('section ul').lastElementChild;
onion;
$onion

// calssList 접근자를 사용
onion.classList;
$onion.classList;


// hidden 태그 제거
// hidden 요소가 없기에 브라우저에서 양파를 볼 수있음
onion.classList.remove('hidden');

// 추가하기 - organic 클래스
onion.classList.add('organic');

// 토글, on-off
onion.classList.toggle('soldout');


console.log();
console.log('----------  css 스타일 확인 , 수정하기 -----------------');
onion.style;

onion.style.fontSize;

onion.style.fontSize = '1em';


console.log()
console.log('getAttribute , setAttribute')

// 요소의 속성을 반환하기 , 수정하기

const $hyperlink = document.querySelector('a');
$hyperlink
$hyperlink.getAttribute('href')

$hyperlink.setAttribute('href', 'https://www.naver.com');
$hyperlink
$hyperlink.setAttribute('href', 'https://www.google.com');
$hyperlink


console.log()
console.log(' value , checked , input 요소들의 값확인 , 수정하기')
const message = document.querySelector('input[name=message]');
const toggle = document.querySelector('input[name=toggle]');

message.value;
message.value = '어서오시고';
message.value;

toggle.checked;
toggle.checked = !toggle.checked;


console.log()
console.log(' 요소 제거 removeChild')

const ul = document.querySelector('section > ul');
ul.removeChild(onion);

console.log('모든 요소 지우기')
// while (ul.firstChild) {
//     ul.removeChild(ul.firstChild);
// }

console.log('태그 명으로 요소 생성하기 createElement');

const tomato = document.createElement('li');
tomato.textContent = 'real Tomato';
tomato;


console.log(' 요소를 대상 요소안에 넣기')
ul.appendChild(tomato);

const vege = ['상추', '감자', '가지', '아스파라거스'];
for (const item2 of vege) {
    const el = document.createElement('li');
    el.textContent = item2;
    ul.appendChild(el);
}