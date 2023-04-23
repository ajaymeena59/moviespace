package com.webapp.moviespace.daos;

import com.webapp.moviespace.models.Movie;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import com.webapp.moviespace.mappers.MovieRowMapper;

public class MovieDao implements IMovieDao {
	
	private JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	

	public List<Movie> selectAllMovies() {
		
		String query = "select * from hollywood_movies";
		
		List<Movie> movies = template.query(query, new MovieRowMapper());
		
		return movies;
	}


	public Movie selectById(String id) {
		
		String query = "select * from hollywood_movies where movie_id='"+id+"'";
		
	  Movie movie =	template.queryForObject(query, new MovieRowMapper());
		
		return movie;
	}
	
	

}
