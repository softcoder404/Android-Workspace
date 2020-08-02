package com.example.recyclerandcardview;

public class PersonModel {
    private  String name;
    private  String surname;
    private String pref; //choose either plane or bus

    public PersonModel(String name, String surname, String pref) {
        this.name = name;
        this.surname = surname;
        this.pref = pref;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPref() {
        return pref;
    }

    public void setPref(String pref) {
        this.pref = pref;
    }
}
