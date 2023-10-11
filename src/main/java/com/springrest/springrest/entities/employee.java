package com.springrest.springrest.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class employee {

	@Id
	private long id;
	private String name;
	private String post;
	public employee(long id, String name, String post) {
		super();
		this.id = id;
		this.name = name;
		this.post = post;
	}
	public employee() {
		super();
		// TODO Auto-generated constructor stub
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
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
}
	
	
	
	

