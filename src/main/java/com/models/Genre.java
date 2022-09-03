package com.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity @Data @AllArgsConstructor @NoArgsConstructor
public class Genre {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
}
