package com.apple.movie.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apple.movie.entity.Tag;
import com.apple.movie.entity.TagIds;

@Repository
public interface TagRepository extends JpaRepository<Tag, TagIds> {
	List<Tag> findByUserId(String userId);
	
	List<Tag> findByMovieId(Long movieId);
	
	List<Tag> findByTag(String tag);
	
	List<Tag> findByUserIdAndMovieIdAndTag(String userId, Long movieId, String tag);
}
