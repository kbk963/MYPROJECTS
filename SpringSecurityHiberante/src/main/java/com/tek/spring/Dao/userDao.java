package com.tek.spring.Dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tek.spring.model.user;

@Repository
public interface userDao extends CrudRepository<user, String>{

}
