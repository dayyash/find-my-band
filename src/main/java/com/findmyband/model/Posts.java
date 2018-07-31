package com.findmyband.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.sql.Timestamp;

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

    @Column(name = "timestamp", nullable = false)
    @JsonProperty("timestamp")
    private Timestamp timestamp;

    public Posts() {
    }

    public Posts(int id, int memberid, String message) {
        this.id = id;
        this.memberid = memberid;
        this.message = message;
    }

    public Posts(int memberid, String message, Timestamp timestamp) {
        this.memberid = memberid;
        this.message = message;
        this.timestamp = timestamp;
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

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Posts{" +
                "id=" + id +
                ", memberid=" + memberid +
                ", message='" + message + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}
