package com.apple.movie.vo;

import java.io.Serializable;
import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class MovieRequest implements Serializable {
	
	private static final long serialVersionUID = -8750694719252367764L;
	
	private Integer pageSize = 10;
	
    private Integer pageNumber = 1;

	private String title;
	
	private String genres;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate startTime;
	
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate endTime;

}
