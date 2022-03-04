package com.apple.movie.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.apple.movie.dao.MovieRepository;
import com.apple.movie.entity.Movie;
import com.apple.movie.service.MovieService;
import com.apple.movie.vo.MovieRequest;

@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	private MovieRepository movieRepository;

	@Override
	public Page<Movie> findMovieNoCriteria(Integer page, Integer size) {
		Pageable pageable = PageRequest.of(page, size, Sort.Direction.ASC, "movieId");
		return movieRepository.findAll(pageable);
	}

	@Override
	public Page<Movie> findMovieCriteria(Integer page, Integer size, MovieRequest movieRequest) {
		Pageable pageable = PageRequest.of(page, size, Sort.Direction.ASC, "movieId");
		Page<Movie> bookPage = movieRepository.findAll(new Specification<Movie>() {
			private static final long serialVersionUID = 6094956085004421621L;

			@Override
			public Predicate toPredicate(Root<Movie> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
				List<Predicate> list = new ArrayList<Predicate>();
				if (null != movieRequest.getTitle() && !"".equals(movieRequest.getTitle())) {
					list.add(criteriaBuilder.like(root.get("title").as(String.class), movieRequest.getTitle()));
				}
				if (null != movieRequest.getGenres() && !"".equals(movieRequest.getGenres())) {
					list.add(criteriaBuilder.like(root.get("genres").as(String.class), movieRequest.getGenres()));
				}
				Predicate[] p = new Predicate[list.size()];
				return criteriaBuilder.and(list.toArray(p));
			}
		}, pageable);
		return bookPage;
	}
	
	@Override
	public Movie findMovieById(Long movieId) {
		return movieRepository.findById(movieId).get();
	}
	
}
