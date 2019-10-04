package me.brunosantana.java8_streams_collectors.example8;

import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

import me.brunosantana.java8_streams_collectors.domain.Movie;
import me.brunosantana.java8_streams_collectors.factories.ListFactory;

public class StreamsExamples8 {

	public static void main(String[] args) {
		
		List<Movie> movieList = ListFactory.getMovieList();
		
		Stream<Double> stream = movieList.stream()
			.map(Movie::getRating);
		
		stream.forEach(System.out::println);
		
		System.out.println("------------------------");
		
		DoubleStream doubleStreams = movieList.stream()
				.mapToDouble(Movie::getRating);
		
		doubleStreams.forEach(System.out::println);

	}

}
