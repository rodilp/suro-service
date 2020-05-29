package com.example.demo.model.dto.model;

import lombok.Data;

@Data
public class dtoModelType {
	private Integer id;
	private String name;
	private String description;
	private Boolean active;
	
	
	public dtoModelType(Integer integer, String name, String description, Boolean boolean1) {
		super();
		this.id = integer;
		this.name = name;
		this.description = description;
		this.active = boolean1;
	}


	public dtoModelType() {
		super();
	}
	
	
}
