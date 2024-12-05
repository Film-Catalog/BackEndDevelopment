package com.a3project.filmcatalog.dto;

import com.a3project.filmcatalog.entities.Movie;

public class MovieDTO {

	private Long id;
	private String title;
	private String synopsis;
	private String film_genre;
	private Double score;
	private Integer reviews;
	private Integer releasing_year;
	private Integer duration;
	private String image;

	public MovieDTO() {
		super();
	}

	public MovieDTO(Long id, String title, String synopsis, String film_genre, Double score, Integer reviews,
			Integer releasing_year, Integer duration, String image) {
		this.id = id;
		this.title = title;
		this.synopsis = synopsis;
		this.film_genre = film_genre;
		this.score = score;
		this.reviews = reviews;
		this.releasing_year = releasing_year;
		this.duration = duration;
		this.image = image;
	}

	public MovieDTO(Movie movie) {
		id = movie.getId();
		title = movie.getTitle();
		synopsis = movie.getSynopsis();
		film_genre = movie.getFilm_genre();
		score = movie.getScore();
		reviews = movie.getReviews();
		releasing_year = movie.getReleasing_year();
		duration = movie.getDuration();
		image = movie.getImage();
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

	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}

	public String getFilm_genre() {
		return film_genre;
	}

	public void setFilm_genre(String film_genre) {
		this.film_genre = film_genre;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public Integer getReviews() {
		return reviews;
	}

	public void setReviews(Integer reviews) {
		this.reviews = reviews;
	}

	public Integer getReleasing_year() {
		return releasing_year;
	}

	public void setReleasing_year(Integer releasing_year) {
		this.releasing_year = releasing_year;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

}
