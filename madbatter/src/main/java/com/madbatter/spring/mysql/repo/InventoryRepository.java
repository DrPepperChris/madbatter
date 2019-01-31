package com.madbatter.spring.mysql.repo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.repository.CrudRepository;

import com.madbatter.spring.mysql.repo.model.Inventory;

@SpringBootApplication
public interface InventoryRepository extends CrudRepository <Inventory, Long> {

}

