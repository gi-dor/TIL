console.log(' HTML JS 함께 다루기')

//getElementsByTagName - s 가 붙은것을 확인할수 있다 , 복수 갯수 가능
console.log('----------  태그 명으로 선택하기 , 복수 가능 -----------')
document.getElementsByTagName('section');

console.log()

document.getElementsByTagName('li')

console.log('-------- 클래스 명으로 선택하기 ---------------')
document.getElementsByClassName('plant')

console.log('-------- 고유한 아이디로 선택하기 ---------------')
document.getElementById('fruits')

console.log('-------- querySelector , querySelectorAll ---------------')
console.log(' css 선택자로 선택하기')
console.log(' 각각 첫번째 요소 반환')
document.querySelector('section')

console.log('모든요소 반환')
document.querySelectorAll('section')

console.log('---------')
document.querySelector('.plant > ul > .soldout');
document.querySelectorAll('.plant > ul > .soldout');
document.querySelector('#fruits ul > :nth-child(2)');

console.log('------   children ---------')
// querySelector로 선택한 section 안에 있는 모든 자식 요소들을 선택 h2, ul  모두
document.querySelector('section').children;

const $firstUI = document.querySelector('ul');

$firstUI
$firstUI.firstElementChild;
$firstUI.lastElementChild;


console.log('------   parentElement ---------')
$firstUI.parentElement

