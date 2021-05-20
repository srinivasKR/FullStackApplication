package com.example.demo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(collection = "persons")
public class Person {
	@Id
	public String id;
	public String firstName;
	public String secondName;
	public int age;
	public String partnerName;
	public String workingCompany;
	public String interestedCompany;
	public int salary;
	public int numberOfChild;
	public String childName;
	public String nativePlace;
	public String currentPlace;
	
	public Person() {
		
	}
	
	public Person(String id, String firstName, String secondName, int age, String partnerName, String workingCompany,
			String interestedCompany, int salary, int numberOfChild, String childName, String nativePlace,
			String currentPlace) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.secondName = secondName;
		this.age = age;
		this.partnerName = partnerName;
		this.workingCompany = workingCompany;
		this.interestedCompany = interestedCompany;
		this.salary = salary;
		this.numberOfChild = numberOfChild;
		this.childName = childName;
		this.nativePlace = nativePlace;
		this.currentPlace = currentPlace;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPartnerName() {
		return partnerName;
	}
	public void setPartnerName(String partnerName) {
		this.partnerName = partnerName;
	}
	public String getWorkingCompany() {
		return workingCompany;
	}
	public void setWorkingCompany(String workingCompany) {
		this.workingCompany = workingCompany;
	}
	public String getInterestedCompany() {
		return interestedCompany;
	}
	public void setInterestedCompany(String interestedCompany) {
		this.interestedCompany = interestedCompany;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getNumberOfChild() {
		return numberOfChild;
	}
	public void setNumberOfChild(int numberOfChild) {
		this.numberOfChild = numberOfChild;
	}
	public String getChildName() {
		return childName;
	}
	public void setChildName(String childName) {
		this.childName = childName;
	}
	public String getNativePlace() {
		return nativePlace;
	}
	public void setNativePlace(String nativePlace) {
		this.nativePlace = nativePlace;
	}
	public String getCurrentPlace() {
		return currentPlace;
	}
	public void setCurrentPlace(String currentPlace) {
		this.currentPlace = currentPlace;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", firstName=" + firstName + ", secondName=" + secondName + ", age=" + age
				+ ", partnerName=" + partnerName + ", workingCompany=" + workingCompany + ", interestedCompany="
				+ interestedCompany + ", salary=" + salary + ", numberOfChild=" + numberOfChild + ", childName="
				+ childName + ", nativePlace=" + nativePlace + ", currentPlace=" + currentPlace + "]";
	}
	
	
	
}
