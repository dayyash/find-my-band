package com.findmyband.controller;

import com.findmyband.model.Member;
import com.findmyband.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/member")
@ResponseBody
public class MemberController {
    MemberService memberService;

    @Autowired
    public void setMemberService(MemberService memberService) {this.memberService = memberService;}

//    @PostMapping(path="/one", produces = MediaType.APPLICATION_JSON_VALUE)
    @GetMapping(path="/one", produces= MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Member> addMember(Member member){
        System.out.println(member);
        Member newMember = memberService.save(member);
//        Member newMember = new Member("s", "s", "s", "s", "s", "s", "s", "s", "s", "s", "s", 23);
        return new ResponseEntity<>(newMember, HttpStatus.OK);
    }
}
