package br.xksoberbado.annotations.controller;

import br.xksoberbado.annotations.model.Person;
import br.xksoberbado.annotations.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/people")
public class PersonController {

    @Autowired
    private PersonService service;

    @GetMapping
    public ResponseEntity<?> all() {
        return ResponseEntity.ok(this.service.findAll());
    }

    @PostMapping
    public ResponseEntity<?> post(@RequestBody Person person) {
        return ResponseEntity.ok(this.service.save(person));
    }

}
