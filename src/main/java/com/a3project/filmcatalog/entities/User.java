package com.a3project.filmcatalog.entities;

public class User {

	private Long id;
	private String username;
	private String email;

	public User() {
	}

	public User(String username, String email) {
		this.username = username;
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}