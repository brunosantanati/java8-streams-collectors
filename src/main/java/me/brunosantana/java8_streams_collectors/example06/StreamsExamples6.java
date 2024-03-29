package me.brunosantana.java8_streams_collectors.example06;

import java.util.List;
import static java.util.stream.Collectors.*;

import me.brunosantana.java8_streams_collectors.domain.Movie;
import me.brunosantana.java8_streams_collectors.factories.ListFactory;

public class StreamsExamples6 {

	public static void main(String[] args) {
		
		List<Movie> movieList = ListFactory.getMovieList();
		
		List<Movie> movieListFiltered = movieList.stream()
			.filter(m -> m.isFeatureFilm())
			.collect(toList());
		
		movieListFiltered.forEach(System.out::println);
		
	}	
	
}
