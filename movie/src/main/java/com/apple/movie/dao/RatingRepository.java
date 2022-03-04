package com.apple.movie.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apple.movie.entity.Rating;
import com.apple.movie.entity.RatingIds;

@Repository
public interface RatingRepository extends JpaRepository<Rating, RatingIds> {
	
	List<Rating> findByUserId(String userId);
	
	List<Rating> findByMovieId(Long movieId);
	
	List<Rating> findByUserIdAndMovieId(String userId, Long movieId);

}
