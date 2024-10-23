package com.a3project.filmcatalog.entities;

public class Series extends Media {

	private Integer seasons;
	private Integer[] episodesPerSeason;

	public Series() {
	}

	public Series(long id, String title, Double score, Integer count, String image, Integer seasons, Integer[] episodesPerSeason) {
		super(id, title, score, count, image);
		this.seasons = seasons;
		this.episodesPerSeason = episodesPerSeason;
	}

	public Integer getSeasons() {
		return seasons;
	}

	public void setSeasons(Integer seasons) {
		this.seasons = seasons;
	}

	public Integer[] getEpisodesPerSeason() {
		return episodesPerSeason;
	}

	public void setEpisodesPerSeason(Integer[] episodesPerSeason) {
		this.episodesPerSeason = episodesPerSeason;
	}

}
