package com.project02.main.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project02.main.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{

}
