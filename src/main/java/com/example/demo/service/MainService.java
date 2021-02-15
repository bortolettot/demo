package com.example.demo.service;

import com.example.demo.entity.Person;
import com.example.demo.repository.PersonRepository;
import javassist.NotFoundException;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MainService {

    private final PersonRepository repository;

    public MainService(PersonRepository repository) {
        this.repository = repository;
    }


    public Person find(String name) throws NotFoundException {

        Person one = repository.lkjflkdsjf(name);


        return one;
    }

    public Long save(Person p) {
        return this.repository.save(p).getId();
    }
}
