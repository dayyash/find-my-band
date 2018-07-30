package com.findmyband.service;

import com.findmyband.data.BaseDao;
import com.findmyband.data.MemberDao;
import com.findmyband.model.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

@Service
public class MemberService {
    MemberDao memberDao;

    @Autowired
    public void setMemberDao(MemberDao memberDao) {this.memberDao = memberDao;}

    @Transactional
    public Member save(Member member) {return memberDao.save(member);}

    @Transactional
    public Member findMember(Integer id){return memberDao.getById(id);}

    @Transactional
    public Member findMember(String username, String password) {
        return memberDao.getMemberByUsername(username, password);
    }

    @Transactional
    public List<Member> listMembers() {
        return memberDao.getAll();
    }
}
