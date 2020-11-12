package com.bern6angel.mccourse;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bern6angel.mccourse.domain.Category;
import com.bern6angel.mccourse.domain.City;
import com.bern6angel.mccourse.domain.Product;
import com.bern6angel.mccourse.domain.State;
import com.bern6angel.mccourse.repositories.CategoryRepository;
import com.bern6angel.mccourse.repositories.CityRepository;
import com.bern6angel.mccourse.repositories.ProductRepository;
import com.bern6angel.mccourse.repositories.StateRepository;

@SpringBootApplication
public class MccourseApplication implements CommandLineRunner{

	@Autowired
	CategoryRepository categoryRepository;
	
	@Autowired
	ProductRepository productRepository;
	
	@Autowired
	StateRepository stateRepository;
	
	@Autowired
	CityRepository cityRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(MccourseApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Category cat1 = new Category(null,"Informática");
		Category cat2 = new Category(null,"Escritório");
		
		Product p1 = new Product(null,"Computador",2000.00);
		Product p2 = new Product(null,"Impressora",800.00);
		Product p3 = new Product(null,"Mouse",80.00);
		
		cat1.getProducts().addAll(Arrays.asList(p1,p2,p3));
		cat2.getProducts().addAll(Arrays.asList(p2));
		
		p1.getCategories().addAll(Arrays.asList(cat1));
		p2.getCategories().addAll(Arrays.asList(cat1,cat2));
		p3.getCategories().addAll(Arrays.asList(cat1));
		
		categoryRepository.saveAll(Arrays.asList(cat1,cat2));
		productRepository.saveAll(Arrays.asList(p1,p2,p3));
		
		State est1 = new State(null,"Minas Gerais");
		State est2 = new State(null,"São Paulo");
		
		
		City c1 = new City(null,"Uberlândia",est1);
		City c2 = new City(null,"São Paulo",est2);
		City c3 = new City(null,"Campinas",est2);
		
		est1.getCidades().addAll(Arrays.asList(c1));
		est2.getCidades().addAll(Arrays.asList(c2,c3));
		
		stateRepository.saveAll(Arrays.asList(est1,est2));
		cityRepository.saveAll(Arrays.asList(c1,c2,c3));
		
		
	}

}
