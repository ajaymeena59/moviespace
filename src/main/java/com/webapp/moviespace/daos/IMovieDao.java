package com.webapp.moviespace.daos;

import com.webapp.moviespace.models.Movie;
import java.util.List;

public interface IMovieDao {
	
	public List<Movie> selectAllMovies();
	public Movie selectById(String id);

}
