package com.apple.movie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.apple.movie.entity.Movie;
import com.apple.movie.service.MovieService;
import com.apple.movie.vo.MovieRequest;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/movie")
@Api(value = "MOVIE INTERFACE")
public class MovieController {
	
	@Autowired
	private MovieService movieService;
	
	@GetMapping("/all")
	@ApiOperation(value = "getMovies")
	public Page<Movie> getAllMovies(@RequestParam(value = "page", defaultValue = "0") Integer page,
            @RequestParam(value = "size", defaultValue = "10") Integer size) {
		return movieService.findMovieNoCriteria(page, size);
	}
	
	@GetMapping("/all/filter")
	@ApiOperation(value = "getMovies")
	public Page<Movie> getAllMoviesByFilter(@RequestParam(value = "page", defaultValue = "0") Integer page,
            @RequestParam(value = "size", defaultValue = "10") Integer size, MovieRequest movieRequest) {
		return movieService.findMovieCriteria(page, size, movieRequest);
	}
	
	@GetMapping("/{movieId}")
	@ApiOperation(value = "getMovie")
	public Movie getMovie(@PathVariable("movieId") Long movieId) {
		return movieService.findMovieById(movieId);
	}

}
