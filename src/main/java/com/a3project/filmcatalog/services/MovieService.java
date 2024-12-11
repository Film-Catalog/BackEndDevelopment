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

import jakarta.persistence.EntityNotFoundException;

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

	@Transactional
	public MovieDTO insert(MovieDTO dto) {
		Movie entity = new Movie();
		copyDtoToEntity(dto, entity);
		entity = repository.save(entity);
		return factory.createMovieDTO(entity);
	}

	@Transactional
	public MovieDTO update(Long id, MovieDTO dto) {
		try {
			Movie entity = repository.getReferenceById(id);
			copyDtoToEntity(dto, entity);
			entity = repository.save(entity);
			return factory.createMovieDTO(entity);
		} catch (EntityNotFoundException e) {
			throw new RuntimeException("Id not found " + id);
		}
	}

	@Transactional
	public void delete(Long id) {
		if (!repository.existsById(id)) {
			throw new RuntimeException("Id not found " + id);
		}
		repository.deleteById(id);
	}

	private void copyDtoToEntity(MovieDTO dto, Movie entity) {
		entity.setTitle(dto.getTitle());
		entity.setSynopsis(dto.getSynopsis());
		entity.setFilm_genre(dto.getFilm_genre());
		entity.setScore(dto.getScore());
		entity.setReviews(dto.getReviews());
		entity.setReleasing_year(dto.getReleasing_year());
		entity.setDuration(dto.getDuration());
		entity.setImage(dto.getImage());
	}
}