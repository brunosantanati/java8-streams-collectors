package me.brunosantana.java8_streams_collectors.example01;

import java.util.List;
import java.util.stream.Stream;

import me.brunosantana.java8_streams_collectors.domain.Movie;
import me.brunosantana.java8_streams_collectors.factories.ListFactory;

public class StreamsExamples1 {

	public static void main(String[] args) {
		List<Movie> movieList = ListFactory.getMovieList();
		
		movieList.forEach(System.out::println);
		
		System.out.println("----------------------------");
		
		Stream<Movie> stream = movieList.stream();
		Stream<Movie> filtered = stream.filter(m -> m.getRating() > 9);
		filtered.forEach(System.out::println);
		
		System.out.println("----------------------------");
		
		movieList.forEach(System.out::println);
	}

}
