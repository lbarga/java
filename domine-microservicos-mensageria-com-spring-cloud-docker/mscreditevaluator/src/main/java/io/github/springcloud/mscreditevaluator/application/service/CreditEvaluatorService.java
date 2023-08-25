package io.github.springcloud.mscreditevaluator.application.service;

import io.github.springcloud.mscreditevaluator.domain.CustomerCreditCard;
import io.github.springcloud.mscreditevaluator.domain.CustomerData;
import io.github.springcloud.mscreditevaluator.domain.CustomerStatus;
import io.github.springcloud.mscreditevaluator.infra.clients.CreditCardsResourceClient;
import io.github.springcloud.mscreditevaluator.infra.clients.CustomersResourceClient;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CreditEvaluatorService {

    private final CustomersResourceClient customersResourceClient;
    private final CreditCardsResourceClient creditCardsResourceClient;

    public CustomerStatus getCustomerStatus(String cpf) {
        ResponseEntity<CustomerData> customerDataResponse = customersResourceClient.getByCpf(cpf);
        ResponseEntity<List<CustomerCreditCard>> customerCreditCardsResponse = creditCardsResourceClient.getCreditCardsByCustomerCpf(cpf);

        return CustomerStatus
                .builder()
                .customerData(customerDataResponse.getBody())
                .customerCreditCards(customerCreditCardsResponse.getBody())
                .build();
    }
}
