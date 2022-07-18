package com.jdc.book.root.dto;

import lombok.Data;

@Data
public class Category {

	private int id;
	private String name;
	
	public Category() {
	}

	public Category(String name) {
		super();
		this.name = name;
	}

}