package com.liaotuo.springboot.domain.p;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * @author 18070959
 * @create 2018-12-10 4:32 PM
 * @desc
 **/
public interface UserRepository extends JpaRepository<User, Long> {

}
