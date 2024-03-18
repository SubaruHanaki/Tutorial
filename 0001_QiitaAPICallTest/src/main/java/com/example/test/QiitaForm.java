package com.example.test;

import org.hibernate.validator.constraints.Range;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class QiitaForm {
	
	@NotNull
	@Range(min = 1,max=255)//, message = "ページは１以上にしてください"
	private int page = 1;
	
	@Min(value = 1)//, message = "ページ番号は１以上にしてください"
	@Max(value = 256)
	private int per_page = 1;
	
	private String query = "";
	
	QiitaForm() {
		page = 1;
		per_page = 1;
		query = "";
	}
}
