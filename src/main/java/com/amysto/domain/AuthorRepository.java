package com.amysto.domain;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface AuthorRepository extends PagingAndSortingRepository<Author, String> {

    List<AuthorRepository> findById(@Param("id") int id);
    List<AuthorRepository> findByLastName(@Param("lastName") String lastName);
    List<AuthorRepository> findByFirstName(@Param("firstNAme") String firstName);

}
