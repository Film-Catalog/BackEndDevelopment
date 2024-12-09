package com.a3project.filmcatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.a3project.filmcatalog.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
