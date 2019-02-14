package com.example.arun.recyclerview;

public class Person {

    private String Name;
    private String Surname;
    private String Preference;

    public Person(String name, String surname, String preference) {
        Name = name;
        Surname = surname;
        Preference = preference;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public String getPreference() {
        return Preference;
    }

    public void setPreference(String preference) {
        Preference = preference;
    }
}
