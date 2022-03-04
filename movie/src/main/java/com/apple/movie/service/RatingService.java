package com.apple.movie.service;

import java.util.List;

import com.apple.movie.entity.Rating;

public interface RatingService {
	
	List<Rating> findRatingByUserId(String userId);
	
	List<Rating> findRatingByMovieId(Long movieId);
	
	List<Rating> findRatingByUserIdAndMovieId(String userId, Long movieId);

}
