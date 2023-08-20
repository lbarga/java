package io.github.springcloud.msclients.application.representation;

import io.github.springcloud.msclients.domain.Customer;
import lombok.Data;

// representation or DTO class

@Data
public class CustomerSaveRequest {
    private String cpf;
    private String name;
    private Integer age;

    public Customer toModel() {
        return new Customer(cpf, name, age);
    }
}
