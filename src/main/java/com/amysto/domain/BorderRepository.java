package com.amysto.domain;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface BorderRepository extends PagingAndSortingRepository<Border, String> {

    List<BorderRepository> findById(@Param("id") int id);

}

