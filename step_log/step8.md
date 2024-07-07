## 8장. 게시글 삭제하기: Delete

### 1. 데이터 삭제 과정

클라이언트가 서버로 삭제 요청을 하면 서버는 DB에서 해당 데이터를 찾아 삭제하고, 클라이언트를 리다이렉트된 페이지로 보냅니다.

- /articles/{id}/delete
- delete(id)
- redirect:/articles

### 2. RedirectAttributes

리다이렉트 페이지에서 사용할 일회성 데이터를 관리하는 객체입니다. 이 객체의 addFlashAttribute()라는 메서드로 리다이렉트된 페이지에서 사용할 일회성 데이터를 등록할 수 있습니다.

### 3. articleRepository.delete()

DB에 접근해 데이터를 삭제할 때 사용하는 메서드입니다. articleRepository.delete(target)이라고 작성하면 DB에서 target을 삭제합니다.

### 4. DELETE 문

DB 테이블에 저장된 내용을 행 단위로 삭제할 때 사용하는 SQL 문으로, 형식은 다음과 같습니다.

> DELETE [FROM] 테이블명 WHERE 조건; -- []: 생략 가능
 
### 8장 수행 결과

![image](https://imgur.com/G5qYlrm.png)
![image](https://imgur.com/TT2SQsF.png)
![image](https://imgur.com/6jtNeZ3.png)

### 셀프체크 수행 결과

![image](https://imgur.com/NnY3a7O.png)
![image](https://imgur.com/Go8WLg6.png)
![image](https://imgur.com/OsYNIuI.png)