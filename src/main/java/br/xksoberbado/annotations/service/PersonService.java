package br.xksoberbado.annotations.service;

import br.xksoberbado.annotations.model.Person;

public interface PersonService {

    Person save(Person person);

    Iterable<Person> findAll();
}
