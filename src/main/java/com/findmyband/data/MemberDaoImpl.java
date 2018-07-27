package com.findmyband.data;

import com.findmyband.model.Member;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.io.Serializable;
import java.sql.SQLException;

@Repository
public class MemberDaoImpl implements MemberDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) { this.sessionFactory = sessionFactory; }

    @Override
    public Member save(Member member) {
        System.out.println(member);
//        Configuration configuration = new Configuration().configure();
//        sessionFactory = configuration.buildSessionFactory();
        Integer id = (Integer) sessionFactory.getCurrentSession().save(member);
        member.setId(id);
        return member;
    }

    @Override
    public Member getById(Serializable id) {
        return null;
    }

    @Override
    public Member getByObject(Member member) {
        return null;
    }
}
