package io.github.springcloud.msclients.infra.repository;

import io.github.springcloud.msclients.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
