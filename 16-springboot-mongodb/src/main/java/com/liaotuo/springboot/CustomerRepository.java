package com.liaotuo.springboot;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author 18070959
 * @date 2019-03-19 2:19 PM
 * @description
 **/
public interface CustomerRepository extends MongoRepository<Customer, String> {
    Customer findByFirstName(String firstName);

    List<Customer> findByLastName(String lastName);
}