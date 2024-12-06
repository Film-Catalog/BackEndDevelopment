package com.a3project.filmcatalog.factories;

import org.springframework.stereotype.Component;

import com.a3project.filmcatalog.dto.MovieDTO;
import com.a3project.filmcatalog.entities.Movie;

@Component
public class DefaultMovieDTOFactory implements MovieDTOFactory {

	@Override
	public MovieDTO createMovieDTO(Movie movie) {
		return new MovieDTO(movie.getId(), movie.getTitle(), movie.getSynopsis(), movie.getFilm_genre(),
				movie.getScore(), movie.getReviews(), movie.getReleasing_year(), movie.getDuration(), movie.getImage());
	}
}