package com.webapp.moviespace.services;

import java.util.List;
import com.webapp.moviespace.models.Movie;

public interface IMovieService {
	
	public List<Movie> getAllMovies();
	public Movie getMovieById(String id);
	public void addNewMovie(Movie movie);
	public void updateMovieById(String id, Movie movie);
	public void deleteMovieById(String id);

}
