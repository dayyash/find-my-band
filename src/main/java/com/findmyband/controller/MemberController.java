package com.findmyband.controller;

import com.findmyband.model.Member;
import com.findmyband.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;

@Controller
@RequestMapping("/member")
@ResponseBody
public class MemberController {
    MemberService memberService;

    @Autowired
    public void setMemberService(MemberService memberService) {this.memberService = memberService;}

    @PostMapping(path="/one", produces= MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
       public ResponseEntity<Member> addMember(@RequestBody Member member){
        System.out.println("controller -- " + member);
        Member newMember = memberService.save(member);
        return new ResponseEntity<>(newMember, HttpStatus.OK);
    }

    @CrossOrigin
    @GetMapping(path="/four", produces= MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Member> findMember(@RequestParam Integer id){
        Member newMember = memberService.findMember(id);
        return new ResponseEntity<>(newMember, HttpStatus.OK);
    }

    @PostMapping(path="/three", produces= MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Member> findMember(String username, String password){
        Member newMember = memberService.findMember(username, password);
        return new ResponseEntity<>(newMember, HttpStatus.OK);
    }

    @CrossOrigin
    @GetMapping(path="/two", produces= MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Member>> listMembers(){
        List<Member> members = memberService.listMembers();
        return new ResponseEntity<>(members, HttpStatus.OK);
    }

}
