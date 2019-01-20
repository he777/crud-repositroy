package com.sda.database.repository;

import java.util.List;
import java.util.Optional;

/**
* JPA specific extension of Repository
*
* @author Henry Aimre
* */

public interface CrudRepository<T> {

    /**
    * @(non-javadoc)
    * @see CrudRepository#findAll()
    * */

    List<T> findAll();

    /**
     * Retrieves an entity by its id.
     *
     * @param id must not be {@literal null}.
     * @return the entity with the given id or {@literal Optional#empty()} if none found
     * @throws IllegalArgumentException if {@code id} is {@literal null}.
     */

    Optional<T> findById(long id);

}
