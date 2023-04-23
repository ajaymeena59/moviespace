<%@ page import="com.webapp.moviespace.models.Movie" language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Movie</title>
</head>
<body>
    
    <%  Movie movie = (Movie)request.getAttribute("movie"); %>
    
    <ul>
         <li> <%= movie.getMovieName() %></li>
          <li> <%= movie.getReleaseYear() %></li>
           <li> <%= movie.getStarCast() %></li>
            <li> <%= movie.getImdbRating() %></li>
             <li> <%= movie.getMovieGenre() %></li>
    </ul>
    
</body>
</html>