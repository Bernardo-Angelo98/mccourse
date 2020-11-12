package com.bern6angel.mccourse.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bern6angel.mccourse.domain.Category;
import com.bern6angel.mccourse.repositories.CategoryRepository;
import java.util.Optional;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repo;
	
	public Category find(Integer id) {
		Optional<Category> obj = repo.findById(id);
		return obj.orElse(null);
	}
}	
