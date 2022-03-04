package com.apple.movie.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apple.movie.dao.RatingRepository;
import com.apple.movie.entity.Rating;
import com.apple.movie.service.RatingService;

@Service
public class RatingServiceImpl implements RatingService {
	
	@Autowired
	private RatingRepository ratingRepository;

	@Override
	public List<Rating> findRatingByUserIdAndMovieId(String userId, Long movieId) {
		return ratingRepository.findByUserIdAndMovieId(userId, movieId);
	}

	@Override
	public List<Rating> findRatingByUserId(String userId) {
		return ratingRepository.findByUserId(userId);
	}

	@Override
	public List<Rating> findRatingByMovieId(Long movieId) {
		return ratingRepository.findByMovieId(movieId);
	}

}
