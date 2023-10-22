package edu.ariane.gof.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DefinitionWordRepository extends CrudRepository<DefinitionWord, String> {

}