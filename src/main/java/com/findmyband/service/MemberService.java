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

    @Transactional
    public Member updateFirstname(String s, Serializable id) {
        return memberDao.updateFirstname(s,id);
    }

    @Transactional
    public Member updateLastname(String s, Serializable id) {
        return memberDao.updateLastname(s,id);
    }

    @Transactional
    public Member updateUsername(String s, Serializable id) {
        return memberDao.updateUsername(s,id);
    }

    @Transactional
    public Member updatePassword(String s, Serializable id) {
        return memberDao.updatePassword(s,id);
    }

    @Transactional
    public Member updateCity(String s, Serializable id) {
        return memberDao.updateCity(s,id);
    }

    @Transactional
    public Member updateState(String s, Serializable id) {
        return memberDao.updateState(s,id);
    }

    @Transactional
    public Member updateSpecialty(String s, Serializable id) {
        return memberDao.updateSpecialty(s,id);
    }

    @Transactional
    public Member updateWebsite(String s, Serializable id) {
        return memberDao.updateWebsite(s,id);
    }

    @Transactional
    public Member updateGender(String s, Serializable id) {
        return memberDao.updateGender(s,id);
    }
    @Transactional
    public Member updateGenre(String s, Serializable id) {
        return memberDao.updateGenre(s,id);
    }
    @Transactional
    public Member updateAge(Serializable s, Serializable id) {
        return memberDao.updateAge(s,id);
    }
}
