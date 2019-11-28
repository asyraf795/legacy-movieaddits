package com.ma.model;
//import java.awt.image.BufferedImage;
import java.util.Date;

public class Movie {
	private int movieid;
	private String moviename;
	private String moviegenre;
	private String movieactors;
	private String movieimagelocation;
	private String moviedescription;
	private Date moviereleasedate;
	private int movierating;
	private int moviequantity;
	
	public int getMovieid() {
return movieid;	
	}
	public String getMoviename() {
		return moviename;	
	}
	public String getMoviegenre() {
		return moviegenre;	
	}
	public String getMovieactors() {
		return movieactors;	
	}
	public String getMovieimagelocation() {
		return movieimagelocation;	
	}
	public String getMoviedescription() {
		return moviedescription;	
	}
	public Date getMoviereleasedate() {
		return moviereleasedate;	
	}
	public int getMovierating() {
		return movierating;	
	}
	public int getMoviequantity() {
		return moviequantity;	
	}
	
	
	public void setMovieid(int movieid) {
		this.movieid = movieid;	
	}
	public void setMoviename(String moviename) {
		this.moviename = moviename;	
	}
	public void setMoviegenre(String moviegenre) {
		this.moviegenre = moviegenre;	
	}
	public void setMovieactors(String movieactors) {
		this.movieactors=movieactors;	
	}
	public void setMovieimagelocation(String movieimagelocation) {
		this.movieimagelocation = movieimagelocation;	
	}
	public void setMoviedescription(String moviedescription) {
		this.moviedescription = moviedescription;	
	}
	public void setMoviereleasedate(Date moviereleasedate) {
		this.moviereleasedate = moviereleasedate;	
	}
	public void setMovierating(int movierating) {
		this.movierating = movierating;	
	}
	public void setMoviequantity(int moviequantity) {
		this.moviequantity = moviequantity;	
	}
	
    @Override

    public String toString() {
    	return "Movie [movieid=" + movieid + ", moviename=" + moviename + ", moviegenre=" + moviegenre + ", movieactors=" + movieactors + ", movieimagelocation=" + movieimagelocation + ", moviedescription=" + moviedescription + ", moviereleasedate=" + moviereleasedate + ", movierating =" + movierating + ", moviequantity=" + moviequantity + "]";
    	
    	
    	
    	
    }
	
	
}
