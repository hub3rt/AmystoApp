package com.amysto.domain;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface PersonRepository extends MongoRepository<Person, String> {

    List<Person> findByLastName(@Param("lastName") String lastName);
    List<Person> findByFirstName(@Param("firstName") String firstName);
    List<Person> findById(@Param("id") int id);
}