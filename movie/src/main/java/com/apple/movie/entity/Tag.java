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

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@IdClass(value = TagIds.class)
@Table(name="t_tags")
@ApiModel(value = "TAG")
@JsonIgnoreProperties(value={"hibernateLazyInitializer","handler","fieldHandler"})
public class Tag implements Serializable {
	
	private static final long serialVersionUID = -377444147845308093L;

	@Id
	@Column(name="userid")
	private String userId;

	@Id
	@Column(name="movieid")
	private long movieId;

	@Id
	@Column(name="tag")
	private String tag;
	
	@Column(name="timestamp",nullable = false)
	private Long timestamp;
	
}
