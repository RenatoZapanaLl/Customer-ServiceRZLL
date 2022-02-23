package com.example.CustomerServiceRZLL.Service;

import com.example.CustomerServiceRZLL.Model.Customers;
import com.example.CustomerServiceRZLL.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ServiceCustomersImpl implements  ServiceCustomers{

    @Autowired
    CustomerRepository repository;

    @Override
    public Flux<Customers> findAll() {
        return repository.findAll();
    }

    @Override
    public Flux<Customers> findCustomersByNumber(String Number) {
        return repository.findAll().filter(x -> x.getNumber().equals(Number) );
    }
    @Override
    public Mono<Customers> save(Customers customers) {
        return repository.save(customers);
    }

    @Override
    public Mono<Customers> updateCustomer(Customers customers) {
        return repository.save(customers);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id).subscribe();
    }





}
