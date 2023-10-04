package com.bnk.hw1;


import java.util.ArrayList;

public interface MovieMgrl {

	void add(Movie m);

	ArrayList<Movie> search();

	ArrayList<Movie> search(String title);

	ArrayList<Movie> searchDirector(String name);

	ArrayList<Movie> searchGenre(String genre);

	void delete(String title);

	int getSize();

}