package com.webapp.moviespace.services;

import java.util.List;
import com.webapp.moviespace.daos.IMovieDao;
import com.webapp.moviespace.models.Movie;


public class MovieService implements IMovieService {
	
	private IMovieDao movieDao ;
	
	public void setMovieDao(IMovieDao movieDao) {
		this.movieDao = movieDao;
	}
	
	

	public List<Movie> getAllMovies() {
		   
		   return movieDao.selectAllMovies();		
		   
	}

	public Movie getMovieById(String id) {
		
		return movieDao.selectById(id);
         
	}

	public void addNewMovie(Movie movie) {
		
		movieDao.insertNewMovie(movie);
		
	}



	public void updateMovieById(String id, Movie movie) {
		
		movieDao.updateMovieById(id, movie);
		
	}



	public void deleteMovieById(String id) {
		movieDao.deleteMovieById(id);
		
	}

}
