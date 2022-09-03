package com.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity @Data @AllArgsConstructor @NoArgsConstructor
public class AppUser {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String username;
    private String password;
    @ManyToMany(fetch = FetchType.EAGER)
    private Collection<Role> roles = new ArrayList<>();
    @ManyToMany(fetch = FetchType.EAGER)
    private Collection<Book> books = new ArrayList<>();
}
