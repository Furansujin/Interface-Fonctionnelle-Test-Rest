package fr.frenchml.interfacefonctionnelle.controller;
import fr.frenchml.interfacefonctionnelle.domain.Customer;
import fr.frenchml.interfacefonctionnelle.domain.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping(value = "/customer")
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping
    public Set<Customer> getAll(){

        return customerRepository.all();
    }
}
