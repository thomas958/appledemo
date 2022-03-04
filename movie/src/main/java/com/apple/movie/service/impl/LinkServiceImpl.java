package com.apple.movie.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apple.movie.dao.LinkRepository;
import com.apple.movie.entity.Link;
import com.apple.movie.service.LinkService;

@Service
public class LinkServiceImpl implements LinkService {
	
	@Autowired
	private LinkRepository linkRepository;

	@Override
	public Link findOneLinkByMovieId(Long movieId) {
		return linkRepository.getOne(movieId);
	}

}
