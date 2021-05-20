package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonRestController {

	 @Autowired
	    private PersonRepository _personRepository;
	 
	    @GetMapping("/person")
	    @CrossOrigin(origins = "http://localhost:4200")
	    public List<Person> getAllPersons(){
	        return _personRepository.findAll();
	    }
	    @PostMapping("/addperson")
	    @CrossOrigin(origins = "http://localhost:4200")
		  public Person getAll(@RequestBody Person person) {
		   return _personRepository.save(person);
		  }
	    @GetMapping("/person/{id}")
	    @CrossOrigin(origins = "http://localhost:4200")
	    public Optional<Person> getPersonById(@PathVariable("id") String id) {
			return _personRepository.findById(id);   
		  }
	
}
