package com.example.demo.model.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



import lombok.Data;

@Data
@Entity
@Table(name = "app_module_type")
public class ModuleType {
	
	@Id
	@Column(name = "idmodule_type")
	private Integer id;
	
	@Column(name = "name")
	private String name;

	@Column(name = "description")
	private String description;
	
	@Column(name = "active")
	private Boolean active;
}
