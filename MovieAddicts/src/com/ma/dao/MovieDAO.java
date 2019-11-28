package com.ma.dao;

import java.util.List;

import com.ma.model.Movie;

public interface MovieDAO {
   public List<Movie> getAllMoviesByLatest();
   public List<Movie> getAllMoviesByTop();
   public List<Movie> getAllMoviesByPopular();
   public List<Movie> getAllMoviesBySearch(String search);
   public Movie getMovieByID( int movieid );
}