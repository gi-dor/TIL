const headerNavs = [
    {title: 'gidor', link: '#about'},
    {title: 'HTML', link: '#html'},
    {title: 'CSS', link: '#css'},
    {title: 'Curriculum', link: '#curriculum'},
    {title: 'Contact', link: '#contact'},
];

const headerNavUl = document.querySelector('.header__nav ul');


for (const nav of headerNavs) {
    // li 요소 만들기
    const li = document.createElement('li');
    // li 각각 클래스명 추가하기
    li.classList.add('header__nav-item');

    // li 태그내에 a태그 삽입하기 위해 a태그 생성
    const a = document.createElement('a');
    // a 태그의 텍스트
    a.textContent = nav.title;
    // a 태그의 href 추가
    a.setAttribute('href', nav.link);

    // li 태그의 자식인 a
    li.appendChild(a);
    headerNavUl.appendChild(li);
}


// about 항목들 추가하기

// 전체배열
const aboutCards = [
    // 객체
    {
        img: './images/about_1.svg',
        title: '빠른 강의',
        // 배열
        descs: [
            '군더더기 없는 진행으로',
            '여러분의 시간을 절약합니다.'
        ]
    },
    {
        img: './images/about_2.svg',
        title: '손쉬운 학습',
        descs: [
            '강의 페이지를 활용해서',
            '편리하게 실습할 수 있습니다.'
        ]
    },
    {
        img: './images/about_2.svg',
        title: '플레이그라운드',
        descs: [
            '강의를 위해 제작한 도구가',
            '반복학습을 도와줍니다.'
        ]
    }
];

// div class=about
const aboutDiv = document.querySelector('.about');


for (let i = 0; i < aboutCards.length; i++) {
    const card = aboutCards[i];

    // div 태그 만들기, 클래스명 about__card
    const div = document.createElement('div');
    div.classList.add('about__card');

    // img 태그 만들기
    const img = document.createElement('img');
    img.classList.add('about_icon');
    img.setAttribute('src', card.img);

    // i값 0 으로 설정해서 1씩 추가
    const h2 = document.createElement('h2');
    h2.classList.add('about__title')
    h2.classList.add('_' + (i + 1));
    h2.textContent = card.title;

    // p 태그 안에 div
    // about__text 클래스명
    const p = document.createElement('p');
    p.classList.add('about__text');

    // appendChild로 밑으로 집어넣기
    for (desc of card.descs) {
        const word = document.createElement('div');
        word.textContent = desc;
        p.appendChild(word);
    }

    div.appendChild(img);
    div.appendChild(h2);
    div.appendChild(p);

    aboutDiv.appendChild(div);

}

//  커리큘럼 리스트 라인  마우스오버

currLis = document.querySelectorAll('.curriculum__list > li');

// 커리큘럼 리스트 초록색부분 progress bar
currProgBar = document.querySelector('.curriculum__progress .bar');

// 내장되어있는 mouseenter , mouseleave 사용
for (let i = 0; i < currLis.length; i++) {
    const li = currLis[i];

    li.addEventListener('mouseenter', () => {
        currProgBar.style.width = (200 * i) + 'px';
    });
    li.addEventListener('mouseleave', () => {
        currProgBar.style.width = 0;
    });
}


// Contact

// 연락처보기 , 메시지 남기기
const contactTabs = document.querySelectorAll('input[name=contact]');

// 내용들
const contactSlideCon = document.querySelector('.contact__slide-con');


for (let i = 0; i < contactTabs.length; i++) {
    const $tab = contactTabs[i];
    const marginLeft = [0, '-100vw'][i];

    $tab.addEventListener('click', () => {
        contactSlideCon.style.marginLeft = marginLeft;
    });
}