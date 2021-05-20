package com.example.demo;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class InitializationComponent {
	
	    @Autowired
	    private PersonRepository personRepository;

	    @PostConstruct
	    private void init(){
	        

	        Person _person=new Person();
	        
	        _person.setId("11141866");
	        _person.setFirstName("Srinivas");
	        _person.setSecondName("KR");
	        _person.setAge(29);
	        _person.setPartnerName("Nikitha");
	        _person.setWorkingCompany("Accenture");
	        _person.setInterestedCompany("TCS");
	        _person.setSalary(40000);
	        _person.setNumberOfChild(1);
	        _person.setChildName("Baby1");
	        _person.setNativePlace("Kurnool");
	        _person.setCurrentPlace("Bangalore");
	       
	        personRepository.save(_person);
	        
	        _person.setId("818866");
	        _person.setFirstName("Nikitha");
	        _person.setSecondName("KR");
	        _person.setAge(25);
	        _person.setPartnerName("Srinivas");
	        _person.setWorkingCompany("Home");
	        _person.setInterestedCompany("Home");
	        _person.setSalary(0);
	        _person.setNumberOfChild(1);
	        _person.setChildName("Baby1");
	        _person.setNativePlace("Kurnool");
	        _person.setCurrentPlace("Bangalore");
	       
	        personRepository.save(_person);
	        
	        _person.setId("908866");
	        _person.setFirstName("baby1");
	        _person.setSecondName("KR");
	        _person.setAge(0);
	        _person.setPartnerName("baby2");
	        _person.setWorkingCompany("Womb");
	        _person.setInterestedCompany("Google");
	        _person.setSalary(0);
	        _person.setNumberOfChild(0);
	        _person.setChildName("nobaby");
	        _person.setNativePlace("Kurnool");
	        _person.setCurrentPlace("Bangalore");
	       
	        personRepository.save(_person);

	        
	    }

}
