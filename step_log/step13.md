## 13장. 테스트 코드 작성하기

### 1.테스트

프로그램의 품질을 검증하는 것으로, 의도대로 프로그램이 잘 동작하는지 확인하는 과정입니다.

### 2.테스트 코드 작성법

테스트 코드는 다음과 같이 3단계로 작성합니다.

1. 예상 데이터 작성하기

2. 실제 데이터 획득하기

3. 예상 데이터와 실제 데이터 비교해 검증하기

### 3.테스트 케이스

테스트는 다양한 경우를 대비해 작성하는데, 이를 테스트 케이스라고 합니다.

테스트 케이스는 성공할 경우뿐만 아니라 실패할 경우까지 고려해 작성합니다.

더 나아가 성공1, 성공2, ..., 실패1, 실패2, ...와 같이 다양한 상황을 예상해 세부적으로 작성합니다.

### 4.test 디렉터리 위치

test 디렉터리는 main 디렉터리 아래에 만들어지는데, 기존 자바 코드가 담긴 main > java 디렉터리와 데칼코마니처럼 test > java 디렉터리로 생성됩니다.

### 5.@SpringBootTest

스프링 부트와 해당 클래스를 연동해 테스트할 때 사용하는 어노테이션입니다.

테스트 코드에서 스프링 부트가 관리하는 다양한 객체를 주입받을 수 있습니다.

### 6.@Test

해당 메서드가 테스트를 위한 코드라고 선언하는 어노테이션입니다.

### 7.테스트 케이스의 트랜잭션 처리

테스트 시 데이터를 조회하는 것이 아닌 조작(생성/수정/삭제)하는 작업을 했다면 테스트를 마치고 데이터를 롤백해야 합니다. 롤백하지 않으면 테스트 수행으로 조작된 데이터가 남아 문제를 일으킬 수 있습니다.

롤백하지 않으면 테스트 수행으로 조작된 데이터가 남아 문제를 일으킬 수 있습니다.

롤백은 테스트 메서드 위에 @Transactional 어노테이션을 붙여 해당 메서드를 트랜잭션 처리해 주면 됩니다.

### 13장 수행 결과

![image](https://imgur.com/Ir60NSh.png)
![image](https://imgur.com/JLC0M5v.png)
![image](https://imgur.com/IQqSrF7.png)
![image](https://imgur.com/KG00ayU.png)
![image](https://imgur.com/gijrIPL.png)
![image](https://imgur.com/7InS7pY.png)

### 셀프체크 수행 결과

![image](https://imgur.com/OHadxZr.png)
![image](https://imgur.com/SCyZIUt.png)
![image](https://imgur.com/Lf7W8pZ.png)
![image](https://imgur.com/aHgGejg.png)
![image](https://imgur.com/I6tOSKk.png)
![image](https://imgur.com/Z7lg3w2.png)
![image](https://imgur.com/zcyCqam.png)