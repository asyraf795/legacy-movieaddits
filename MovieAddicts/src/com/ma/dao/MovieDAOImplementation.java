package com.ma.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ma.model.Movie;
import com.ma.util.DBUtil;

public class MovieDAOImplementation implements MovieDAO{
	
	
	private Connection connection;
	
	public MovieDAOImplementation() {
		
		connection = DBUtil.getConnection();
		
	
	}

	   @Override	
	public List<Movie> getAllMoviesByLatest() {
		List <Movie> movies = new ArrayList<Movie>();
		try {
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery("Select * from movies order by moviereleasedate DESC");
			while (rs.next()) {
				Movie movie = new Movie();
				movie.setMovieid(rs.getInt("movieid"));
				movie.setMoviename(rs.getString("moviename"));
				movie.setMoviegenre(rs.getString("moviegenre"));
				movie.setMovieactors(rs.getString("movieactors"));
				movie.setMovieimagelocation(rs.getString("movieimagelocation"));
				movie.setMoviedescription(rs.getString("moviedescription"));
				movie.setMoviereleasedate(rs.getDate("moviereleasedate"));
				movie.setMovierating(rs.getInt("movierating"));
				movie.setMoviequantity(rs.getInt("moviequantity"));
				movies.add(movie);
			}
			rs.close();
			statement.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return movies;
	}
	
	
	   @Override	
	public List<Movie> getAllMoviesByTop() {
		List <Movie> movies = new ArrayList<Movie>();
		try {
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery("Select * from movies order by movierating DESC");
			while (rs.next()) {
				Movie movie = new Movie();
				movie.setMovieid(rs.getInt("movieid"));
				movie.setMoviename(rs.getString("moviename"));
				movie.setMoviegenre(rs.getString("moviegenre"));
				movie.setMovieactors(rs.getString("movieactors"));
				movie.setMovieimagelocation(rs.getString("movieimagelocation"));
				movie.setMoviedescription(rs.getString("moviedescription"));
				movie.setMoviereleasedate(rs.getDate("moviereleasedate"));
				movie.setMovierating(rs.getInt("movierating"));
				movie.setMoviequantity(rs.getInt("moviequantity"));
				movies.add(movie);
			}
			rs.close();
			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return movies;
	}
	
	   @Override	
	public List<Movie> getAllMoviesByPopular() {
		List <Movie> movies = new ArrayList<Movie>();
		try {
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery("SELECT * FROM movies ORDER BY Year(moviereleasedate) DESC, movierating DESC");
			while (rs.next()) {
				Movie movie = new Movie();
				movie.setMovieid(rs.getInt("movieid"));
				movie.setMoviename(rs.getString("moviename"));
				movie.setMoviegenre(rs.getString("moviegenre"));
				movie.setMovieactors(rs.getString("movieactors"));
				movie.setMovieimagelocation(rs.getString("movieimagelocation"));
				movie.setMoviedescription(rs.getString("moviedescription"));
				movie.setMoviereleasedate(rs.getDate("moviereleasedate"));
				movie.setMovierating(rs.getInt("movierating"));
				movie.setMoviequantity(rs.getInt("moviequantity"));
				movies.add(movie);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return movies;
	}
	   @Override	
	public List<Movie> getAllMoviesBySearch(String search) {
		List <Movie> movies = new ArrayList<Movie>();
		try {
			PreparedStatement preparedStatement  = connection.prepareStatement("SELECT * FROM movies WHERE moviename LIKE ? OR moviegenre LIKE ? or movieactors LIKE ? or moviedescription LIKE ? order by moviereleasedate DESC");
			preparedStatement.setString(1,"%"+search+"%" );
			preparedStatement.setString(2, "%"+search+"%");
			preparedStatement.setString(3,"%"+search+"%" );
			preparedStatement.setString(4,"%"+search+"%" );
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				Movie movie = new Movie();
				movie.setMovieid(rs.getInt("movieid"));
				movie.setMoviename(rs.getString("moviename"));
				movie.setMoviegenre(rs.getString("moviegenre"));
				movie.setMovieactors(rs.getString("movieactors"));
				movie.setMovieimagelocation(rs.getString("movieimagelocation"));
				movie.setMoviedescription(rs.getString("moviedescription"));
				movie.setMoviereleasedate(rs.getDate("moviereleasedate"));
				movie.setMovierating(rs.getInt("movierating"));
				movie.setMoviequantity(rs.getInt("moviequantity"));
				movies.add(movie);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return movies;
	}
	   @Override	
	public Movie getMovieByID(int movieid) {
		Movie movie = new Movie();
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement("select * from movies where movieid = ?");
			preparedStatement.setInt(1, movieid);
			ResultSet rs = preparedStatement.executeQuery();
			
			if (rs.next()) {
				movie.setMovieid(rs.getInt("movieid"));
				movie.setMoviename(rs.getString("moviename"));
				movie.setMoviegenre(rs.getString("moviegenre"));
				movie.setMovieactors(rs.getString("movieactors"));
				movie.setMovieimagelocation(rs.getString("movieimagelocation"));
				movie.setMoviedescription(rs.getString("moviedescription"));
				movie.setMoviereleasedate(rs.getDate("moviereleasedate"));
				movie.setMovierating(rs.getInt("movierating"));
				movie.setMoviequantity(rs.getInt("moviequantity"));
				
				
			}
			rs.close();
			preparedStatement.close();
		} catch (SQLException e) {
				e.printStackTrace();
			}
			
			return movie;
		
		
	}
	
}
