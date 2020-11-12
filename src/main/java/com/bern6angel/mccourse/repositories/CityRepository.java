package com.bern6angel.mccourse.repositories;

import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bern6angel.mccourse.domain.City;

@Repository
public interface CityRepository extends JpaRepository<City,Integer>{

	
}
