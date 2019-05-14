package ru.otus.mvcsecurity.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.otus.mvcsecurity.domain.Person;
import ru.otus.mvcsecurity.repostory.PersonRepository;

import java.util.List;

@Controller
public class PersonController {

    private final PersonRepository repository;

    @Autowired
    public PersonController(PersonRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/list")
    public String listPage(Model model) {
        List<Person> persons = repository.findAll();
        model.addAttribute("persons", persons);
        return "list";
    }
}
