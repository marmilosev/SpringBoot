package com.example.demo;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudentRepository extends CrudRepository<Student, Long> {

    List<Student> findByFirstName(String firstName);
    List<Student> findByLastName(String lastName);

    Student findById(long id);
}
