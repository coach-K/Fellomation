package com.andela.fellomation.model;

/**
 * Created by andela on 2/12/16.
 */
public class Fellow {
    private int id;
    private String fullname;
    private String gender;

    public Fellow() {
    }

    public Fellow(int id, String fullname, String gender) {
        this.id = id;
        this.fullname = fullname;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
