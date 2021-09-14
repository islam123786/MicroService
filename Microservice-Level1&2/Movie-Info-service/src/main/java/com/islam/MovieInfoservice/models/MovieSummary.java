package com.islam.MovieInfoservice.models;

public class MovieSummary {
	
	private String title;
	private String id;
	private String overview;
	public MovieSummary() {
		super();
	}
	public MovieSummary(String title, String id, String overview) {
		super();
		this.title = title;
		this.id = id;
		this.overview = overview;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getOverview() {
		return overview;
	}
	public void setOverview(String overview) {
		this.overview = overview;
	}	

}
