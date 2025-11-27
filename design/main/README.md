# N Top Position - 디지털 마케팅 전문 기업 웹사이트

엔탑포지션 공식 웹사이트 프로젝트입니다.

## 📌 프로젝트 개요

**회사명**: 엔탑포지션 (N Top Position)  
**업종**: 디지털 마케팅 전문 기업  
**주요 서비스**: SNS 마케팅, 숏폼 마케팅, 퍼포먼스 마케팅, 학원 홍보 플랫폼

## ✨ 주요 기능

### 🟢 구현 완료된 기능

1. **Home (메인 페이지)**
   - 풀스크린 비디오 슬라이더 (Swiper 사용)
   - 3개의 메인 슬라이드
   - 스크롤 인디케이터
   - 페이드 애니메이션

2. **Company (회사 소개)**
   - 비전 & 미션
   - 연혁 (타임라인 형식)
   - 조직도
   - 시설 사진

3. **Service (서비스 안내)**
   - SNS 마케팅
   - 숏폼 마케팅
   - 퍼포먼스 마케팅
   - 학원 홍보 플랫폼

4. **Portfolio (포트폴리오)**
   - 필터링 기능 (All, SNS, 숏폼, 퍼포먼스, 학원)
   - 6개의 포트폴리오 아이템
   - 호버 효과

5. **Contact (상담 문의)**
   - 연락처 정보
   - 문의 폼
   - 이메일, 전화번호, 운영시간

6. **퀵메뉴**
   - 카카오톡 실시간 상담
   - 상담 문의
   - 서비스 소개서 다운로드
   - 서비스 안내 링크
   - TOP 버튼

## 🎨 디자인 특징

### 디자인 참조 사이트
- **메인 디자인**: 
  - https://www.yourplan.kr/
  - https://mleverage.co.kr/
  - https://withit.kr/

- **모션/애니메이션**: 
  - https://nine2021.com/

- **콘텐츠 참조**: 
  - https://www.growthpartner.co.kr/

### 디자인 요소
- ✅ 인터랙티브 디자인
- ✅ 반응형 웹 (모바일, 태블릿, 데스크톱)
- ✅ 스크롤 애니메이션
- ✅ 모션 그래픽
- ✅ 그라디언트 배경
- ✅ 글라스모피즘 효과

## 🛠 기술 스택

### Frontend
- HTML5
- CSS3
- JavaScript (ES6+)

### 라이브러리
- **jQuery** 3.6.0
- **jQuery UI**
- **Swiper** 11 (비디오 슬라이더)
- **GSAP** (애니메이션)
- **ScrollTrigger** (스크롤 애니메이션)
- **Slick Slider**
- **Magnific Popup**

## 📂 프로젝트 구조

```
main/
├── index.html              # 메인 페이지
├── css/
│   ├── common_re.css       # 공통 스타일
│   ├── content_re.css      # 콘텐츠 스타일
│   ├── reset_re.css        # 리셋 CSS
│   ├── main.css            # 메인 스타일
│   ├── style.css          # 추가 스타일
│   ├── ntop-custom.css     # 엔탑포지션 커스텀 스타일 ⭐
│   ├── slick.css           # Slick 슬라이더
│   └── magnific-popup.css  # 팝업
├── js/
│   ├── jquery-3.6.0.min.js
│   ├── jquery-ui.js
│   ├── common_renew.js
│   ├── main.js
│   ├── gsap.js
│   ├── scrollTrigger.js
│   ├── slick.min.js
│   └── jquery.magnific-popup.min.js
├── img/
│   ├── renew/
│   │   ├── common/
│   │   └── content/
│   └── info/
├── video/
│   ├── video1.mp4
│   ├── video2.mp4
│   └── video3.mp4
└── font/
    └── font.css
```

## 🚀 시작하기

### 로컬 서버 실행

#### 방법 1: VS Code Live Server
1. VS Code에서 프로젝트 열기
2. `index.html` 파일 우클릭
3. "Open with Live Server" 선택

#### 방법 2: Python 서버
```bash
# Python 3
python -m http.server 8000

# Python 2
python -m SimpleHTTPServer 8000
```

#### 방법 3: Node.js 서버
```bash
npx http-server
```

