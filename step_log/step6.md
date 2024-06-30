## 6장. 게시판 내 페이지 이동하기

### 1.링크

미리 정해 놓은 요청을 간편히 전송하는 기능으로 보통 페이지 이동을 위해 사용합니다.

- HTML의 < a > 태그 혹은 < form > 태그로 작성
- 클라이언트가 링크를 통해 어느 페이지로 이동하겠다고 요청하면 서버가 결과 페이지 응답

### 2.리다이렉트

클라이언트가 보낸 요정을 마친 후 계속해서 처리할 다음 요청 주소를 재지시하는 것입니다.

- 분리된 기능을 하나의 연속적인 흐름으로 연결할 수 있음
- 리다이렉트(재지시)를 받은 클라이언트는 해당 주소로 다시 요청을 보내고, 서버는 이에 대한 결과를 응답

### 3.뷰 파일에 링크 걸기

< a > 태그를 이용해 다음과 같은 형식으로 작성합니다.
> < a href="URL_ 주소" >링크를 걸 대상< /a >

### 4. 리다이렉트 정의하기

return 문을 사용해 다음과 같은 형식으로 작성합니다.

> return "redirect:URL_주소";

### 6장 수행 결과

![image](https://imgur.com/VbJzQLF.png)
![image](https://imgur.com/KywHkmq.png)
![image](https://imgur.com/SXeSPli.png)

### 셀프체크 수행 결과

![image](https://imgur.com/ORRevZH.png)
![image](https://imgur.com/mIQRoyT.png)
![image](https://imgur.com/WVQkDBU.png)