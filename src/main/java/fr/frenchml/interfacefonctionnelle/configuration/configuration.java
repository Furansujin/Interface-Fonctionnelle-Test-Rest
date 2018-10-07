package fr.frenchml.interfacefonctionnelle.configuration;

import fr.frenchml.interfacefonctionnelle.adapters.InMemoryCustomerRepository;
import fr.frenchml.interfacefonctionnelle.domain.Customer;
import fr.frenchml.interfacefonctionnelle.domain.repositories.CustomerRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class configuration {

    @Bean
    public CustomerRepository customerRepository(){
        CustomerRepository customerRepository= new InMemoryCustomerRepository();
        customerRepository.add(new Customer( "1", "firstName1", "lastName1"));
        return customerRepository;
    }
}
