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
        Example<Person> example = Example.of(new Person(name));
        Optional<Person> one = repository.findOne(example);


        if(!one.isPresent()){
            throw new NotFoundException("");
        }
        return one.get();
    }

    public Long save(Person p) {
        return this.repository.save(p).getId();
    }
}
