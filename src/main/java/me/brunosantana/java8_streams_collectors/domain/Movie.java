package me.brunosantana.java8_streams_collectors.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Movie {

	private String title;
	private double rating;
	private boolean featureFilm; //longa-metragem
	
}
