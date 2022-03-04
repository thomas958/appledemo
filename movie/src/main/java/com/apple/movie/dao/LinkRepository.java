package com.apple.movie.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apple.movie.entity.Link;

@Repository
public interface LinkRepository extends JpaRepository<Link, Long> {
	
}
