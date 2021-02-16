package br.xksoberbado.annotations.repository;

import br.xksoberbado.annotations.model.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long> {
}
