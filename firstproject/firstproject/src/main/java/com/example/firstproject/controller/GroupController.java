//package com.example.firstproject.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//
//import java.util.List;
//
//@Controller
//public class GroupController {
//    @Autowired
//    private GroupService groupService;
//    @Autowired
//    private TeamService teamService;
//
//    @GetMapping("/groups/{groupId}")
//    public String group(@PathVariable int groupId, Model model) {
//        // 해당 메서드를 완성하세요.
//        GroupDto groupDto = groupService.getGroup(groupId);
//        List<TeamDto> teamDtos = teamService.getTeamsOnGroup(groupId);
//        model.addAttribute("teamDtoList", teamDtos);
//        return "groups/show";
//    }
//}
