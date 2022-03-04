package com.apple.movie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apple.movie.entity.Tag;
import com.apple.movie.service.TagService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/tag")
@Api(value = "TAG INTERFACE")
public class TagController {
	@Autowired
	private TagService tagService;

	@GetMapping("/{userId}/{movieId}/{tag}")
	@ApiOperation(value = "getTags")
	public List<Tag> getTags(@PathVariable("userId") String userId, @PathVariable("movieId") Long movieId,
			@PathVariable("tag") String tag) {
		return tagService.findTagByUserIdAndMovieIdAndTag(userId, movieId, tag);
	}

	@GetMapping("/user/{userId}")
	@ApiOperation(value = "getTagsWithUserId")
	public List<Tag> getTagsWithUserId(@PathVariable("userId") String userId) {
		return tagService.findTagByUserId(userId);
	}

	@GetMapping("/movie/{movieId}")
	@ApiOperation(value = "getTagsWithMovieId")
	public List<Tag> getTagsWithMovieId(@PathVariable("movieId") Long movieId) {
		return tagService.findTagByMovieId(movieId);
	}

	@GetMapping("/tag/{tag}")
	@ApiOperation(value = "getTagsWithTag")
	public List<Tag> getTagsWithTag(@PathVariable("tag") String tag) {
		return tagService.findTagByTag(tag);
	}
}
