package me.brunosantana.java8_streams_collectors.example3;

import java.util.List;

import me.brunosantana.java8_streams_collectors.domain.Movie;
import me.brunosantana.java8_streams_collectors.factories.ListFactory;

public class StreamsExamples3 {
	
	public static void main(String[] args) {
		
		List<Movie> movieList = ListFactory.getMovieList();
		
		movieList.stream()
			.filter(Movie::isFeatureFilm)
			.forEach(System.out::println);
		
	}

}
