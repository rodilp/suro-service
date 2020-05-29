package com.example.demo.model.util;

import lombok.Data;

@Data
public class BaseResponse {

	private Message message;

	public BaseResponse() {
		this.message = new Message();
	
	}
}