<%@ page import="com.webapp.moviespace.models.Movie" language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update movie form</title>
</head>
<body>

     <%  Movie movie = (Movie)request.getAttribute("movie"); %>
    
    <ul>
        <li> <%= movie.getMovieId() %></li>
         <li> <%= movie.getMovieName() %></li>
          <li> <%= movie.getReleaseYear() %></li>
           <li> <%= movie.getStarCast() %></li>
            <li> <%= movie.getImdbRating() %></li>
             <li> <%= movie.getMovieGenre() %></li>
    </ul>

    <form method="post" action="./../updatingmovie" > 
   <fieldset>
   <legend>Enter movie's new details below: </legend>
   
   <input type="hidden" name="movieid" value=<%= movie.getMovieId() %> />
   
   <label for="moviename" > Movie name: </label> <br/>
   <input type="text" id="moviename" name="moviename" placeholder="Movie name here" required> <br><br>
   
   <label for="starcast" >Star cast:</label> <br>
   <input type="text" id="starcast" name="starcast" placeholder="Star casts here" > <br><br>
   
   <label for="imdbrating" >IMDB rating:</label><br>
   <input type="text" id="imdbrating" name="imdbrating" placeholder="IMDB rating here" ><br>
   
   <label for="releaseyear" ></label><br>
   <input type="number" id="releaseyear" name="releaseyear" placeholder="Release year here" ><br><br>
   
   <label for="moviegenre" >Movie Genre:</label><br>
   <input type="text" id="moviegenre" name="moviegenre" placeholder="Movie genre here"><br><br>
   
   <input type="submit" value="Update" >
   
   
   </fieldset>

</form>


</body>
</html>