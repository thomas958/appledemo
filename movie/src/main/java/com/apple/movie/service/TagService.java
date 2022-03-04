package com.apple.movie.service;

import java.util.List;

import com.apple.movie.entity.Tag;

public interface TagService {
	List<Tag> findTagByUserId(String userId);
	
	List<Tag> findTagByMovieId(Long movieId);
	
	List<Tag> findTagByTag(String tag);
	
	List<Tag> findTagByUserIdAndMovieIdAndTag(String userId, Long movieId, String tag);
}
