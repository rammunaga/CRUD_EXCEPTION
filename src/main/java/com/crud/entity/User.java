package com.crud.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {
	
	@Id
	private long id;
	private String name;
	private String address;
	private int age;

	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(long id, String name, String address, int age) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.age = age;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", address=" + address + ", age=" + age + "]";
	}

	
}
