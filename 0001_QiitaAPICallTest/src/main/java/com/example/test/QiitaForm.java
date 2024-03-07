package com.example.test;

import lombok.Data;

@Data
public class QiitaForm {

	private Integer page = 1;
	
	private Integer per_page = 1;
	
	private String query = "";
	
	QiitaForm() {
		page = 1;
		per_page = 1;
		query = "";
	}
}
