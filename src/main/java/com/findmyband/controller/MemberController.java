package com.findmyband.controller;

import com.findmyband.model.Member;
import com.findmyband.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import static java.lang.Integer.parseInt;

@Controller
@RequestMapping("/member")
@ResponseBody
public class MemberController {
    MemberService memberService;

    @Autowired
    public void setMemberService(MemberService memberService) {this.memberService = memberService;}

    @CrossOrigin
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

    @CrossOrigin
    @PostMapping(path="/three", produces= MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Member> findMember(@RequestBody Map<String,String > loginDetails){
        Member newMember = memberService.findMember(loginDetails.get("username"), loginDetails.get("password"));
        HttpHeaders headers = new HttpHeaders();
        headers.add("Set-Cookie", "userId="+newMember.getId()+"");
        return new ResponseEntity<>(newMember, headers, HttpStatus.OK);
    }

    @CrossOrigin
    @GetMapping(path="/two", produces= MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Member>> listMembers(){
        List<Member> members = memberService.listMembers();
        return new ResponseEntity<>(members, HttpStatus.OK);
    }

    @CrossOrigin
    @PostMapping(path="/five", produces= MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Member> updateProfile(@RequestBody Map<String,String > updateDetails){
        Member newMember = new Member();
        switch (updateDetails.get("profile")) {
            case "firstname" :
                newMember = memberService.updateFirstname(updateDetails.get("data"), parseInt(updateDetails.get("id")));
                break;

            case "lastname" :
                newMember = memberService.updateLastname(updateDetails.get("data"), parseInt(updateDetails.get("id")));
                break;

            case "username" :
                newMember = memberService.updateUsername(updateDetails.get("data"), parseInt(updateDetails.get("id")));
                break;

            case "password" :
                newMember = memberService.updatePassword(updateDetails.get("data"), parseInt(updateDetails.get("id")));
                break;

            case "city" :
                newMember = memberService.updateCity(updateDetails.get("data"), parseInt(updateDetails.get("id")));
                break;

            case "state" :
                newMember = memberService.updateState(updateDetails.get("data"), parseInt(updateDetails.get("id")));
                break;

            case "specialty" :
                newMember = memberService.updateSpecialty(updateDetails.get("data"), parseInt(updateDetails.get("id")));
                break;

            case "website" :
                newMember = memberService.updateWebsite(updateDetails.get("data"), parseInt(updateDetails.get("id")));
                break;

            case "gender" :
                newMember = memberService.updateGender(updateDetails.get("data"), parseInt(updateDetails.get("id")));
                break;

            case "genre" :
                newMember = memberService.updateGenre(updateDetails.get("data"), parseInt(updateDetails.get("id")));
                break;

            case "age" :
                newMember = memberService.updateAge(parseInt(updateDetails.get("data")), parseInt(updateDetails.get("id")));
                break;
        }

        return new ResponseEntity<>(newMember, HttpStatus.OK);
    }

}
