package com.a3project.filmcatalog.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.a3project.filmcatalog.dto.MovieDTO;
import com.a3project.filmcatalog.entities.Movie;
import com.a3project.filmcatalog.factories.MovieDTOFactory;
import com.a3project.filmcatalog.repositories.MovieRepository;

@Service
public class MovieService {

	@Autowired
	private MovieRepository repository;

	@Autowired
	private MovieDTOFactory factory;

	@Transactional(readOnly = true)
	public Page<MovieDTO> findAll(Pageable pageable) {
		Page<Movie> result = repository.findAll(pageable);
		return result.map(factory::createMovieDTO);
	}

	@Transactional(readOnly = true)
	public MovieDTO findById(Long id) {
		Movie result = repository.findById(id).orElseThrow(() -> new RuntimeException("Movie not found"));
		return factory.createMovieDTO(result);
	}
}
