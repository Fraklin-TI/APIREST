package com.example.APIREST.Domain;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.lang.NonNull;

import java.util.Set;

@Document
public class ApiDomain {

    @Id
    private String id;
    @Indexed(unique = true)
    @NonNull
    private String name;
    private String login;
    private int senha;
    private Set<String> administrador;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
    
    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public Set<String> getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Set<String> administrador) {
        this.administrador = administrador;
    }

	}
