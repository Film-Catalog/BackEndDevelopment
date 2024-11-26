package com.a3project.filmcatalog.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.a3project.filmcatalog.dto.MovieDTO;
import com.a3project.filmcatalog.entities.Media;
import com.a3project.filmcatalog.repositories.MovieRepository;

@Service
public class MovieService {

	@Autowired
	private MovieRepository repository;

	public Page<MovieDTO> findAll(Pageable pageable) {
		Page<Media> result = repository.findAll(pageable);
		Page<MovieDTO> page = result.map(x -> new MovieDTO(x));
		return page;
	}

}
