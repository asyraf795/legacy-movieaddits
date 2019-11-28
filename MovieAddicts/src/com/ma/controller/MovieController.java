package com.ma.controller;



import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

//import java.text.ParseException;

//import java.text.SimpleDateFormat;

//import java.util.Date;



import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import com.ma.dao.MovieDAO;
import com.ma.dao.MovieDAOImplementation;
import com.ma.model.Movie;


@WebServlet("/MovieController")
public class MovieController extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private MovieDAO dao;
    public static String LIST_OF_MOVIES = "/listOfMovies.jsp";
    public static String MOVIE = "/movie.jsp";


    public MovieController() {

        super();

        dao = new MovieDAOImplementation();

    }



    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String forward="";

        String action = request.getParameter("action");



        if (action.equalsIgnoreCase("latestMovies")){

            forward = LIST_OF_MOVIES;

            request.setAttribute("movies", dao.getAllMoviesByLatest());

        } else if (action.equalsIgnoreCase("topMovies")){

            forward = LIST_OF_MOVIES;

            request.setAttribute("movies", dao.getAllMoviesByTop());

        } else if (action.equalsIgnoreCase("popularMovies")){

            forward = LIST_OF_MOVIES;

            request.setAttribute("movies", dao.getAllMoviesByPopular());

        } else if (action.equalsIgnoreCase("searchMovies")){

            forward = LIST_OF_MOVIES;

            request.setAttribute("movies", dao.getAllMoviesBySearch(request.getParameter( "moviesearch" )));

        } else if( action.equalsIgnoreCase( "movie" ) ) {
            forward = MOVIE;
            int movieid = Integer.parseInt( request.getParameter("movieid") );
            Movie movie = dao.getMovieByID(movieid);
            request.setAttribute("movie", movie);
        } else {

            forward = LIST_OF_MOVIES;
            request.setAttribute("movies", dao.getAllMoviesByLatest());

        }



        RequestDispatcher view = request.getRequestDispatcher(forward);

        view.forward(request, response);

    }



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Movie movie = new Movie();
        movie.setMoviename( request.getParameter( "moviename" ) );
        movie.setMoviegenre( request.getParameter( "moviegenre" ) );
        movie.setMovieactors( request.getParameter( "movieactors" ) );
        movie.setMoviedescription( request.getParameter( "moviedescription" ) );
        
        try {
        	 movie.setMoviereleasedate(new SimpleDateFormat("MM/dd/yyyy").parse(request.getParameter("moviereleasedate")));
        } catch (ParseException e) {
        	 // TODO Auto-generated catch block
        	 e.printStackTrace();
        }     
        movie.setMoviequantity(Integer.parseInt(request.getParameter( "moviequantity" )) );
        movie.setMovierating(Integer.parseInt(request.getParameter( "movieRating" )) );

        //String movieid = request.getParameter("movieid");
 
  
        RequestDispatcher view = request.getRequestDispatcher( LIST_OF_MOVIES );
        request.setAttribute("movies", dao.getAllMoviesByLatest());
        view.forward(request, response);


    }

}