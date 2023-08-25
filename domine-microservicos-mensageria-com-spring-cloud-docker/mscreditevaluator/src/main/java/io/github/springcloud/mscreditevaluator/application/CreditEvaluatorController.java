package io.github.springcloud.mscreditevaluator.application;

import io.github.springcloud.mscreditevaluator.application.service.CreditEvaluatorService;
import io.github.springcloud.mscreditevaluator.domain.CustomerStatus;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/credit-evaluator")
@RequiredArgsConstructor
public class CreditEvaluatorController {
    private final CreditEvaluatorService creditEvaluatorService;

    @GetMapping("/status")
    public String status() {
        return "mscreditevaluator/ok";
    }

    @GetMapping(value = "/evaluate", params = "cpf")
    public ResponseEntity<CustomerStatus> evaluateCustomerStatus(@RequestParam String cpf) {
        CustomerStatus customerStatus = creditEvaluatorService.getCustomerStatus(cpf);

        return ResponseEntity.ok(customerStatus);
    }
}
