package com.findmyband.data;

import com.findmyband.model.Member;

import java.io.Serializable;

public interface MemberDao extends BaseDao<Member> {
    Member getMemberByUsername(String username, String password);
    Member updateFirstname(String firstname, Serializable id);
    Member updateLastname(String lastname, Serializable id);
    Member updateUsername(String username, Serializable id);
    Member updatePassword(String password, Serializable id);
    Member updateCity(String city, Serializable id);
    Member updateState(String state, Serializable id);
    Member updateSpecialty(String specialty, Serializable id);
    Member updateWebsite(String website, Serializable id);
    Member updateGender(String gender, Serializable id);
    Member updateGenre(String genre, Serializable id);
    Member updateAge(Serializable age, Serializable id);
}
