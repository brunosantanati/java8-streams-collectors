package me.brunosantana.java8_streams_collectors.example04;

import java.util.ArrayList;
import java.util.List;

import me.brunosantana.java8_streams_collectors.domain.Movie;
import me.brunosantana.java8_streams_collectors.factories.ListFactory;

public class StreamsExamples4 {

	public static void main(String[] args) {
		
		List<Movie> movieList = ListFactory.getMovieList();
		
		ArrayList<Movie> movieListFiltered = movieList.stream()
			.filter(m -> m.isFeatureFilm())
			.collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
		
		movieListFiltered.forEach(System.out::println);
	}

}
