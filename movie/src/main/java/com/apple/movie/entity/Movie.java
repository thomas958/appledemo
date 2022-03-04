package com.apple.movie.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="t_movies")
@ApiModel(value = "MOVIE")
@JsonIgnoreProperties(value={"hibernateLazyInitializer","handler","fieldHandler"})
public class Movie implements Serializable {
	
	private static final long serialVersionUID = -6204024971012797599L;

	@Id
    @Column(name="movieid")
	private long movieId;
	
	@Column(name="title",nullable = false)
	private String title;
	
	@Column(name="genres",nullable = false)
	private String genres;
	
}
