package com.webapp.moviespace.models;

public class Movie {
	
	private int movieId;
	
	private String movieName;
	
	private String starCast;
	
	private String imdbRating;
	
	private int releaseYear;
	
	private String movieGenre;
	
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getStarCast() {
		return starCast;
	}

	public void setStarCast(String starCast) {
		this.starCast = starCast;
	}

	public String getImdbRating() {
		return imdbRating;
	}

	public void setImdbRating(String imdbRating) {
		this.imdbRating = imdbRating;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	public String getMovieGenre() {
		return movieGenre;
	}

	public void setMovieGenre(String movieGenre) {
		this.movieGenre = movieGenre;
	}

	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", starCast=" + starCast + ", imdbRating="
				+ imdbRating + ", releaseYear=" + releaseYear + ", movieGenre=" + movieGenre + "]";
	}
	
	
	
}
