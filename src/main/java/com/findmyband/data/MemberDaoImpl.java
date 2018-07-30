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

import static java.lang.Integer.parseInt;

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
    public Member updateFirstname(String firstname, Serializable id) {
        Member m = getById(id);
        m.setFirstname(firstname);

        return (Member) sessionFactory.getCurrentSession().merge(m);
    }

    @Override
    public Member updateLastname(String lastname, Serializable id) {
        Member m = getById(id);
        m.setLastname(lastname);

        return (Member) sessionFactory.getCurrentSession().merge(m);

    }

    @Override
    public Member updateUsername(String username, Serializable id) {
        Member m = getById(id);
        m.setUsername(username);

        return (Member) sessionFactory.getCurrentSession().merge(m);

    }

    @Override
    public Member updatePassword(String password, Serializable id) {
        Member m = getById(id);
        m.setPassword(password);

        return (Member) sessionFactory.getCurrentSession().merge(m);

    }

    @Override
    public Member updateCity(String city, Serializable id) {
        Member m = getById(id);
        m.setCity(city);

        return (Member) sessionFactory.getCurrentSession().merge(m);

    }

    @Override
    public Member updateState(String state, Serializable id) {
        Member m = getById(id);
        m.setState(state);

        return (Member) sessionFactory.getCurrentSession().merge(m);

    }

    @Override
    public Member updateSpecialty(String specialty, Serializable id) {
        Member m = getById(id);
        m.setSpecial1(specialty);

        return (Member) sessionFactory.getCurrentSession().merge(m);

    }

    @Override
    public Member updateWebsite(String website, Serializable id) {
        Member m = getById(id);
        m.setSpecial3(website);

        return (Member) sessionFactory.getCurrentSession().merge(m);

    }

    @Override
    public Member updateGender(String gender, Serializable id) {
        Member m = getById(id);
        m.setGender(gender);

        return (Member) sessionFactory.getCurrentSession().merge(m);

    }

    @Override
    public Member updateGenre(String genre, Serializable id) {
        Member m = getById(id);
        m.setGenres(genre);

        return (Member) sessionFactory.getCurrentSession().merge(m);

    }

    @Override
    public Member updateAge(Serializable age, Serializable id) {
        Member m = getById(id);
        m.setAge((Integer)age);

        return (Member) sessionFactory.getCurrentSession().merge(m);

    }

    @Override
    public List<Member> getAll() {

        List<Member> members = sessionFactory.getCurrentSession().getNamedQuery("getAllMembers").list();
        return members;
    }


}
