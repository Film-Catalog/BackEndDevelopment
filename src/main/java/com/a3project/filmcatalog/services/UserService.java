package com.a3project.filmcatalog.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.a3project.filmcatalog.dto.UserDTO;
import com.a3project.filmcatalog.entities.User;
import com.a3project.filmcatalog.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	@Transactional(readOnly = true)
	public Page<UserDTO> findAll(Pageable pageable) {
		return repository.findAll(pageable).map(UserDTO::new);
	}

	@Transactional(readOnly = true)
	public UserDTO findById(Long id) {
		User user = repository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
		return new UserDTO(user);
	}

	@Transactional
	public UserDTO insert(UserDTO dto) {
		User user = new User();
		user.setEmail(dto.getEmail());
		user = repository.save(user);
		return new UserDTO(user);
	}

	@Transactional
	public UserDTO update(Long id, UserDTO dto) {
		User user = repository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
		user.setEmail(dto.getEmail());
		user = repository.save(user);
		return new UserDTO(user);
	}

	@Transactional
	public void delete(Long id) {
		if (!repository.existsById(id)) {
			throw new RuntimeException("User not found");
		}
		repository.deleteById(id);
	}
}
