/*package com.a3project.filmcatalog.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Media {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Long id;
	protected String title;
	@Lob
	protected String synopsis;
	protected Double score;
	protected Integer reviews;
	protected Integer releasing_year;
	protected String image;

	public Media() {
	}

	public Media(Long id, String title, String synopsis, Double score, Integer reviews, Integer releasing_year,
			String image) {
		this.id = id;
		this.title = title;
		this.synopsis = synopsis;
		this.score = score;
		this.reviews = reviews;
		this.releasing_year = releasing_year;
		this.image = image;
	}

	public long getId() {
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

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

}*/