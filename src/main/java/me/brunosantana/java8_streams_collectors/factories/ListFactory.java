package me.brunosantana.java8_streams_collectors.factories;

import java.util.Arrays;
import java.util.List;

import me.brunosantana.java8_streams_collectors.domain.Movie;

public class ListFactory {
	
	public static List<Movie> getMovieList(){
		Movie movie1 = new Movie("John Wick", 8.8, true);
		Movie movie2 = new Movie("Star Wars: O Despertar da Força", 9.5, true);
		Movie movie3 = new Movie("Matrix", 8.5, true);
		Movie movie4 = new Movie("Batman: O Cavaleiro das Trevas", 9.8, true);
		Movie movie5 = new Movie("Cargo", 9.2, false);
		
		return Arrays.asList(movie1, movie2, movie3, movie4, movie5);
	}

}
