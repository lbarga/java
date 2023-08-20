package io.github.springcloud.msclients.application;

import io.github.springcloud.msclients.application.representation.CustomerSaveRequest;
import io.github.springcloud.msclients.application.service.CustormersService;
import io.github.springcloud.msclients.domain.Customer;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/customers")
@RequiredArgsConstructor
public class CustomersController {

    private final CustormersService custormersService;

    @PostMapping
    public ResponseEntity save(@RequestBody CustomerSaveRequest request) {
        Customer customer = request.toModel();

        var currentCustomer = custormersService.saveCustomer(customer);

        if (currentCustomer != null) {
            URI headerLocation = ServletUriComponentsBuilder
                    .fromCurrentRequest()
                    .query("cpf={cpf}")
                    .buildAndExpand(customer.getCpf())
                    .toUri();

            return ResponseEntity.created(headerLocation).build();
        }

        return ResponseEntity.internalServerError().build();
    }

    @GetMapping(params = "cpf")
    public ResponseEntity getByCpf(@RequestParam("cpf") String cpf) {
        var customer = custormersService.getByCpf(cpf);

        if (customer.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(customer);
    }

    @GetMapping
    public ResponseEntity<List<Customer>> getAllCustomers() {
        var customers = custormersService.getAllCustomers();

        return ResponseEntity.ok(customers);
    }
}
