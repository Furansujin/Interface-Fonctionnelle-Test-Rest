package fr.frenchml.interfacefonctionnelle.domain.repositories;

import fr.frenchml.interfacefonctionnelle.domain.Customer;

import java.util.Set;

public interface CustomerRepository {

    void add(Customer customer);

    Set<Customer> all();
}
