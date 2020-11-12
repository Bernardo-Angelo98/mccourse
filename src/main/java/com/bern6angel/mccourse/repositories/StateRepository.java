package com.bern6angel.mccourse.repositories;

import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bern6angel.mccourse.domain.State;

@Repository
public interface StateRepository extends JpaRepository<State,Integer>{

	
}
