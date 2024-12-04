package com.a3project.filmcatalog.entities;

public class Comment {

	private Long id;
	private String text;

	private User user;
	private Movie movie;

	public Comment() {
	}

	public Comment(String text, User user, Movie movie) {
		this.text = text;
		this.user = user;
		this.movie = movie;
	}

	public Long getId() {
		return id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Movie getMedia() {
		return movie;
	}

	public void setMedia(Movie media) {
		this.movie = media;
	}
}