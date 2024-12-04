package com.a3project.filmcatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.a3project.filmcatalog.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
