## 14장. 댓글 엔티티와 리파지터리 만들기

### 1.일대다 관계, 다대일 관계

한 엔티티의 하나의 데이터가 다른 엔티티의 여러 데이터와 연관될 때 이를 일대다 관계라고 합니다.

반대로 한 엔티티의 여러 데이터가 다른 엔티티의 한 데이터와 연관될 때는 다대일 관계라고 합니다.

### 2.대표키와 외래키

엔티티에서 자신을 대표하는 값을 대표키라고 하고, 다른 엔티티를 참조할 수 있도록 다른 엔티티의 대표키를 가리키는 값을 왜래키라고 합니다.

### 3.다대일 관계 설정

두 엔티티를 다대일 관계로 설정하려면 대표키와 왜리키를 연결해야 합니다.

자식 엔티티의 외래키를 만들어 부모 엔티티의 대표키 값을 갖게 합니다.

### 4.@ManyToOne

두 엔티티를 다대일 관계로 설정하는 어노테이션입니다.

### 5.@JoinColumn

해당 엔티티에 외래키를 생성하는 어노테이션입니다.

name 속성으로 매핑할 외래키 이름을 지정할 수 있습니다.

> @JoinColumn(name="외래키_이름")

### 6.JpaRepository

ListCrudRepository와 ListPagingAndSortingRepository를 상속받은 인터페이스로, CRUD(생성, 조회, 수정, 삭제) 기능뿐만 아니라 엔티티를 페이지 단위로 조회 및 정렬하는 기능과 JPA에 특화된 여러 기능 등을 제공합니다.

> JpaRepository<대상_엔티티, 대표키_값의_타입>

### 7.네이티브 쿼리 메서드

리파지터리의 메서드로 쿼리를 작성해 실행하는 것을 말합니다.

네이티브 쿼리를 메서드는 @Query 어노테이션이나 orm.xml 파일을 이용해 만들 수 있습니다.

### 8.@Query

SQL과 유사한 JPQL이라는 객체 지향 쿼리 언어를 통해 쿼리를 처리할 수 있도록 지원하는 어노테이션입니다.

기존의 SQL 문을 그대로 쿼리 언어로 사용하고 싶다면 nativeQuery 속성을 true로 설정하면 됩니다.

> @Query(value = "쿼리", nativeQuery = true)

### 9.네이티브 쿼리 XML

메서드에서 수행할 쿼리를 XML로 작성한 것을 말합니다.

네이티브 쿼리 XML의 기본 경로와 파일 이름은 META-INF > orm.xml입니다.

이 경로와 이름으로 파일을 만들면 XML이 자동으로 인식됩니다.

### 10.orm.xml 코드 작성 방법

orm.xml 파일이 생성되면 먼저 엔티티 매핑을 XML 기본 코드를 작성한 후 < entity-mappings > 캐그 안에 < named-native-query >와 < query > 태그를 이용해 쿼리를 입력합니다.

```xml
<named-native-query
        name="쿼리_수행_대상_엔티티.메서드_이름"
        result-class="쿼리_수행_결과_반환하는_타입의_전체_패키지_경로">
    <query>
        <![CDATA[
            <!-- 쿼리 -->
        ]]>
    </query>
</named-native-query>
```

### 11.@DataJpaTest

JPA와 연동한 테스트를 진행하는 어노테이션입니다.

이를 통해 리파지터리와 엔티티 등의 객체를 테스트 코드에서 사용할 수 있습니다.

### 12.@DisplayName

테스트 이름을 붙일 때 사용합니다. 기본적으로 테스트 이름은 메서드 이름을 따라가는데, 메서드 이름은 그대로 둔 채 테스트 이름을 바꾸고 싶을 때 이 어노테이션을 사용합니다.

> @DisplayName("테스트_결과에_보여_줄_이름")

### 14장 수행 결과

![image](https://imgur.com/uyE0fid.png)
![image](https://imgur.com/0AN4pIs.png)
![image](https://imgur.com/596VLyf.png)

### 셀프체크 수행 결과

![image](https://imgur.com/dDePh6s.png)
![image](https://imgur.com/crHOTKx.png)