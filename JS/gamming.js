
// JS 에는 (Int)Math.random 안됨
// 1과 100 사이의 무작위 숫자를 생성하기.
let randomNumber = Math.floor(Math.random() * 100) +1;

let guessNumber = document.querySelector('.guessNumber'); // 사용자가 추측한 숫자들을 표시할 곳
let Result = document.querySelector('.Result'); // 마지막 결과(정답인지 아닌지)
let lowOrHi = document.querySelector('.lowOrHiResult'); // 힌트(숫자가 너무 낮거나 높은지)
let guessSubmit = document.querySelector('.guessSubmit'); // 입력값  버튼
let guessField = document.querySelector('.guessField'); // 입력하는 공간
let playAgainButton = document.querySelector('.playAgainButton'); // 새 게임 시작 버튼

let resetButton; // 새 게임 버튼

let guessCount = 1; // 사용자의 추측 횟수
let count = document.querySelector('.count'); // 턴 표시 요소


// 입력한 값 버튼 클릭시 실행되는 함수
function checkGuess() {
    // Number() 문자열을 숫자로 변환
    let userGuess = Number(guessField.value);
    guessNumber.textContent += userGuess + ' ';

    if(userGuess === randomNumber) {
        Result.textContent = '성공 , 입력한 숫자가 일치 합니다';
        lowOrHi.textContent = '';
        setGameOver(); // 종료
    } else if(guessCount === 10) {
        Result.textContent = '실패 , 입력 기회 초과';
        setGameOver();
    } else {
        Result.textContent = '틀렷습니다'
        
        if(userGuess < randomNumber) {
            lowOrHi.textContent = '입력한 값이 작습니다 큰 숫자를 입력하세요';
        } else if(userGuess > randomNumber) {
            lowOrHi.textContent = '입력한 값이 큽니다 , 작은 숫자를 입력하세요';
        }
    }

    guessCount++; // 초기값 1로 설정하고 한번 할때 마다 1씩 증가
    // 입력한 횟수 설정
    count.textContent = guessCount;

    // 입력한 값 공간 비우기
    guessField.value = '';


}


// 게임 종료 후 다시 시작할 수 있는 옵션을 설정
function setGameOver() {
    guessField.disabled = true; // 게임 종료 후 입력칸 비활성화
    guessSubmit.disabled = true; // 제출 버튼 비활성화
    playAgainButton.style.display = 'block'; // 재시작 버튼 표시
}

function resetGame(){
    guessCount = 1;
    count.textContent = guessCount;

    guessField.disabled = false;
    guessSubmit.disabled = false;
    guessField.textContent = '';
    guessNumber.textContent = '';
    Result.textContent = '';
    lowOrHi.textContent = '';

    randomNumber = Math.floor(Math.random() * 100) + 1; // 새로운 무작위 숫자
}

guessSubmit.onclick = checkGuess;
//guessSubmit.addEventListener('click',checkGuess);

// 게임 재시작 버튼 클릭 시 실행
playAgainButton.addEventListener('click', resetGame);