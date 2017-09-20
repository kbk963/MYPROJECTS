package com.tek.springboot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tek.springboot.model.Topic;
@Repository
public interface DbRepo extends CrudRepository<Topic, String> {

}
