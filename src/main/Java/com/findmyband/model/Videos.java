package com.findmyband.model;

public class Videos {
    private int id;
    private int memberid;
    private String url;

    public Videos() {
    }

    public Videos(int id, int memberid, String url) {
        this.id = id;
        this.memberid = memberid;
        this.url = url;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "VideosDao{" +
                "id=" + id +
                ", memberid=" + memberid +
                ", url='" + url + '\'' +
                '}';
    }
}
