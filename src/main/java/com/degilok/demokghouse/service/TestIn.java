package com.degilok.demokghouse.service;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TestIn<D>{

    default List<D> findAll(JpaRepository repository){
        return repository.findAll();
    }

}