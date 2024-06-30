## 4장 롬복과 리팩터링

### 1.롬복

코드를 간소화해 주는 라이브러리이다.

롬복을 사용하면 여러 필수 코드가 반복되는 것을 최소화할 수 있고 println() 문을 로깅 기능으로 대체할 수 있다.

### 2.로깅

프로그램의 수행 과정을 기록으로 남기는 것을 말한다.

### 3.리팩터링

코드의 기능에는 변함이 없이 코드의 구조 또는 성능을 개선하는 작업을 말한다.

리팩터링하면 코드의 가독성이 좋아지고 길이도 짧아져서 개발 시간을 단축할 수 있다.

### 4.@AllArgsConstructor

클래스 안쪽의 모든 필드를 매개변수로 하는 생성자를 만드는 어노테이션으로, 이를 사용하면 클래스 내에 별도의 생성자를 만들지 않아도 된다.

### 5.@ToString

toString() 메서드를 사용한 것과 똑같은 효과를 냅니다.

별도의 toString() 메서더를 사용하지 않아도 된다.

### 6.@Slf4j

Simple Logging Facade for Java의 약자로, 로깅할 때 사용된다.

로깅 기능으로 로그를 찍으면 나중에라도 그동한 찍힌 로그를 찾아볼 수 있다.

로그를 찍을 때는 log.info() 문을 사용한다.

### 4장 수행 결과

![image](https://imgur.com/aKuJyFX.png)
![image](https://imgur.com/B7TAnOj.png)

### 셀프 체크 결과

![image](https://imgur.com/9qKtf7g.png)
![image](https://imgur.com/SXXOCvK.png)