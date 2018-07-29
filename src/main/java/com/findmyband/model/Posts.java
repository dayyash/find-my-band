package com.findmyband.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name = "posts", schema = "public")
@NamedQuery(
        name = "getAllPosts",
        query = "From Posts Order By id desc"
)
public class Posts {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("id")
    private int id;

    @Column(name = "memberid", nullable = false)
    @JsonProperty("memberid")
    private int memberid;

    @Column(name = "message", nullable = false)
    @JsonProperty("message")
    private String message;

    public Posts() {
    }

    public Posts(int id, int memberid, String message) {
        this.id = id;
        this.memberid = memberid;
        this.message = message;
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

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Posts{" +
                "id=" + id +
                ", memberid=" + memberid +
                ", message='" + message + '\'' +
                '}';
    }
}
