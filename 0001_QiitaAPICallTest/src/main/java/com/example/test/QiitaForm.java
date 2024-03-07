package com.example.test;

import org.hibernate.validator.constraints.Range;

import lombok.Data;

@Data
public class QiitaForm {
	
	@Range(min = 1, message = "ページは１以上にしてください")
	private int page = 1;
	
	//@Min(value = 1, message = "ページ番号は１以上にしてください")
	private int per_page = 1;
	
	private String query = "";
	
	QiitaForm() {
		page = 1;
		per_page = 1;
		query = "";
	}
}
