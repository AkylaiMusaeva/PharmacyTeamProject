package model;

import enums.Gender;

import javax.xml.crypto.Data;

public class Worker {
    private Long id;
    private String name;
    private Data dateOfBirth;
    private String email;
    private Gender gender;

    public Worker() {
    }

    public Worker(Long id, String name, Data dateOfBirth, String email, Gender gender) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.gender = gender;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Data getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Data dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "model.Worker{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                '}';
    }
}
