package com.a3project.filmcatalog.entities;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_movie")
public class Movie {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
	private String synopsis;
	private String film_genre;
	private Double score;
	private Integer reviews;
	private Integer releasing_year;
	private Integer duration;
	private String image;

	@OneToMany(mappedBy = "id.movie")
	private Set<Score> scores = new HashSet<>();

	public Movie() {
	}

	public Movie(Long id, String title, String synopsis, String film_genre, Double score, Integer reviews,
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

	public Set<Score> getScores() {
		return scores;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Movie other = (Movie) obj;
		return Objects.equals(id, other.id);
	}
}