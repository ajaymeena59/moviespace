<%@ page import="java.util.List,com.webapp.moviespace.models.Movie" language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>

<!DOCTYPE html>
<html>
<head>
  <title>Movie Space</title>
</head>
<body>
<h2>This is world of MovieSpace</h2>

<%
     List<Movie> myMovies = (List<Movie>)request.getAttribute("movies");
%>

<ol>

<% for(Movie movie : myMovies){ %>

<li>

<h5> <%= movie.getMovieName() %> </h5>

<h6> <%= movie.getReleaseYear() %> </h6>

<h6> <%= movie.getStarCast() %> </h6>

<h6> <%= movie.getImdbRating() %> </h6>

<h6> <%= movie.getMovieGenre() %> </h6>

</li>

<% } %>

</ol>

</body>
</html>
