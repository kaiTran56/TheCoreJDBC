package com.tranquyet.model;

public class Category {
	private String idCategory;
	private String nameCategory;

	public Category() {

	}

	public Category(String idCategory, String nameCategory) {
		super();
		this.idCategory = idCategory;
		this.nameCategory = nameCategory;
	}

	public String getIdCategory() {
		return idCategory;
	}

	public void setIdCategory(String idCategory) {
		this.idCategory = idCategory;
	}

	public String getNameCategory() {
		return nameCategory;
	}

	public void setNameCategory(String nameCategory) {
		this.nameCategory = nameCategory;
	}

	public String toString() {
		return "Id: " + this.idCategory + "\nName: " + this.nameCategory;
	}
}
