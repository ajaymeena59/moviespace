package com.webapp.moviespace.controllers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.webapp.moviespace.models.Movie;

import com.webapp.moviespace.services.IMovieService;

@Controller
public class MainController {
	
	private ApplicationContext context = new ClassPathXmlApplicationContext("com/webapp/moviespace/configs/jdbc-config.xml");
	
	IMovieService mService = (IMovieService)context.getBean("myMovieService");
	
	@RequestMapping("/")
	public String getMovies(Model model) {
	  
		model.addAttribute("movies",mService.getAllMovies() );
	   
		return "main";
	}
	
	@RequestMapping("/movie/{id}")
	public String getMovie(@PathVariable String id, Model model) {
		
	   	model.addAttribute("movie", mService.getMovieById(id));
		
		return "movie";
	}
	
	@RequestMapping("/addmovie")
	public String movieFrom() {
		
		return "movieform";
	}
	
	@RequestMapping(path="/addingmovie",method=RequestMethod.POST)
	public String postMovie( @RequestParam("moviename") String movieName,
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
		
		System.out.println(movie);
		
		mService.postOneMovie(movie);
		
		return "postsuccess";
	}
}
