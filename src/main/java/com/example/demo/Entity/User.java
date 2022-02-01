package com.example.demo.Entity;

import org.hibernate.validator.constraints.NotBlank;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.Auto)
	@NotBlank
	 
	private Integer Id;
	@NotBlank
	@NotNull
	@Size(max = 30)
	
	private String Firstname;
	@NotBlank
	@NotNull
	@Size(max = 30)
	
	private String lastName;
	@Range(min = 0)
	private Integer age;
	@NotBlank
	@NotNull
	@Size(max = 50)
	
	private String city;
	@NotBlank
	@NotNull
	
	private Integer pin;
	@NotBlank
	@NotNull
	@Size(max = 50)
	
	private String street;
	@NotBlank
	@NotNull
	@Size(max = 10)
	
	private Integer phoneNumber;
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Integer getPin() {
		return pin;
	}
	public void setPin(Integer pin) {
		this.pin = pin;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public Integer getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Integer phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	

}
