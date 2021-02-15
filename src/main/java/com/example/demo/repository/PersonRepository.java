package com.example.demo.repository;

import com.example.demo.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface PersonRepository extends JpaRepository<Person, Long> , QueryByExampleExecutor<Person> {
}
