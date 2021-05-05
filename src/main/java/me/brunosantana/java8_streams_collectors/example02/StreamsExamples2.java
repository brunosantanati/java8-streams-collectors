package me.brunosantana.java8_streams_collectors.example02;

import java.util.List;

import me.brunosantana.java8_streams_collectors.domain.Movie;
import me.brunosantana.java8_streams_collectors.factories.ListFactory;

public class StreamsExamples2 {

	public static void main(String[] args) {
		
		List<Movie> movieList = ListFactory.getMovieList();

		movieList.stream()
			.filter(m -> m.getRating() > 9)
			.forEach(System.out::println);

	}

}
