package com.example.chesshintapp;

public class PersonModel {
    private  String firstname;
    private String surname;
    private  String preference;

    public PersonModel(String firstname, String surname, String preference) {
        this.firstname = firstname;
        this.surname = surname;
        this.preference = preference;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPreference() {
        return preference;
    }

    public void setPreference(String preference) {
        this.preference = preference;
    }
}
