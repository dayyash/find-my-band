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

import java.io.Serializable;

@Controller
@RequestMapping("/member")
@ResponseBody
public class MemberController {
    MemberService memberService;

    @Autowired
    public void setMemberService(MemberService memberService) {this.memberService = memberService;}

//    @PostMapping(path="/one", produces = "application/json", consumes = "application/json")
    @GetMapping(path="/one", produces= MediaType.APPLICATION_JSON_VALUE)
       public ResponseEntity<Member> addMember(Member member){
        System.out.println("controller -- " + member);
        Member newMember = memberService.save(member);
//        Member newMember = new Member("s", "s", "s", "s", "s", "s", "s", "s", "s", "s", "s", 23);
        return new ResponseEntity<>(newMember, HttpStatus.OK);
    }

    @GetMapping(path="/two", produces= MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Member> findMember(Serializable id){
        Member newMember = memberService.findMember(id);
        return new ResponseEntity<>(newMember, HttpStatus.OK);
    }

    @GetMapping(path="/three", produces= MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Member> findMember(String username, String password){
        Member newMember = memberService.findMember(username, password);
        return new ResponseEntity<>(newMember, HttpStatus.OK);
    }
}
