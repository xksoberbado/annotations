package br.xksoberbado.annotations.runner;

import br.xksoberbado.annotations.model.Person;
import br.xksoberbado.annotations.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class Mock implements ApplicationRunner {

    @Autowired
    private PersonRepository repository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        repository.save(new Person("João", LocalDate.now().minusYears(18).minusMonths(5)));
        repository.save(new Person("Maria", LocalDate.now().minusYears(21)));
    }
}
