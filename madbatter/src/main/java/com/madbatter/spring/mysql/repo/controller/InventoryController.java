package com.madbatter.spring.mysql.repo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
 
import javax.validation.Valid;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
import com.madbatter.spring.mysql.repo.model.Inventory;
import com.madbatter.spring.mysql.repo.InventoryRepository;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/api")
public class InventoryController {

	
	//need to add application interface logic here we need to be able to add or remove items from the site. EG
	
	// post mapping 
	
	// get mapping
	
	// put mapping 
	
	// delete mapping
}