브라우저에서 `http://localhost:8000` (또는 해당 포트) 접속

## 📱 반응형 브레이크포인트

- **Desktop**: 1200px 이상
- **Tablet**: 768px ~ 1199px
- **Mobile**: 767px 이하
- **Small Mobile**: 480px 이하

## 🎯 페이지 섹션

### 네비게이션 메뉴
- Home (#home)
- Company (#company)
  - 비전 & 미션 (#company-vision)
  - 연혁 (#company-history)
  - 조직도 (#company-organization)
  - 시설사진 (#company-facilities)
- Service (#service)
  - SNS 마케팅 (#service-sns)
  - 숏폼 마케팅 (#service-shortform)
  - 퍼포먼스 마케팅 (#service-performance)
  - 학원 홍보 플랫폼 (#service-academy)
- Portfolio (#portfolio)
- Contact (#contact)

## 🎨 커스텀 CSS 변수

```css
:root {
    --primary-color: #0066FF;      /* 메인 컬러 */
    --secondary-color: #00D9FF;    /* 서브 컬러 */
    --dark-bg: #0A0E27;            /* 다크 배경 */
    --light-bg: #F8F9FA;           /* 라이트 배경 */
    --text-dark: #1A1A1A;          /* 다크 텍스트 */
    --text-light: #666666;         /* 라이트 텍스트 */
}
```

## 📋 주요 애니메이션

### 1. 페이드 업 애니메이션
```javascript
// 스크롤 시 섹션이 아래에서 위로 페이드인
[data-scroll-animation].animated {
    opacity: 1;
    transform: translateY(0);
}
```

### 2. 비디오 슬라이더
```javascript
// Swiper를 사용한 풀스크린 비디오 슬라이더
// 페이드 효과 + 자동 재생
```

### 3. 포트폴리오 필터
```javascript
// 카테고리별 필터링 기능
// 부드러운 전환 효과
```

## 📞 연락처 정보

- **Email**: contact@ntopposition.com
- **Phone**: 010-1234-5678
- **Address**: 서울특별시 강남구 테헤란로 123
- **Business Hours**: 평일 09:00 - 18:00

## 🔗 소셜 미디어

- Instagram: [@ntopposition](https://www.instagram.com/ntopposition)
- Facebook: [N Top Position](https://www.facebook.com/ntopposition)
- Naver Blog: [엔탑포지션](https://blog.naver.com/ntopposition)
- YouTube: [@ntopposition](https://www.youtube.com/@ntopposition)

## 📝 TODO

### 향후 추가 예정 기능
- [ ] 카카오톡 채널 연동
- [ ] 실제 포트폴리오 이미지 추가
- [ ] 서비스 소개서 PDF 파일 생성
- [ ] 로고 이미지 제작 및 적용
- [ ] 실제 비디오 파일 추가
- [ ] SEO 최적화
- [ ] Google Analytics 연동
- [ ] 다크모드 지원
- [ ] 다국어 지원 (영어)

## 🐛 알려진 이슈

현재 알려진 이슈 없음

## 📄 라이선스

© 2024 N Top Position. All Rights Reserved.

## 👨‍💻 개발 정보

- **개발 시작일**: 2024년
- **최종 업데이트**: 2024년 11월 26일
- **버전**: 1.0.0

---

## 💡 개발 팁

### CSS 커스터마이징
`css/ntop-custom.css` 파일에서 엔탑포지션 전용 스타일을 수정할 수 있습니다.

### 비디오 교체
`video/` 폴더에 `video1.mp4`, `video2.mp4`, `video3.mp4` 파일을 교체하면 됩니다.

### 컬러 테마 변경
`css/ntop-custom.css`의 `:root` 변수를 수정하여 전체 컬러 테마를 변경할 수 있습니다.

### 스크롤 애니메이션 추가
원하는 요소에 `data-scroll-animation` 속성을 추가하면 자동으로 스크롤 애니메이션이 적용됩니다.

```html
<div data-scroll-animation>
    애니메이션이 적용될 콘텐츠
</div>
```

---

**엔탑포지션과 함께 디지털 마케팅의 새로운 경험을 시작하세요!** 🚀
