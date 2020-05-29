package com.example.demo.model.util;

import lombok.Data;

@Data
public class Message {

	private String code;
	private String description;
	private Boolean success;

	public Message() {
		this.code = "1001";
		this.description = "Ejecutado correctamente";
		this.success=true;
	}
}