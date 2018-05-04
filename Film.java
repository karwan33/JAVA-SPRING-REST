package com.example.demo2.film;

public class Film {
	
	private String id;
	private String title;
	private String description;
	private String DateOfProduction;
	
	public Film() {	}
	
	
	public Film(String id, String title, String description,String dateOfProduction) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.DateOfProduction=dateOfProduction;
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDateOfProduction() {
		return DateOfProduction;
	}
	public void setDateOfProduction(String dateOfProduction) {
		this.DateOfProduction = dateOfProduction;
	}
	
	

}
