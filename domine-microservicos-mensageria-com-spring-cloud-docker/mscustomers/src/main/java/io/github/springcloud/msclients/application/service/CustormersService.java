package io.github.springcloud.msclients.application.service;

import io.github.springcloud.msclients.domain.Customer;
import io.github.springcloud.msclients.infra.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CustormersService {

    private final CustomerRepository customerRepository;

    @Transactional
    public Customer saveCustomer(Customer customer) {
        var currentCustomer = customerRepository.findByCpf(customer.getCpf());

        if (currentCustomer.isEmpty()) {
            return customerRepository.save(customer);
        }

        return null;
    }

    public Optional<Customer> getByCpf(String cpf) {
        return customerRepository.findByCpf(cpf);
    }

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }
}
