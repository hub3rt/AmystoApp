package com.amysto.domain;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface EntityRepository extends PagingAndSortingRepository<Entity, String> {

    List<EntityRepository> findById(@Param("id") int id);
    List<EntityRepository> findByLibelle(@Param("libelle") String libelle);

}