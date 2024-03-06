package com.example.test;

import org.hibernate.validator.constraints.Range;

import lombok.Data;

@Data
public class QiitaForm {

	@Range(min = 1)
	private int page;
	
	@Range(min = 1)
	private int per_page;
	
	private String query;
	
	public QiitaForm() {
		page = 1;
		per_page = 1;
		query = "";
	}
}
