package com.findmyband.model;

public class Member {
    private int id;
    private String firstname;
    private String lastname;
    private String username;
    private String password;
    private String city;
    private String state;
    private String special1;
    private String special2;
    private String special3;
    private String gender;
    private String genres;
    private int age;

    public Member() {
    }

    public Member(int id, String firstname, String lastname, String username, String password, String city, String state, String special1, String special2, String special3, String gender, String genres, int age) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.username = username;
        this.password = password;
        this.city = city;
        this.state = state;
        this.special1 = special1;
        this.special2 = special2;
        this.special3 = special3;
        this.gender = gender;
        this.genres = genres;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getSpecial1() {
        return special1;
    }

    public void setSpecial1(String special1) {
        this.special1 = special1;
    }

    public String getSpecial2() {
        return special2;
    }

    public void setSpecial2(String special2) {
        this.special2 = special2;
    }

    public String getSpecial3() {
        return special3;
    }

    public void setSpecial3(String special3) {
        this.special3 = special3;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGenres() {
        return genres;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", special1='" + special1 + '\'' +
                ", special2='" + special2 + '\'' +
                ", special3='" + special3 + '\'' +
                ", gender='" + gender + '\'' +
                ", genres='" + genres + '\'' +
                ", age=" + age +
                '}';
    }
}
