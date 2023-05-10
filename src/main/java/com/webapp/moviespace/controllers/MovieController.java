package com.webapp.moviespace.controllers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.webapp.moviespace.models.Movie;

import com.webapp.moviespace.services.IMovieService;

@Controller
public class MovieController {
	
	private ApplicationContext context = new ClassPathXmlApplicationContext("com/webapp/moviespace/configs/jdbc-config.xml");
	
	IMovieService mService = (IMovieService)context.getBean("myMovieService");
	
	
	// Read all
	@RequestMapping("/")
	public String getAllMovies(Model model) {
	  
		model.addAttribute("movies",mService.getAllMovies() );
	   
		return "main";
	}
	
	
	//Read one
	@RequestMapping("/movie/{id}")
	public String getMovieById(@PathVariable String id, Model model) {
		
	   	model.addAttribute("movie", mService.getMovieById(id));
		
		return "movie";
	}
	
	
	// Create
	@RequestMapping(path="/addingmovie",method=RequestMethod.POST)
	public String addNewMovie( @RequestParam("moviename") String movieName,
			@RequestParam("starcast") String starCast,
			@RequestParam("imdbrating") String imdbRating,
			@RequestParam("releaseyear") int releaseYear,
			@RequestParam("moviegenre") String movieGenre) {
		
		Movie movie = new Movie();
		movie.setMovieName(movieName);
		movie.setStarCast(starCast);
		movie.setImdbRating(imdbRating);
		movie.setReleaseYear(releaseYear);
		movie.setMovieGenre(movieGenre);
		
	//	System.out.println(movie);
		
		mService.addNewMovie(movie);
		
		return "postsuccess";
	}
	
	
	// Put
	@RequestMapping(path="/updatingmovie", method=RequestMethod.POST)
	public String updateMovieById(
			@RequestParam("movieid") int movieId,
			@RequestParam("moviename") String movieName,
			@RequestParam("starcast") String starCast,
			@RequestParam("imdbrating") String imdbRating,
			@RequestParam("releaseyear") int releaseYear,
			@RequestParam("moviegenre") String movieGenre
			) {
		
		Movie movie = new Movie();
		movie.setMovieId(movieId);
		movie.setMovieName(movieName);
		movie.setStarCast(starCast);
		movie.setImdbRating(imdbRating);
		movie.setReleaseYear(releaseYear);
		movie.setMovieGenre(movieGenre);
		
		System.out.println(movie);

		
		mService.updateMovieById(String.valueOf(movieId), movie);
		
		return "putsuccess";
	}
	
	
	// Delete
	@RequestMapping(path="/deletemovie/{id}")
	public String deleteMovieById(@PathVariable String id) {
		
		mService.deleteMovieById(id);
		
		return "deletesuccess";
	}
	
	
	@RequestMapping("/addmovie")
	public String addForm() {
		
		return "addmovieform";
	}
	
	@RequestMapping("/updatemovie/{id}")
	public String updateForm(@PathVariable String id,Model model) {
		
		model.addAttribute("movie",mService.getMovieById(id));
		
		return "updatemovieform";
	}
	
	
}
