package com.apple.movie.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apple.movie.dao.TagRepository;
import com.apple.movie.entity.Tag;
import com.apple.movie.service.TagService;

@Service
public class TagServiceImpl implements TagService{
	
	@Autowired
	private TagRepository tagRepository;
	
	@Override
	public List<Tag> findTagByUserId(String userId) {
		return tagRepository.findByUserId(userId);
	}

	@Override
	public List<Tag> findTagByMovieId(Long movieId) {
		return tagRepository.findByMovieId(movieId);
	}

	@Override
	public List<Tag> findTagByTag(String tag) {
		return tagRepository.findByTag(tag);
	}

	@Override
	public List<Tag> findTagByUserIdAndMovieIdAndTag(String userId, Long movieId, String tag) {
		return tagRepository.findByUserIdAndMovieIdAndTag(userId, movieId, tag);
	}

}
