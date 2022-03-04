package com.apple.movie.enums;

public enum GenresEnum {
	ACTION("Action"),
	ADVENTURE("Adventure"),
	ANIMATION("Animation"),
	CHILDRENS("Children's"),
	COMEDY("Comedy"),
	CRIME("Crime"),
	DOCUMENTARY("Documentary"),
	DRAMA("Drama"),
	FANTASY("Fantasy"),
	FILMNOIR("Film-Noir"),
	HORROR("Horror"),
	MUSICAL("Musical"),
	MYSTERY("Mystery"),
	ROMANCE("Romance"),
	SCIFI("Sci-Fi"),
	THRILLER("Thriller"),
	WAR("War"),
	WESTERN("Western"),
	OTHERS("no genres listed");
	
	private String description;
	
	private GenresEnum(String name) {
		this.description = name;
	}

	public String getDescription() {
		return description;
	}

}
