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
@Table(name="t_links")
@ApiModel(value = "LINK")
@JsonIgnoreProperties(value={"hibernateLazyInitializer","handler","fieldHandler"})
public class Link implements Serializable {

	private static final long serialVersionUID = -4916486991089373099L;

	@Id
    @Column(name="movieid")
	private long movieId;

	@Column(name="imdbid",nullable = false)
	private String imdbId;

	@Column(name="tmdbid",nullable = false)
	private String tmdbId;

}
