package com.liaotuo.springboot;

import org.springframework.data.repository.CrudRepository;

/**
 * @author 18070959
 * @date 2019-03-20 10:15 AM
 * @description
 **/

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
public interface UserRepository extends CrudRepository<User, Integer> {
    User findUserByName(String name);
}
