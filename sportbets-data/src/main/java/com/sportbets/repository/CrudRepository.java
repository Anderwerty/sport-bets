package com.sportbets.repository;

import java.util.Optional;

public interface CrudRepository<E, ID> {

    Optional<E> findById(ID id);

    E save (E entity);
}
