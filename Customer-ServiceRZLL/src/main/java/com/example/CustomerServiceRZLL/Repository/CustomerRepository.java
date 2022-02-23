package com.example.CustomerServiceRZLL.Repository;

import com.example.CustomerServiceRZLL.Model.Customers;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends ReactiveMongoRepository<Customers,String> {

}
