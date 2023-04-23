package com.webapp.moviespace.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import com.webapp.moviespace.models.Movie;

public class MovieRowMapper implements RowMapper<Movie> {

	public Movie mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Movie movie = new Movie();
		
		movie.setMovieId(rs.getInt("movie_id"));
		movie.setMovieName(rs.getString("movie_name"));
		movie.setImdbRating(rs.getString("imdb_rating"));
		movie.setReleaseYear(rs.getInt("release_year"));
		movie.setStarCast(rs.getString("star_cast"));
		movie.setMovieGenre(rs.getString("movie_genre"));
		return movie;
	}

}
