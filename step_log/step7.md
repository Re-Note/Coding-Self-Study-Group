## 7장. 게시글 수정하기: Update

### 1. 데이터 수정 1단계

수정 페이지를 만들고 기존 데이터를 불러옵니다.

- 수정 페이지 요청
- DB에서 데이터를 찾아 서버로 전송
- 가져온 데이터를 모델에 등록
- 뷰 페이지 출력

### 2. 데이터 수정 2단계

데이터를 수정해 DB에 반영한 후 결과를 볼 수 있게 상세 페이지로 리다이렉트합니다.

- 폼 데이터 전달
- DTO를 엔티티로 변환
- DB 갱신
- 리다이렉트

### 3. HTTP 메서드

HTTP는 클라이언트의 다양한 요청을 메서드를 통해 서버로 보내는 역할을 합니다. 대표적인 메서드로는 POST, GET, PATCH(PUT), DELETE가 있습니다.

- POST: 데이터 생성 요청
- GET: 데이터 조회 요청
- PATCH(PUT) : 데이터 수정 요청
- DELETE: 데이터 삭제 요청

### 4. UPDATE 문

데이터를 수정할 때 사용하는 SQL 문으로, 형식은 다음과 같습니다.

> UPDATE 테이블명 SET 속성명=변경할_값 WHERE 조건;

### 7장 수행 결과

![image](https://imgur.com/pzO9Etv.png)
![image](https://imgur.com/B76AGW7.png)
![image](https://imgur.com/s9jSEos.png)
![image](https://imgur.com/qp83YpT.png)

### 셀프체크 수행 결과

![image](https://imgur.com/52QGIQ4.png)
![image](https://imgur.com/mL244Fm.png)
![image](https://imgur.com/kEMrrnu.png)
