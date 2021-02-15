package com.example.demo.entity;

import com.sun.xml.internal.ws.developer.Serialization;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "PERSON")
@Getter
@Setter

public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "NAME", length = 50, nullable = false)
    private String name;

    public Person(String nome) {
        this.name = nome;
    }

    public Person(){

    }
}
