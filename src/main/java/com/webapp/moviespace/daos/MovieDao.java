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


	public void insertNewMovie(Movie movie) {
		
		String query = "insert into hollywood_movies (movie_name, star_cast, imdb_rating, movie_genre, release_year) values(?, ?, ?, ?, ?)";
		
		int inserted = template.update(query, movie.getMovieName(), movie.getStarCast(), movie.getImdbRating(), movie.getMovieGenre(), movie.getReleaseYear());
		
		System.out.println("inserted in db :"+ inserted);
		
	}


	public void updateMovieById(String id, Movie movie) {
		
		String query = "update hollywood_movies set movie_name=?, star_cast=?, imdb_rating=?, movie_genre=?, release_year=? where movie_id=?"; 
		
		System.out.println(template.update(query, movie.getMovieName(), movie.getStarCast(), movie.getImdbRating(), movie.getMovieGenre(), movie.getReleaseYear(),id));
		
	}


	public void deleteMovieById(String id) {
	
    String query = "delete from hollywood_movies where movie_id=?";
    
    System.out.println(template.update(query,id));
    
	}
	
	

}
