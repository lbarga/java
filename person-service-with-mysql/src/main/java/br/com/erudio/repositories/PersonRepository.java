package br.com.erudio.repositories;

import br.com.erudio.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

//@Repository // This annotation is optional
public interface PersonRepository extends JpaRepository<Person, Long> {
}
