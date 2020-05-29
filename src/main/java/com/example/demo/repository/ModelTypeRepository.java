package com.example.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.dao.ModuleType;

public interface ModelTypeRepository extends CrudRepository<ModuleType, Integer>{
	
	List<ModuleType> findByActive(Boolean active);
	

}
