package com.apple.movie.service;

import org.springframework.data.domain.Page;

import com.apple.movie.entity.Movie;
import com.apple.movie.vo.MovieRequest;

public interface MovieService {

	Page<Movie> findMovieNoCriteria(Integer page, Integer size);

	Page<Movie> findMovieCriteria(Integer page, Integer size, MovieRequest movieRequest);
	
	Movie findMovieById(Long movieId);

}
