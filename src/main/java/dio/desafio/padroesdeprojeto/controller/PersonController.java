package dio.desafio.padroesdeprojeto.controller;

import dio.desafio.padroesdeprojeto.model.Person;
import dio.desafio.padroesdeprojeto.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("persons")
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @GetMapping
    public List<Person> getPersons() {
        return personRepository.findAll();
    }
}
