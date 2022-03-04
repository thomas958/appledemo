package com.apple.movie.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
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
@IdClass(value = RatingIds.class)
@Table(name="t_ratings")
@ApiModel(value = "RATING")
@JsonIgnoreProperties(value={"hibernateLazyInitializer","handler","fieldHandler"})
public class Rating implements Serializable {
	
	private static final long serialVersionUID = 2852161777312716225L;

	@Id
	@Column(name="userid")
	private String userId;
	
	@Id
	@Column(name="movieid")
	private long movieId;
	
	@Column(name="rating",nullable = false)
	private String rating;
	
	@Column(name="timestamp",nullable = false)
	private Long timestamp;
	
}
