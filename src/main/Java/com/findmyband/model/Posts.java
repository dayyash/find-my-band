package com.findmyband.model;

public class Posts {
    private int id;
    private int memberid;
    private String post;

    public Posts() {
    }

    public Posts(int id, int memberid, String post) {
        this.id = id;
        this.memberid = memberid;
        this.post = post;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMemberid() {
        return memberid;
    }

    public void setMemberid(int memberid) {
        this.memberid = memberid;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    @Override
    public String toString() {
        return "Posts{" +
                "id=" + id +
                ", memberid=" + memberid +
                ", post='" + post + '\'' +
                '}';
    }
}
