package com.apple.movie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apple.movie.entity.Link;
import com.apple.movie.service.LinkService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/link")
@Api(value = "LINK INTERFACE")
public class LinkController {
	
	@Autowired
	private LinkService linkService;
	
	@ApiOperation(value = "getMovies")
	@GetMapping("/{movieId}")
	public Link getMovies(@PathVariable Long movieId) {
		return linkService.findOneLinkByMovieId(movieId);
	}

}
