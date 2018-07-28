package com.findmyband.data;

import com.findmyband.model.Posts;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository
public class PostsDaoImpl implements PostsDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) { this.sessionFactory = sessionFactory; }

    @Override
    public Posts save(Posts post) {
        Integer id = (Integer) sessionFactory.getCurrentSession().save(post);
        post.setId(id);
        return post;
    }

    @Override
    public Posts getById(Serializable id) {
        return null;
    }

    @Override
    public Posts getByObject(Posts posts) {
        return null;
    }

    @Override
    public List<Posts> getAll() {
        List<Posts> posts = sessionFactory.getCurrentSession().getNamedQuery("getAllPosts").list();
        return posts;
    }
}
