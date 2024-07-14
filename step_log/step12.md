## 12장. 서비스 계층과 트랜잭션

### 1.서비스

컨트롤러와 리파지터리 사이에 위치하는 계층으로, 서버의 핵심 기능(비즈니스 로직)을 처리하는 순서를 총괄합니다.

클라이언트가 요청을 보내면, 이를 컨트롤러가 받아 서비스로 전달하고, 서비스는 정해진 코드 흐름을 따라 처리를 진행합니다.

이때 처리에 필요한 데이터는 리파지터리가 DB에서 가져와 서비스로 반환합니다.

이렇게 대부분의 웹 서비스는 컨트롤러와 리파지터리 사이에 서비스 계층을 두어서 역할을 분업합니다.

### 2.트랜잭션

모두 성공해야 하는 일련의 과정으로, 쪼갤 수 없는 업무 처리의 최소 단위입니다. 보통 트랜잭션은 서비스 단에서 관리합니다.

### 3.롤백

트랜잭션 내부에서 실행에 실패하면 지금까지 수행한 것을 모두 폐기하고 진행 초기 단계로 되돌리는데, 이를 롤백이라고 합니다.

### 4.@Service

해당 어노테이션이 선언된 클래스를 서비스로 인식해 서비스 객체를 생성합니다. 컨트롤러는 객체 주입(@Autowired를 통해 객체를 가져와 연결)하는 방식으로 서비스 객체를 사용할 수 있습니다.

### 5.@Transactional

해당 어노테이션이 선언된 메서드를 트랜잭션으로 묶습니다. 클래스에 이 어노테이션을 선언하면 클래스의 모든 메서드별로 각각의 트랜잭션이 부여됩니다.

이렇게 트랜잭션으로 묶인 메서드는 처음부터 끝까지 완전히 실행되거나 아예 실행되지 않거나 둘 중 하나로 동작합니다.

중간에 실패하면 롤백해 처음 상태로 되돌아가기 때문입니다.

### 12장 수행 결과

![image](https://imgur.com/B53ke1C.png)
![image](https://imgur.com/NRa7BQz.png)
![image](https://imgur.com/d2x3Ycq.png)
![image](https://imgur.com/BdiZDYY.png)
![image](https://imgur.com/jOtlB2X.png)
![image](https://imgur.com/USNM1dy.png)
![image](https://imgur.com/NuTs2hp.png)

### 셀프체크 수행 결과

![image](https://imgur.com/G1V909W.png)
![image](https://imgur.com/8nQdEMk.png)
![image](https://imgur.com/CzyPU0G.png)