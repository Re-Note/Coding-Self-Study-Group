## 10. REST API와 JSON

### 1. REST API

서버 자원을 클라이언트에 구애받지 않고 사용할 수 있게 하는 설계 방식입니다. 클라이언트에서 정보를 요청하면 서버는 특정 기기에 종속되지 않고 모든 기기에서 통용할 수 있는 JSON 데이터를 응답으로 보냅니다.

### 2. JSON 데이터

자바스크립트 방식을 차용한 객체 표현식으로, 키와 값의 쌍으로 이루어진 속성으로 구성됩니다.

### 3. REST API 실습

{JSON} Placeholder 사이트에 가면 가짜 API를 사용해 무료로 각종 테스트를 할 수 있습니다. 이 책에서는 크롬 브라우저 확장 프로그램으로 Talend API Tester를 설치해 REST API 동작을 실습했습니다.

### 4. HTTP 상태 코드

클라이언트가 보낸 요청이 성공했는지 실패했는지 알려 주는 코드입니다. 응답은 100~500번대까지 5개 그룹으로 나뉘어 있습니다.

- 1XX(정보): 요청이 수신돼 처리 중입니다.
- 2XX(성공): 요청이 정상적으로 처리됐습니다.
- 3XX(리다이렉션 메시지): 요청을 완료하려면 추가 행동이 필요합니다.
- 4XX(클라이언트 요청 오류): 클라이언트의 요청이 잘못돼 서버가 요청을 수행할 수 없습니다.
- 5XX(서버 응답 오류): 서버 내부에 에러가 발생해 클라이언트 요청에 대해 적절히 수행하지 못했습니다.

### 5. HTTP 메시지

HTTP 요청과 응답은 실제 텍스트 형식으로 전송되는데, 이를 HTTP 메시지라고 합니다.

HTTP 메시지는 시작 라인, 레더, 빈 라인, 본문으로 구성됩니다.

- 시작 라인: HTTP 요청 또는 응답 내용이 있습니다. 시작 라인은 항상 한 줄로 끝납니다.
- 헤더: HTTP 전송에 필요한 부가 정보가 있습니다.
- 빈 라인: 헤더의 끝을 알리는 빈 줄로, 헤더가 모두 전송되었음을 알립니다.
- 본문: 실제 전송하는 데이터가 있습니다.

### 10장 수행 결과

![image](https://imgur.com/90gtUE4.png)
![image](https://imgur.com/XZdvnFy.png)
![image](https://imgur.com/0ssCfrk.png)
![image](https://imgur.com/A4vy56E.png)
![image](https://imgur.com/RAtKZuX.png)
![image](https://imgur.com/Ev03z3x.png)
![image](https://imgur.com/BGEXYdc.png)


### 셀프체크 수행 결과

![image](https://imgur.com/HTwO6xc.png)
![image](https://imgur.com/kXAMjEk.png)
![image](https://imgur.com/WnG0E3l.png)
![image](https://imgur.com/G8PJRZe.png)