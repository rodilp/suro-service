package com.example.demo.model.util;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BaseException {

	private String exceptionCategory = "";
	private String exceptionCode = "";
	private String exceptionMessage = "";
	private String exceptionDetail = "";
	private String exceptionSeverity = "";

	public BaseException(String exceptionCategory, String exceptionCode, String exceptionMessage,
			String exceptionDetail, String exceptionSeverity) {
		super();
		this.exceptionCategory = exceptionCategory;
		this.exceptionCode = exceptionCode;
		this.exceptionMessage = exceptionMessage;
		this.exceptionDetail = exceptionDetail;
		this.exceptionSeverity = exceptionSeverity;
	}

}
