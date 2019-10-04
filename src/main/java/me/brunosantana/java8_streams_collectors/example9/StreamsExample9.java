package me.brunosantana.java8_streams_collectors.example9;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import me.brunosantana.java8_streams_collectors.domain.Movie;
import me.brunosantana.java8_streams_collectors.factories.ListFactory;

public class StreamsExample9 {

	public static void main(String[] args) {
		
		List<Movie> movieList = ListFactory.getMovieList();
		
		method1(movieList);
		
		method2(movieList);
		
		method3(movieList);
		
		method4();
		
	}

	private static void method1(List<Movie> movieList) {
		double average = movieList.stream()
			.mapToDouble(Movie::getRating)
			.average()
			.getAsDouble();
		
		System.out.println(average);
	}

	private static void method2(List<Movie> movieList) {
		movieList.stream().
			mapToDouble(Movie::getRating)
			.average()
			.ifPresent(av -> System.out.println(av));
	}
	
	private static void method3(List<Movie> movieList) {
		Movie movie = movieList.stream()
			.max(Comparator.comparingDouble(Movie::getRating))
			.get();
		
		System.out.println("Movie with better rating: " + movie);
	}
	
	private static void method4() {
		List<Movie> movieList = new ArrayList<>();
		
		double average2 = movieList.stream()
				.mapToDouble(Movie::getRating)
				.average()
				.orElse(0.0);
		
		System.out.println(average2);
		
		movieList.stream()
			.mapToDouble(Movie::getRating)
			.average()
			.orElseThrow(IllegalStateException::new);
	}
}
