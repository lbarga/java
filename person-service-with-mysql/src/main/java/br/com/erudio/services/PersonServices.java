package br.com.erudio.services;

import br.com.erudio.mocks.MockPerson;
import br.com.erudio.model.Person;
import br.com.erudio.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.module.ResolutionException;
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

    public Person findById(Long id) {
        logger.info("finding one person.");

        return personRepository.findById(id).orElseThrow(() -> {
                    logger.info("person not found.");
                    throw new ResolutionException("person not found.");
                }
        );
    }

    public Person create(Person person) {
        logger.info("creating a person.");

        if (person.getId() != null && personRepository.existsById(person.getId())) {
            logger.info("person already exists.");
            throw new IllegalArgumentException();
        }

        return personRepository.save(person);
    }

    public Person update(Person person) {
        logger.info("updating a person.");

        Person currentPerson = personRepository.findById(person.getId()).orElseThrow(() -> {
                    logger.info("no records found for this ID.");
                    throw new ResolutionException("no records found for this ID.");
                }
        );

        currentPerson.setFirstName(person.getFirstName());
        currentPerson.setLastName(person.getLastName());
        currentPerson.setAddress(person.getAddress());
        currentPerson.setGender(person.getGender());

        return personRepository.save(person);
    }

    public void delete(Long id) {
        logger.info("deleting a person.");

        Person currentPerson = personRepository.findById(id).orElseThrow(() -> {
                    logger.info("no records found for this ID.");
                    throw new ResolutionException("no records found for this ID.");
                }
        );

        personRepository.delete(currentPerson);
    }

}
