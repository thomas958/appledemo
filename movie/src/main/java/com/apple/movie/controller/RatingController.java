package com.apple.movie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apple.movie.entity.Rating;
import com.apple.movie.service.RatingService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/rating")
@Api(value = "RATING INTERFACE")
public class RatingController {
	@Autowired
	private RatingService ratingService;

	@GetMapping("/{userId}/{movieId}")
	@ApiOperation(value = "getRating")
	public List<Rating> getRating(@PathVariable("userId") String userId, @PathVariable("movieId") Long movieId) {
		return ratingService.findRatingByUserIdAndMovieId(userId, movieId);
	}

	@GetMapping("/user/{userId}")
	@ApiOperation(value = "getMoviesByUserId")
	public List<Rating> getMoviesByUserId(@PathVariable("userId") String userId) {
		return ratingService.findRatingByUserId(userId);
	}

	@GetMapping("/movie/{movieId}")
	@ApiOperation(value = "getMoviesByMovieId")
	public List<Rating> getMoviesByMovieId(@PathVariable("movieId") Long movieId) {
		return ratingService.findRatingByMovieId(movieId);
	}
}
