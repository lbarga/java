package io.github.springcloud.msclients.application;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomersController {

    @GetMapping
    public String getCustomers() {
        return "Hello World!  - getCustomers()";
    }
}
