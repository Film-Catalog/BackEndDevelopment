package com.a3project.filmcatalog.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_movie")
public class Movie extends Media {

	private Integer duration;

	public Movie() {
	}

	public Movie(Long id, String title, Double score, Integer count, String image, Integer duration) {
		super(id, title, score, count, image);
		this.duration = duration;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}
}