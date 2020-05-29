package com.example.demo.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.component.MessageService;
import com.example.demo.model.dao.ModuleType;
import com.example.demo.model.dto.model.dtoModelType;
import com.example.demo.model.dto.response.ModelTypeResponse;
import com.example.demo.model.util.Message;
import com.example.demo.model.util.NotFoundException;
import com.example.demo.repository.ModelTypeRepository;
import com.example.demo.service.ModelTypeService;


@Service
public class ModelTypeImpl implements ModelTypeService{

	  @Autowired
	   ModelTypeRepository repository;
	  
	    @Autowired
	   MessageService messages;

	@Override
	public ModelTypeResponse getModelType(String documentNumber) {
		ModelTypeResponse response = new ModelTypeResponse();
        List<dtoModelType> modules = repository.findByActive(true)
                .stream()
                .map(m -> new dtoModelType(m.getId(),m.getName(),m.getDescription(),m.getActive()))
                .collect(Collectors.toList());
	
        if(modules.isEmpty()) {
        	throw new NotFoundException(messages.get("Model type not found"));       	
        }
 
        response.setModelType(modules);
        response.setMessage(new Message());
		return response;

	}
	


}
