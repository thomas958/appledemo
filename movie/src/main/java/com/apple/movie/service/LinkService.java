package com.apple.movie.service;

import com.apple.movie.entity.Link;

public interface LinkService {
	
	Link findOneLinkByMovieId(Long movieId);

}
