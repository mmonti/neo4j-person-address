package org.mmonti.neo4j.repository;

import org.mmonti.neo4j.model.Person;
import org.springframework.data.neo4j.repository.GraphRepository;

/**
 * Created by mmonti on 4/28/17.
 */
public interface PersonRepository extends GraphRepository<Person> {
}
