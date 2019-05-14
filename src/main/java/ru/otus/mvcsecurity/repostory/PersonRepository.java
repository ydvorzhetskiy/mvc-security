package ru.otus.mvcsecurity.repostory;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.otus.mvcsecurity.domain.Person;

public interface PersonRepository extends JpaRepository<Person, Integer> {
}
