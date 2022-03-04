package com.apple.movie.entity;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "TAGIDS")
public class TagIds implements Serializable {

	private static final long serialVersionUID = 8949820395051827175L;

	private String userId;

	private Long movieId;
	
	private String tag;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		result = prime * result + ((movieId == null) ? 0 : movieId.hashCode());
		result = prime * result + ((tag == null) ? 0 : tag.hashCode());
		return result;
	}

	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}
		if (object == null) {
			return false;
		}
		if (getClass() != object.getClass()) {
			return false;
		}
		final TagIds otheRatingIds = (TagIds) object;
		if (userId == null) {
			if (otheRatingIds.userId != null) {
				return false;
			}
		} else if (userId.equals(otheRatingIds.userId)) {
			return false;
		}

		if (movieId == null) {
			if (otheRatingIds.movieId != null) {
				return false;
			}
		} else if (movieId.equals(otheRatingIds.movieId)) {
			return false;
		}
		
		if (tag == null) {
			if (otheRatingIds.tag != null) {
				return false;
			}
		} else if (tag.equals(otheRatingIds.tag)) {
			return false;
		}
		return true;
	}

}
