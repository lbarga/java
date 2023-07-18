package br.com.erudio.services;

import br.com.erudio.mocks.MockPerson;
import br.com.erudio.model.Person;
import br.com.erudio.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

// "@Service", Spring Boot automatically detects and registers it as a bean in the application's context.
// These service beans can be injected into other components, such as controllers or other services,
// using dependency injection. This allows for separation of concerns and promotes a modular and maintainable
// application design.
@Service
public class PersonServices {

    private final AtomicLong counter = new AtomicLong();

    @Autowired
    PersonRepository personRepository;

    private Logger logger = Logger.getLogger(PersonServices.class.getName());
    @Autowired
    private MockPerson mockPerson;

    public List<Person> findAll() {
        logger.info("finding all persons.");

        return personRepository.findAll();
    }

    public Person findById(String id) {
        logger.info("finding one person.");

        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Leandro");
        person.setLastName("Costa");
        person.setAddress("Uberlândia - Minas Gerais - Brasil");
        person.setGender("Male");

        return person;
    }

    public Person create(Person person) {
        logger.info("creating a person.");

        return personRepository.save(person);
    }

    public Person update(Person person) {
        logger.info("updating a person.");

        return person;
    }

    public void delete(String id) {
        logger.info("deleting a person.");
    }

}
