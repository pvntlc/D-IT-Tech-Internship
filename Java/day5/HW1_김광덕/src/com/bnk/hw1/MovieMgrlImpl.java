package com.bnk.hw1;


import java.util.ArrayList;

public class MovieMgrlImpl implements MovieMgrl {
	private ArrayList<Movie> movies = new ArrayList<>();
	private static MovieMgrl instance = new MovieMgrlImpl();

	public MovieMgrlImpl() {
	}

	public static MovieMgrl getInstance() {
		return instance;
	}

	@Override
	public void add(Movie m) {
		movies.add(m);
	}

	@Override
	public ArrayList<Movie> search() {
		return movies;
	}

	@Override
	public ArrayList<Movie> search(String title) {
		ArrayList<Movie> result = new ArrayList<>();
		for (Movie m : movies) {
			if (m.getTitle().equals(title)) {
				result.add(m);
			}
		}
		return result;
	}

	@Override
	public ArrayList<Movie> searchDirector(String name) {
		ArrayList<Movie> result = new ArrayList<>();
		for (Movie m : movies) {
			if (m.getDirector().equals(name)) {
				result.add(m);
			}
		}
		return result;
	}

	@Override
	public ArrayList<Movie> searchGenre(String genre) {
		ArrayList<Movie> result = new ArrayList<>();
		for (Movie m : movies) {
			if (m.getGenre().equals(genre)) {
				result.add(m);
			}
		}
		return result;
	}

	@Override
	public void delete(String title) {
		for (Movie m : movies) {
			if (m.getTitle().equals(title)) {
				movies.remove(m);
				break;
			}
		}
	}

	@Override
	public int getSize() {
		return movies.size();
	}

}
