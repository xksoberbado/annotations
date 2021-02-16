package br.xksoberbado.annotations.service;

import br.xksoberbado.annotations.model.Person;
import br.xksoberbado.annotations.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository repository;

    @Override
    public Person save(Person person) {
        return repository.save(person);
    }

    @Override
    public Iterable<Person> findAll() {
        return repository.findAll();
    }
}
