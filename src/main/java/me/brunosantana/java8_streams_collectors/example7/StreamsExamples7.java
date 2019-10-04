package me.brunosantana.java8_streams_collectors.example7;

import java.util.stream.Collectors;

import java.util.List;
import java.util.Set;

import me.brunosantana.java8_streams_collectors.domain.Movie;
import me.brunosantana.java8_streams_collectors.factories.ListFactory;

public class StreamsExamples7 {

	public static void main(String[] args) {
		
		List<Movie> movieList = ListFactory.getMovieList();
		
		Set<Movie> movieSet = movieList.stream()
			.filter(m -> m.isFeatureFilm())
			.collect(Collectors.toSet());
		
		movieSet.forEach(System.out::println);

	}

}
