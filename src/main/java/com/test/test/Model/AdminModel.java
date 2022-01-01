package com.test.test.Model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class AdminModel implements Serializable {
    //attribut
    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id ;
    @Column
    private String fullName ;
    @Column
    protected String username ;
    @Column
    protected String password ;

    //constructeur

    public AdminModel() {
    }

    public AdminModel(int id, String fullName, String username, String password) {
        super();
        this.id = id;
        this.fullName = fullName;
        this.username = username;
        this.password = password;
    }

    //Getters&Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
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
    //methodes

    @Override
    public String toString() {
        return "AdminModel{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
