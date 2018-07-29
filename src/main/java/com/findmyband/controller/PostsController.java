package com.findmyband.controller;

import com.findmyband.model.Member;
import com.findmyband.model.Posts;
import com.findmyband.service.MemberService;
import com.findmyband.service.PostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;

@Controller
@RequestMapping("/posts")
@ResponseBody
public class PostsController {
    PostsService postsService;

    @Autowired
    public void setPostsService(PostsService postsService) {this.postsService = postsService;}

    @PostMapping(path="/one", produces= MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
       public ResponseEntity<Posts> addPostMessage(@RequestBody Posts post){
        Posts newPost = postsService.save(post);
        return new ResponseEntity<>(newPost, HttpStatus.OK);
    }

       @CrossOrigin
    @GetMapping(path="/two", produces= MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Posts>> getAllPosts(){
        List<Posts> posts = postsService.getPosts();
        return new ResponseEntity<>(posts, HttpStatus.OK);
    }

}
