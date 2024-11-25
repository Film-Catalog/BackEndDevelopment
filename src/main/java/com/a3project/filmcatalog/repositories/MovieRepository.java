package com.a3project.filmcatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.a3project.filmcatalog.entities.Media;

public interface MovieRepository extends JpaRepository<Media, Long> {

}
