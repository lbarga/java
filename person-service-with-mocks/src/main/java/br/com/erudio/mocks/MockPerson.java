package br.com.erudio.mocks;

import br.com.erudio.model.Person;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

@Service
public class MockPerson {

    private final AtomicLong counter = new AtomicLong();

    public Person createMock(int i) {
        Person person = new Person();

        person.setId(counter.incrementAndGet());
        person.setFirstName("First Name Test " + i);
        person.setLastName("Last Name Test " + i);
        person.setAddress("Address Test " + i);
        person.setGender("Gender Test " + i);

        return person;
    }

}
