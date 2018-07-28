package com.findmyband.data;

import com.findmyband.model.Member;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;

@Repository
public class MemberDaoImpl implements MemberDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) { this.sessionFactory = sessionFactory; }

    @Override
    public Member save(Member member) {
        System.out.println("MemberDao start save ---");
        Integer id = (Integer) sessionFactory.getCurrentSession().save(member);
        member.setId(id);
//        System.out.println("MemberDao -- " + sessionFactory.getCurrentSession().get(Member.class, 9));
        return member;
    }

    @Override
    public Member getById(Serializable id) {

        return sessionFactory.getCurrentSession().get(Member.class, id);
    }

    @Override
    public Member getByObject(Member member) {
        return null;
    }

    @Override
    public Member getMemberByUsername(String username, String password) {
        Member m = (Member) sessionFactory.getCurrentSession()
                .getNamedQuery("getMemberByUsernamePassword")
                .setParameter("username", username).setParameter("password", password)
                .uniqueResult();
        return m;
    }

    @Override
    public List<Member> getAll() {

        List<Member> members = sessionFactory.getCurrentSession().getNamedQuery("getAllMembers").list();
        return members;
    }
}
