package com.bnk.hw1;


public class Movie {
	private String title;
	private String director;
	private int grade;
	private String genre;
	private String summary;

	public Movie() {
		super();
	}

	public Movie(String title, String director, int grade, String genre) {
		super();
		this.title = title;
		this.director = director;
		this.grade = grade;
		this.genre = genre;
	}

	public Movie(String title, String director, int grade, String genre, String summary) {
		super();
		this.title = title;
		this.director = director;
		this.grade = grade;
		this.genre = genre;
		this.summary = summary;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Movie [title=");
		builder.append(title);
		builder.append(", director=");
		builder.append(director);
		builder.append(", grade=");
		builder.append(grade);
		builder.append(", genre=");
		builder.append(genre);
		builder.append(", summary=");
		builder.append(summary);
		builder.append("]");
		return builder.toString();
	}

}
