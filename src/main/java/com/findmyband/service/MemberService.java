package com.findmyband.service;

import com.findmyband.data.BaseDao;
import com.findmyband.model.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MemberService {
    BaseDao<Member> memberDao;

    @Autowired
    public void setMemberDao(BaseDao<Member> memberDao) {this.memberDao = memberDao;}

    @Transactional
    public Member save(Member member) {return memberDao.save(member);}
}
