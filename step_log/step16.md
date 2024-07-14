## 16장. 웹 페이지에서 댓글 목록 보기

### 1.댓글의 레이아웃

댓글은 크게 두 영역으로 나뉩니다.

기존 댓글을 보여주는 영역(_list)와 새 댓글을 입력하는 영역(_new)입니다.

### 2.댓글 뷰 파일의 구성

댓글 뷰 파일은 댓글 영역을 보여주는 뷰 파일(_comments.mustache), 댓글 목록을 보여주는 뷰 파일(_list.mustache), 새 댓글을 작성하는 뷰 파일(_new.mustache)로 나누어 작성합니다.

### 3. \{\{#commentDtos\}\}\{\{/commentDtos\}\}

뷰 페이지에서 모델이 등록된 데이터의 사용 범위를 지정할 떄 사용하는 머스테치 문법입니다.

{{#commentDtos}}부터 {{/commentDtos}}까지 범위 내에서 commentDtos 데이터를 사용할 수 있으며 commentDtos 데이터의 수만큼 해당 범위를 반복합니다.

### 16장 수행 결과

![image](https://imgur.com/79v2eN2.png)
![image](https://imgur.com/In6SMN8.png)

### 셀프체크 수행 결과

```java
package com.example.firstproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class GroupController {
    @Autowired
    private GroupService groupService;
    @Autowired
    private TeamService teamService;

    @GetMapping("/groups/{groupId}")
    public String group(@PathVariable int groupId, Model model) {
        // 해당 메서드를 완성하세요.
        GroupDto groupDto = groupService.getGroup(groupId);
        List<TeamDto> teamDtos = teamService.getTeamsOnGroup(groupId);
        model.addAttribute("teamDtoList", teamDtos);
        return "groups/show";
    }
}
```