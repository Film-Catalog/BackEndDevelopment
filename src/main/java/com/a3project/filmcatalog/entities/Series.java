/*package com.a3project.filmcatalog.entities;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.util.List;

@Entity
@Table(name = "tb_series")
public class Series extends Media {

	private Integer seasons;

	@ElementCollection
	private List<Integer> episodesPerSeason;

	public Series() {
	}

	public Series(Long id, String title, String synopsis, Double score, Integer reviews, Integer releasing_year,
			String image, Integer seasons, List<Integer> episodesPerSeason) {
		super(id, title, synopsis, score, reviews, releasing_year, image);
		this.seasons = seasons;
		this.episodesPerSeason = episodesPerSeason;
	}

	public Integer getSeasons() {
		return seasons;
	}

	public void setSeasons(Integer seasons) {
		this.seasons = seasons;
	}

	public List<Integer> getEpisodesPerSeason() {
		return episodesPerSeason;
	}

	public void setEpisodesPerSeason(List<Integer> episodesPerSeason) {
		this.episodesPerSeason = episodesPerSeason;
	}

	@Override
	public String toString() {
		return "Series{" + "id=" + getId() + ", title='" + getTitle() + '\'' + ", synopsis='" + getSynopsis() + '\''
				+ ", score=" + getScore() + ", reviews=" + getReviews() + ", releasing_year=" + getReleasing_year()
				+ ", image='" + getImage() + '\'' + ", seasons=" + seasons + ", episodesPerSeason=" + episodesPerSeason
				+ '}';
	}
}*/
