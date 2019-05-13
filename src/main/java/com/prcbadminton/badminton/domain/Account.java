package com.prcbadminton.badminton.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "account")
public class Account implements Serializable {
    @Id
    @Column(name = "username")
    private String userame;
    @Column(name = "password")
    private String password;

    public Account() {
    }

    public Account(String userame, String password) {
        this.userame = userame;
        this.password = password;
    }

    public String getUserame() {
        return userame;
    }

    public Account setUserame(String userame) {
        this.userame = userame;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Account setPassword(String password) {
        this.password = password;
        return this;
    }
}
