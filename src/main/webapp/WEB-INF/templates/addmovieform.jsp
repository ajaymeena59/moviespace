<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add movie form</title>
</head>
<body>

<h1>Hello Add movie</h1>

<form method="post" action="addingmovie" > 
   <fieldset>
   <legend>Enter movie details below: </legend>
   
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
   
   <input type="submit" value="Add" >
   
   
   </fieldset>

</form>

</body>
</html>