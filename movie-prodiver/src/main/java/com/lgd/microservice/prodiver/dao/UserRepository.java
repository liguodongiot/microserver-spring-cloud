package com.lgd.microservice.prodiver.dao;

import com.lgd.microservice.prodiver.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Describe:
 *
 * @author: liguodong
 * @datetime: 2018/1/23 23:55
 */
public interface UserRepository extends JpaRepository<User, Long>{


}
