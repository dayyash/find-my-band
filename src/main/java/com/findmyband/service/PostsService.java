package com.findmyband.service;

import com.findmyband.data.BaseDao;
import com.findmyband.data.MemberDao;
import com.findmyband.model.Member;
import com.findmyband.model.Posts;
import javafx.geometry.Pos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

@Service
public class PostsService {
    BaseDao<Posts> postsDao;

    @Autowired
    public void setPostsDao(BaseDao<Posts> postsDao) {this.postsDao = postsDao;}

    @Transactional
    public Posts save(Posts post) {return postsDao.save(post);}

    @Transactional
    public List<Posts> getPosts() {
        return postsDao.getAll();
    }
}
