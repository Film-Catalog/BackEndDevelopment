package com.a3project.filmcatalog.dto;

import com.a3project.filmcatalog.entities.Movie;

public class MovieDTO {

	protected Long id;
	protected String title;
	protected Double score;
	protected Integer count;
	protected String image;
	private Integer duration;

	public MovieDTO() {
		super();
	}

	public MovieDTO(Long id, String title, Double score, Integer count, String image, Integer duration) {
		super();
		this.id = id;
		this.title = title;
		this.score = score;
		this.count = count;
		this.image = image;
		this.duration = duration;
	}

	public MovieDTO(Movie movie) {
		id = movie.getId();
		title = movie.getTitle();
		score = movie.getScore();
		count = movie.getCount();
		image = movie.getImage();
		duration = movie.getDuration();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

}
