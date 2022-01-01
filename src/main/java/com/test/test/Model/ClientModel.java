package com.test.test.Model;
import javax.persistence.*;
import java.io.Serializable;

@Entity
public class ClientModel implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long code;
    @Column
    private String nom;
    @Column
    private String email;
    @Column
    private String password;
   //
    public ClientModel() {
        super();
    }
    public ClientModel(String nom, String email, String password) {
       // this.code = code;
        this.nom = nom;
        this.email = email;
        this.password = password;
       // this.compte = compte;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "ClientModel{" +
                "code=" + code +
                ", nom='" + nom + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password +
                '}';
    }
}
