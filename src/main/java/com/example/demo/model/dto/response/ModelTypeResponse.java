package com.example.demo.model.dto.response;

import java.util.List;

import com.example.demo.model.dto.model.dtoModelType;
import com.example.demo.model.util.BaseResponse;

import lombok.Data;

@Data
public class ModelTypeResponse extends BaseResponse {
	private List<dtoModelType> modelType;

	public ModelTypeResponse(List<dtoModelType> modelType) {
		super();
		this.modelType = modelType;
	}

	public ModelTypeResponse() {
		super();
	}
	
	
	
}
