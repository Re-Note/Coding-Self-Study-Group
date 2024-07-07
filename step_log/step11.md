## 11장. HTTP와 REST 컨트롤러

### 1.REST API

REST는 HTTP URL로 서버의 자원을 명시하고 HTTP 메서드(GET, POST, PATCH/PUT, DELETE)로 해당 자원에 대해 CRUD(생성, 조회, 수정, 삭제)하는 것을 말합니다.

API는 클라이언트가 서버의 자원을 요청할 수 있도록 서버 측에서 제공하는 인터페이스 입니다.

결국 REST API란 REST 기반으로 API를 구현한 것이라고 할 수 있습니다.

### 2.REST 컨트롤러

REST API로 설계된 URL 요청을 받아 처리하는 컨트롤러입니다. 일반 컨트롤러가 뷰 페이지를 반환한다면 REST 컨트롤러는 JSON이나 텍스트 같은 데이터를 반환합니다.

### 3.REST 컨트롤러의 특징

- @RestController 어노테이션을 붙여 선언합니다.
- 클라이언트의 데이터 조회, 생성, 수정, 삭제 요청을 HTTP 메서드에 맞게 각각 @GetMapping, @PostMapping, @PatchMapping, @DeleteMapping으로 받아 처리합니다.

### 4.ResponseEntity

REST 컨트롤러의 반환형, 즉 REST API의 응답을 위해 사용하는 클래스입니다. REST API 요청을 받아 응답할 때 이 클래스에 HTTP 상태 코드, 헤더, 본문을 실어 보낼 수 있습니다.

### 5.HttpStatus

HTTP 상태 코드를 관리하는 클래스로, 다양한 Enum 타입과 관련한 메서드를 가집니다. 상태 코드 200은 HttpStatus.OK, 201은 HttpStatus.CREATED, 400은 HttpStatus.BAD_REQUEST 등으로 관리됩니다.

### 11장 수행 결과

![image](https://imgur.com/cnb4saQ.png)
![image](https://imgur.com/YIGkDhS.png)
![image](https://imgur.com/vrU7gUb.png)
![image](https://imgur.com/W8SrmtQ.png)


### 셀프체크 수행 결과

![image](https://imgur.com/XscG4q3.png)