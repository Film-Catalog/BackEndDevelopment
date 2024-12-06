package com.a3project.filmcatalog.factories;

import com.a3project.filmcatalog.dto.MovieDTO;
import com.a3project.filmcatalog.entities.Movie;

public interface MovieDTOFactory {
	MovieDTO createMovieDTO(Movie movie);
}
