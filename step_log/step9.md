## 9. CRUD와 SQL 쿼리 종합

### 1. JPA 로깅 설정

JPA 동작 시 로그를 보기 위한 설정은 application.properties 파일에 작성합니다. 로깅 레벨은 총 7단계 중 하나를 선택할 수 있는데, SQL 로그를 보려면 DEBUG 레벨로 설정합니다. SQL 쿼리에 줄바꿈을 적용해서 보려면 format_sql 옵션을 true로 설정하고, JPA 쿼리에서 DB로 넘어가는 매개변수 값을 확인하기 위해 sql의 BasicBinderfmf TRACE로 설정합니다.

### 2. 기본키와 ID 자동 생성 전략

기본키(primary key)란 테이블에 저장된 각 데이터를 유일하게 구분할 수 있도록 지정한 속성을 말합니다. 보통 id를 기본키로 많이 사용하는데, @GeneratedValue 어노테이션의 전략을 IDENTITY로 설정하면 DB가 id를 자동으로 생성하므로 id 값이 중복되지 않습니다.

### 3. CRUD와 SQL 쿼리

서버에서 데이터의 생성, 조회, 수정, 삭제 등의 CRUD 요청을 하면 JPA의 리파지터리가 DB에 해당 요청을 전달합니다. 요청을 받은 DB는 자신의 언어인 SQL로 작성한 쿼리를 사용해 테이블에서 데이터를 관리합니다. 데이터의 생성 요청이 들어왔을 때는 INSERT 문, 조회 요청이 들어왔을 때는 SELECT 문, 수정 요청이 들어왔을 때는 UPDATE 문, 삭제 요청이 들어왔을 때는 DELETE 문을 수행합니다.

### 4. CREATE TABLE 문

테이블을 만드는 쿼리로, 테이블명, 속성명, 속성의 자료형, 기본키 등을 설정합니다.

> CREATE TABLE 테이블명 (
>   속성명1 자료형,
>   속성명2 자료형,
>   속성명3 자료형,
>   PRIMARY KEY (기본키)
> );

### 5. INSERT 문

테이블에 데이터를 생성하는 쿼리로, 한 번에 하나 또는 여러 데이터를 삽입할 수 있습니다.

> INSERT
> INTO
>   테이블명
>   (속성명1, 속성명2, 속성명3, ...)
> VALUES
>   (값1, 값2, 값3, ...);

### 6. SELECT 문

테이블에 데이터를 조회하는 쿼리로, WHERE 절이 없으면 조건 없이 모든 데이터를 조회합니다.

> SELECT
>   속성명1, 속성명2, 속성명3
> FROM
>   테이블명
> WHERE
>   조건;

### 7. UPDATE 문

테이블에 데이터를 수정하는 쿼리로, WHERE 절이 없으면 조건 없이 모든 데이터를 수정합니다.

> UPDATE
>   테이블명
> SET
>   속성명=변경할 값
> WHERE
>   조건;

### 8. DELETE 문

테이블에서 데이터를 삭제하는 쿼리입니다. WHERE 절이 없으면 조건 없이 모든 데이터를 삭제하고 빈 테이블만 남습니다.

> DELETE
> [FROM] -- []: 생략 가능
>   테이블명
> WHERE
>   조건;

### 9장 수행 결과

![image](https://imgur.com/EjucQo7.png)

### 셀프체크 수행 결과

![image](https://imgur.com/9DWsO9B.png)