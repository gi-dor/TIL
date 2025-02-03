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
onion;
// calssList 접근자를 사용
onion.classList;

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










